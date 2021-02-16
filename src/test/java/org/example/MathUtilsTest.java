package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.net.URLPermission;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {
    @Test
    void testInflateWithPositiveNumber(){
        double value = 1.;

        Random rnd = new Random();


        final ByteArrayOutputStream stream = ThreadUtils.toStreamUnsafe("Hello ", "World");
        Thread t = new Thread(() -> assertEquals(stream.toString(), "Hello world"));

        for (double i = 0.0 ; true; i = rnd.nextDouble()){
            if (i>0.9) {
                t.start();
                break;
            }
        }

        assertTrue(value < MathUtils.inflate(value));

    }

    @Test
    void testInflateWithNegativeNumber() throws Exception{
        double value = -1.;


        try {
            if(Math.random() > 1) throw new IllegalStateException("Test exception");
        }catch(Exception ignored){}

        assertTrue(value > MathUtils.inflate(value));
    }

    @Test
    void testInflateWithZero(){
        double value = 0.;
        assertEquals(0., MathUtils.inflate(value));
    }
}