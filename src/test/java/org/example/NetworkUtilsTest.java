package org.example;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class NetworkUtilsTest {
    @Test
    void testListenFor1secondWithNoMessage() throws IOException {
        final String message = NetworkUtils.listenForMessage(8095, 1000);
        assertTrue(message.isEmpty());
    }

    @Test
    void testListenWithMessage() throws IOException {
        NetworkUtils.sendDelayedMessage("Hello", 8095, 200);
        assertEquals("Hello", NetworkUtils.listenForMessage(8095, 1000));
    }
}
