package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;

import static org.junit.jupiter.api.Assertions.*;

class ThreadUtilsTest {
    @Test
    void testUnsafeThreatWithTimeout() throws InterruptedException {
        final ByteArrayOutputStream stream = ThreadUtils.toStreamUnsafe("Hello ", "World");
        Thread.sleep(500);
        assertEquals("Hello World", stream.toString());
    }
}