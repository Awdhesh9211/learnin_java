package com.learn.javacore._23MultiThreading._10ThreadPool.SchedularThread;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class Main {


    public static void main(String[] args) {

        ScheduledExecutorService scedular= Executors.newScheduledThreadPool(3);
        scedular.schedule(
                ()-> System.out.println("Hello World after 5 Second"),
                5,
                TimeUnit.SECONDS
        );
        scedular.scheduleAtFixedRate(
                ()-> System.out.println("Hello World Every 1 Second 5 Times"),
                1,
                5,
                TimeUnit.SECONDS
        );
        ScheduledFuture<?> scheduledFuture=scedular.scheduleWithFixedDelay(
                ()-> System.out.println("Hello World every after 5 seconds"),
                5,
                5,
                TimeUnit.SECONDS
        );

        //handeling shutdown
        scedular.schedule(()->{
            System.out.println("Shutdown ");
            scedular.shutdown();
        },20,TimeUnit.SECONDS);

    }
}
