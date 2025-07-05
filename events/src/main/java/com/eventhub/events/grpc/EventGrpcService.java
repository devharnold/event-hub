package com.eventhub.events.grpc;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import com.eventhub.events.model.Event;
import com.eventhub.events.service.EventService;
import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;

@GrpcService
public class EventGrpcService extends com.eventhub.events.grpc.EventServiceGrpc.EventServiceImplBase {

    private final EventService eventService;

    @Autowired
    public EventGrpcService(EventService eventService) {
        this.eventService = eventService;
    }
    private final DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;

    @Override
    public void createEvent(CreateEventRequest request, StreamObserver<CreateEventResponse> responseObserver) {
        Event newEvent = new Event(null, request.getEventName(), request.getEventOrganizer(),
                LocalDateTime.parse(request.getEventDuration(), formatter));
        eventService.createEvent(newEvent);
        CreateEventResponse response = CreateEventResponse.newBuilder()
                .setEventId(newEvent.getEventId())
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void GetEventById(EventRequest request, StreamObserver<EventProto.Event> responseObserver) {
        Event event = eventService.getEventById(request.getEventById());
        if (event != null) {
            EventProto.Event response = EventProto.Event.newBuilder()
                    .setEventId(event.getEventId())
                    .setEventName(event.getEventName())
                    .setEventOrganizer(event.getEventOrganizer())
                    .setEventDuration(event.getEventDuration().format(formatter))
                    .build();
            responseObserver.onNext(response);
        }
        responseObserver.onCompleted();
    }

    @Override
    public void GetAllEvents(Empty request, StreamObserver<EventList> responseObserver) {
        EventList.Builder eventListBuilder = EventList.newBuilder();
        for (Event event : eventService.getAllEvents()) {
            eventListBuilder.addEvents(
                    EventProto.Event.newBuilder()
                            .setEventId(event.getEventId())
                            .setEventName(event.getEventName())
                            .setEventOrganizer(event.getEventOrganizer())
                            .setEventDuration(event.getEventDuration().format(formatter))
                            .build()
            );
        }
        responseObserver.onNext(eventListBuilder.build());
        responseObserver.onCompleted();
    }

}
