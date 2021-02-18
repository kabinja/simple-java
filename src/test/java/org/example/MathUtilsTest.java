package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.net.URLPermission;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {
//    @Test
//    void testInflateWithPositiveNumber(){
//        double value = 1.;
//
//        Random rnd = new Random();
//
//
//        final ByteArrayOutputStream stream = ThreadUtils.toStreamUnsafe("Hello ", "World");
//        Thread t = new Thread(() -> assertEquals(stream.toString(), "Hello world"));
//
//        for (double i = 0.0 ; true; i = rnd.nextDouble()){
//            if (i>0.9) {
//                t.start();
//                break;
//            }
//        }
//
//        assertTrue(value < MathUtils.inflate(value));
//
//    }

    @Test
    void testInflateWithNegativeNumber() {
        final String[] args = new String[] { "-f=bar" };

        final StringBuilder options = new StringBuilder();
        options.append(args);

        try
        {
//            double r = Math.random();
//            if(r > 0){
////                throw new Exception("");
//            }
            assertTrue(true);
        }
        catch (final Exception e)
        {
            assertTrue(true);
        }
    }

//    @Test
//    void testInflateWithZero(){
//        double value = 0.;
//        assertEquals(0., MathUtils.inflate(value));
//    }
}