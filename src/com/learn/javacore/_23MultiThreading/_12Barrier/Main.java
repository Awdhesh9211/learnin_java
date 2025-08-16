package com.learn.javacore._23MultiThreading._12Barrier;

import java.util.concurrent.*;

class Dependent implements Callable<String>{

    private final CyclicBarrier barrier;
    public Dependent(CyclicBarrier barrier){
        this.barrier=barrier;
    }

    @Override
    public String call() throws Exception {
        System.out.println(Thread.currentThread().getName() + " started service..");
        Thread.sleep(3000);
        System.out.println(Thread.currentThread().getName()+" Waiting For Other...");
        barrier.await();
        return "ok";
    }
}


public class Main {

    //       CYCLIC BARRIER   -- use for waiting mutiple thread to complete it work
    /// Waiting for all friends and No One is Going To Watch Movie Until EveryFriend not coming




    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int numberOfService=3;
        ExecutorService service= Executors.newFixedThreadPool(3);
        CyclicBarrier barrier=new CyclicBarrier(numberOfService);//it doesnt stop main thread

        Future<String> future1=service.submit(new Dependent(barrier));
        Future<String> future2=service.submit(new Dependent(barrier));
        Future<String> future3=service.submit(new Dependent(barrier));
//        barrier.reset();
//        future1.get();
//        future2.get();
//        future3.get();//...


        service.shutdown();
        System.out.println("All dependent service finished. Starting main...");
    }
}

