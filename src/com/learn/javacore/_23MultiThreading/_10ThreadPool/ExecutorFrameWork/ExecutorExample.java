package com.learn.javacore._23MultiThreading._10ThreadPool.ExecutorFrameWork;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ExecutorExample {


    //Executor Framwork -> java.util.concurrent
    // - help in creating and managing threads

    //                LEARNING
         //submit-> callable/runnable/runnable+task
         //shutdown(),shutdownNow()
         //awaitTermination()
         //isShutdown()

    //                MULTITASK
        //invokeAll()
        //invokeAny()

    public  static long fact(int n) throws InterruptedException {
        Thread.sleep(1000);
        long result=1;
        for (int i = 1; i < n; i++) {
            result *=i;
        }
        return result;
    }
    public static void main(String[] args) throws InterruptedException {
//         long startTime=System.currentTimeMillis();
//        //1.Manual Thread Managemnt
//        Thread[] threads=new Thread[10];
//        for(int i=1;i<11;i++){
//            int finalI = i;
//            threads[i-1]=new Thread(
//                    ()->{
//                        long result= 0;
//                        try {
//                            result = fact(finalI);
//                        } catch (InterruptedException e) {
//                            throw new RuntimeException(e);
//                        }
//                        System.out.println(result);
//                    }
//            );
//            threads[i-1].start();
//        }
//        for(Thread thread:threads){
//            thread.join();
//        }
//        System.out.println("Total Time ="+(System.currentTimeMillis()-startTime));

        long startTime=System.currentTimeMillis();
        //1.Manual Thread Managemnt
        ExecutorService executorService= Executors.newFixedThreadPool(3);
        for(int i=1;i<11;i++){
            int finalI = i;
            executorService.submit(()->{
                try {
                    long res=fact(finalI);
                    System.out.println(res);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }
        executorService.shutdown();
        while (!executorService.awaitTermination(2, TimeUnit.SECONDS)){
            System.out.println("Waiting to complete...");
        }
        System.out.println("Total Time ="+(System.currentTimeMillis()-startTime));
    }
}
