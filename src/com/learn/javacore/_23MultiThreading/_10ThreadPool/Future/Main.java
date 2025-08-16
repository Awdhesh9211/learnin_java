package com.learn.javacore._23MultiThreading._10ThreadPool.Future;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class Main {


    public static void main(String[] args)  {
//        ExecutorService executorService= Executors.newSingleThreadExecutor();
//
//        Future<?> futureRunnable =executorService.submit(()-> System.out.println("Hello"));
//        Future<String> futureCollable =executorService.submit(()-> "Awdhesh");
//        Future<?> futureRunnambleResult =executorService.submit(()-> System.out.println("Hello"),"awdhesh");
//
//        System.out.println(futureRunnable.get());//null
//        System.out.println(futureCollable.get());//awdhesh
//        System.out.println(futureRunnambleResult.get());//awdhesh
//        futureRunnable.cancel(true);
//        futureRunnable.cancel(false); //cancele task if running
//        System.out.println(futureRunnable.isCancelled());
//        System.out.println(futureRunnable.isDone());
//
//        executorService.shutdown();
        ExecutorService executorService=Executors.newFixedThreadPool(2);

//        Future<?>  submit=executorService.submit(()->1+2);
//        Integer i= (Integer) submit.get();
//        System.out.println("Sum "+i);
//        executorService.shutdown();
//        System.out.println(executorService.isTerminated());//false
//        Thread.sleep(1);
//        System.out.println(executorService.isTerminated());//true
        Callable<Integer> tas1=()->{
            System.out.println("Task 1");
            Thread.sleep(1000);
            return 1;
        };
        Callable<Integer> tas2=()->{
            System.out.println("Task 2");
            Thread.sleep(1000);
            return 2;
        };
        Callable<Integer> tas3=()->{
            System.out.println("Task 3");
            Thread.sleep(1000);
            return 3;
        };
        List<Callable<Integer>> list=Arrays.asList(tas1,tas2,tas3);

        List<Future<Integer>> futures= null;

        try {
            futures = executorService.invokeAll(list,1, TimeUnit.SECONDS);
//            futures = executorService.invokeAny(list,1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        for(Future<Integer> future:futures){
            try {
                System.out.println(future.get());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        }
        executorService.shutdown();
        System.out.println("invokeALL wait for compeletion ");








    }
}
