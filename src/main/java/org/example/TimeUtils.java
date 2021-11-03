package org.example;

import java.util.concurrent.TimeUnit;

public class TimeUtils {
    private TimeUtils() {}

    public static long getCurrentTime(TimeUnit unit){
        return unit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }
}
