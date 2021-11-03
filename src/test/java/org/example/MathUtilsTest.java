package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {
    @Test
    void testInflateWithPositiveNumber(){
        assertTrue(1. < MathUtils.inflate(1.));
    }

    @Test
    void testInflateWithNegativeNumber(){
        assertTrue(-1. > MathUtils.inflate(-1.));
    }

    @Test
    void testInflateWithZero(){
        double value = 0.;
        assertEquals(0., MathUtils.inflate(value));
    }
}