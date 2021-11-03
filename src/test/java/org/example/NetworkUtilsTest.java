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
}
