package com.eventhub.users.utils;

import java.util.UUID;

public class RandomUtils {

    public static String createId() {
        int hash  = Math.abs(UUID.randomUUID().toString().hashCode());

        String hashString;
        hashString = String.format("%08d", hash).substring(0, 8);

        return hashString;


    }
}