package com.learn.javacore._23MultiThreading._11CountDownLatch;

import java.util.concurrent.*;

class Dependent implements Callable<String>{

    private final CountDownLatch countDownLatch;
    public Dependent(CountDownLatch countDownLatch){
        this.countDownLatch=countDownLatch;
    }

    @Override
    public String call() throws Exception {
        try {
            System.out.println(Thread.currentThread().getName() + " started service..");
            Thread.sleep(3000);
        }finally {
            countDownLatch.countDown();
        }
        return "ok";
    }
}


public class Main {

    //       COUNTDOWNLATCH   -- use for waiting mutiple thread to complete it work
             ///Waiting for all friends




    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int numberOfService=3;
        ExecutorService service= Executors.newFixedThreadPool(3);
        CountDownLatch latch=new CountDownLatch(numberOfService);

        Future<String> future1=service.submit(new Dependent(latch));
        Future<String> future2=service.submit(new Dependent(latch));
        Future<String> future3=service.submit(new Dependent(latch));
        latch.await();

//        future1.get();
//        future2.get();
//        future3.get();//...

        System.out.println("All dependent service finished. Starting main...");
        service.shutdown();
    }
}
