package org.example;

public class MathUtils {
    private MathUtils() {}

    public static double inflate(double value){
        return value / Math.random();
    }
}
