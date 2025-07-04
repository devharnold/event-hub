// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: event.proto

// Protobuf Java Version: 3.25.1
package com.eventhub.events.grpc.;

/**
 * Protobuf type {@code eventhub.Event}
 */
public final class Event extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:eventhub.Event)
    EventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Event.newBuilder() to construct.
  private Event(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Event() {
    eventId_ = "";
    eventName_ = "";
    eventOrganizer_ = "";
    eventDuration_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Event();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.eventhub.events.grpc..EventProto.internal_static_eventhub_Event_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.eventhub.events.grpc..EventProto.internal_static_eventhub_Event_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.eventhub.events.grpc..Event.class, com.eventhub.events.grpc..Event.Builder.class);
  }

  public static final int EVENT_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object eventId_ = "";
  /**
   * <code>string event_id = 1;</code>
   * @return The eventId.
   */
  @java.lang.Override
  public java.lang.String getEventId() {
    java.lang.Object ref = eventId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      eventId_ = s;
      return s;
    }
  }
  /**
   * <code>string event_id = 1;</code>
   * @return The bytes for eventId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEventIdBytes() {
    java.lang.Object ref = eventId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      eventId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EVENT_NAME_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object eventName_ = "";
  /**
   * <code>string event_name = 2;</code>
   * @return The eventName.
   */
  @java.lang.Override
  public java.lang.String getEventName() {
    java.lang.Object ref = eventName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      eventName_ = s;
      return s;
    }
  }
  /**
   * <code>string event_name = 2;</code>
   * @return The bytes for eventName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEventNameBytes() {
    java.lang.Object ref = eventName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      eventName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EVENT_ORGANIZER_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object eventOrganizer_ = "";
  /**
   * <code>string event_organizer = 3;</code>
   * @return The eventOrganizer.
   */
  @java.lang.Override
  public java.lang.String getEventOrganizer() {
    java.lang.Object ref = eventOrganizer_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      eventOrganizer_ = s;
      return s;
    }
  }
  /**
   * <code>string event_organizer = 3;</code>
   * @return The bytes for eventOrganizer.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEventOrganizerBytes() {
    java.lang.Object ref = eventOrganizer_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      eventOrganizer_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EVENT_DURATION_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object eventDuration_ = "";
  /**
   * <pre>
   *ISO 8601 string format
   * </pre>
   *
   * <code>string event_duration = 4;</code>
   * @return The eventDuration.
   */
  @java.lang.Override
  public java.lang.String getEventDuration() {
    java.lang.Object ref = eventDuration_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      eventDuration_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *ISO 8601 string format
   * </pre>
   *
   * <code>string event_duration = 4;</code>
   * @return The bytes for eventDuration.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEventDurationBytes() {
    java.lang.Object ref = eventDuration_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      eventDuration_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(eventId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, eventId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(eventName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, eventName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(eventOrganizer_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, eventOrganizer_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(eventDuration_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, eventDuration_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(eventId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, eventId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(eventName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, eventName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(eventOrganizer_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, eventOrganizer_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(eventDuration_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, eventDuration_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.eventhub.events.grpc..Event)) {
      return super.equals(obj);
    }
    com.eventhub.events.grpc..Event other = (com.eventhub.events.grpc..Event) obj;

    if (!getEventId()
        .equals(other.getEventId())) return false;
    if (!getEventName()
        .equals(other.getEventName())) return false;
    if (!getEventOrganizer()
        .equals(other.getEventOrganizer())) return false;
    if (!getEventDuration()
        .equals(other.getEventDuration())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + EVENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getEventId().hashCode();
    hash = (37 * hash) + EVENT_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getEventName().hashCode();
    hash = (37 * hash) + EVENT_ORGANIZER_FIELD_NUMBER;
    hash = (53 * hash) + getEventOrganizer().hashCode();
    hash = (37 * hash) + EVENT_DURATION_FIELD_NUMBER;
    hash = (53 * hash) + getEventDuration().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.eventhub.events.grpc..Event parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.eventhub.events.grpc..Event parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.eventhub.events.grpc..Event parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.eventhub.events.grpc..Event parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.eventhub.events.grpc..Event parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.eventhub.events.grpc..Event parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.eventhub.events.grpc..Event parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.eventhub.events.grpc..Event parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.eventhub.events.grpc..Event parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.eventhub.events.grpc..Event parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.eventhub.events.grpc..Event parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.eventhub.events.grpc..Event parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.eventhub.events.grpc..Event prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code eventhub.Event}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:eventhub.Event)
      com.eventhub.events.grpc..EventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.eventhub.events.grpc..EventProto.internal_static_eventhub_Event_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.eventhub.events.grpc..EventProto.internal_static_eventhub_Event_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.eventhub.events.grpc..Event.class, com.eventhub.events.grpc..Event.Builder.class);
    }

    // Construct using com.eventhub.events.grpc..Event.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      eventId_ = "";
      eventName_ = "";
      eventOrganizer_ = "";
      eventDuration_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.eventhub.events.grpc..EventProto.internal_static_eventhub_Event_descriptor;
    }

    @java.lang.Override
    public com.eventhub.events.grpc..Event getDefaultInstanceForType() {
      return com.eventhub.events.grpc..Event.getDefaultInstance();
    }

    @java.lang.Override
    public com.eventhub.events.grpc..Event build() {
      com.eventhub.events.grpc..Event result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.eventhub.events.grpc..Event buildPartial() {
      com.eventhub.events.grpc..Event result = new com.eventhub.events.grpc..Event(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.eventhub.events.grpc..Event result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.eventId_ = eventId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.eventName_ = eventName_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.eventOrganizer_ = eventOrganizer_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.eventDuration_ = eventDuration_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.eventhub.events.grpc..Event) {
        return mergeFrom((com.eventhub.events.grpc..Event)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.eventhub.events.grpc..Event other) {
      if (other == com.eventhub.events.grpc..Event.getDefaultInstance()) return this;
      if (!other.getEventId().isEmpty()) {
        eventId_ = other.eventId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getEventName().isEmpty()) {
        eventName_ = other.eventName_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getEventOrganizer().isEmpty()) {
        eventOrganizer_ = other.eventOrganizer_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getEventDuration().isEmpty()) {
        eventDuration_ = other.eventDuration_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              eventId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              eventName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              eventOrganizer_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              eventDuration_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object eventId_ = "";
    /**
     * <code>string event_id = 1;</code>
     * @return The eventId.
     */
    public java.lang.String getEventId() {
      java.lang.Object ref = eventId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        eventId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string event_id = 1;</code>
     * @return The bytes for eventId.
     */
    public com.google.protobuf.ByteString
        getEventIdBytes() {
      java.lang.Object ref = eventId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        eventId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string event_id = 1;</code>
     * @param value The eventId to set.
     * @return This builder for chaining.
     */
    public Builder setEventId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      eventId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string event_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEventId() {
      eventId_ = getDefaultInstance().getEventId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string event_id = 1;</code>
     * @param value The bytes for eventId to set.
     * @return This builder for chaining.
     */
    public Builder setEventIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      eventId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object eventName_ = "";
    /**
     * <code>string event_name = 2;</code>
     * @return The eventName.
     */
    public java.lang.String getEventName() {
      java.lang.Object ref = eventName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        eventName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string event_name = 2;</code>
     * @return The bytes for eventName.
     */
    public com.google.protobuf.ByteString
        getEventNameBytes() {
      java.lang.Object ref = eventName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        eventName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string event_name = 2;</code>
     * @param value The eventName to set.
     * @return This builder for chaining.
     */
    public Builder setEventName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      eventName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string event_name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEventName() {
      eventName_ = getDefaultInstance().getEventName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string event_name = 2;</code>
     * @param value The bytes for eventName to set.
     * @return This builder for chaining.
     */
    public Builder setEventNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      eventName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object eventOrganizer_ = "";
    /**
     * <code>string event_organizer = 3;</code>
     * @return The eventOrganizer.
     */
    public java.lang.String getEventOrganizer() {
      java.lang.Object ref = eventOrganizer_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        eventOrganizer_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string event_organizer = 3;</code>
     * @return The bytes for eventOrganizer.
     */
    public com.google.protobuf.ByteString
        getEventOrganizerBytes() {
      java.lang.Object ref = eventOrganizer_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        eventOrganizer_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string event_organizer = 3;</code>
     * @param value The eventOrganizer to set.
     * @return This builder for chaining.
     */
    public Builder setEventOrganizer(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      eventOrganizer_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string event_organizer = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearEventOrganizer() {
      eventOrganizer_ = getDefaultInstance().getEventOrganizer();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string event_organizer = 3;</code>
     * @param value The bytes for eventOrganizer to set.
     * @return This builder for chaining.
     */
    public Builder setEventOrganizerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      eventOrganizer_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object eventDuration_ = "";
    /**
     * <pre>
     *ISO 8601 string format
     * </pre>
     *
     * <code>string event_duration = 4;</code>
     * @return The eventDuration.
     */
    public java.lang.String getEventDuration() {
      java.lang.Object ref = eventDuration_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        eventDuration_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *ISO 8601 string format
     * </pre>
     *
     * <code>string event_duration = 4;</code>
     * @return The bytes for eventDuration.
     */
    public com.google.protobuf.ByteString
        getEventDurationBytes() {
      java.lang.Object ref = eventDuration_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        eventDuration_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *ISO 8601 string format
     * </pre>
     *
     * <code>string event_duration = 4;</code>
     * @param value The eventDuration to set.
     * @return This builder for chaining.
     */
    public Builder setEventDuration(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      eventDuration_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *ISO 8601 string format
     * </pre>
     *
     * <code>string event_duration = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearEventDuration() {
      eventDuration_ = getDefaultInstance().getEventDuration();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *ISO 8601 string format
     * </pre>
     *
     * <code>string event_duration = 4;</code>
     * @param value The bytes for eventDuration to set.
     * @return This builder for chaining.
     */
    public Builder setEventDurationBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      eventDuration_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:eventhub.Event)
  }

  // @@protoc_insertion_point(class_scope:eventhub.Event)
  private static final com.eventhub.events.grpc..Event DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.eventhub.events.grpc..Event();
  }

  public static com.eventhub.events.grpc..Event getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Event>
      PARSER = new com.google.protobuf.AbstractParser<Event>() {
    @java.lang.Override
    public Event parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<Event> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Event> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.eventhub.events.grpc..Event getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

