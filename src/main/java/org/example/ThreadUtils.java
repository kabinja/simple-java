package org.example;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ThreadUtils {
    private ThreadUtils() {}

    public static ByteArrayOutputStream toStreamUnsafe(String i1, String i2){
        final ByteArrayOutputStream stream = new ByteArrayOutputStream();

        final Runnable r1 = () -> {
            try {
                stream.write(i1.getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }
        };

        final Runnable r2 = () -> {
            try {
                Thread.sleep(100);
                stream.write(i2.getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        };

        final Thread t1 = new Thread(r1);
        final Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

        return stream;
    }
}
