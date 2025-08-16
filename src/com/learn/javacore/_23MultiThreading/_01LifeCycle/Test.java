package com.learn.javacore._23MultiThreading._01LifeCycle;

public class Test {

    // LIFE CYCLE OF THREAD
           //1.NEW - created/not started
                  // LOOP
           //2.Runnable - ready to run / waiting for cpu
           //3.Running - executing
           //4.Blocked/waiting -waiting

           //5.Terminated -finished exection



    public static void main(String[] args) throws InterruptedException {
        Threadd t1=new Threadd();
        System.out.println(t1.getState()); //NEW
        t1.start();
        System.out.println(t1.getState()); //RUNNABLE
        Thread.sleep(100);
        System.out.println(t1.getState()); //TIMED_WAITING
        //waiting for finishing t1
        t1.join();
        System.out.println(t1.getState()); //TERMINATED
    }
}
