package com.learn.javacore._23MultiThreading._12Barrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

class SubSystem implements Runnable{

    private String name;
    private int initializationTime;
    private CyclicBarrier barrier;

    public SubSystem(String name, int initializationTime, CyclicBarrier barrier) {
        this.name = name;
        this.initializationTime = initializationTime;
        this.barrier = barrier;
    }

    @Override
    public void run() {
        try{
            System.out.println(name+ " initialize started.");
            Thread.sleep(initializationTime);
            System.out.println(name + " initialization completed");
            barrier.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (BrokenBarrierException e) {
            throw new RuntimeException(e);
        }
    }
}

public class BarrierExample {

    // NOTE - Matrix multiplication


    public static void main(String[] args) {
        int numOfSubsystem=4;
        CyclicBarrier barrier=new CyclicBarrier(numOfSubsystem,()-> System.out.println("All Subsystem are up and running. System startup complete,"));

        ///Services
        Thread web=new Thread(new SubSystem("Chrome",2000,barrier));
        Thread db=new Thread(new SubSystem("MongoDb",2000,barrier));
        Thread cache=new Thread(new SubSystem("Cache",2000,barrier));
        Thread message=new Thread(new SubSystem("ChatApp",2000,barrier));

        web.start();
        db.start();
        cache.start();
        message.start();

    }
}
