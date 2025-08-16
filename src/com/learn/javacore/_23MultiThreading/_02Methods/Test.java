package com.learn.javacore._23MultiThreading._02Methods;

public class Test {

    //start() -- start the tread
    //join()  -- wait for completion
    //setPriority() - set the priority
    //sleep(ms) - stop thhread for some time
    //interrupt() -stop the thread
    //yield()   - say to the schedular to give chance of another thread

    //DAEMON Thread - background jvm wont wait   t.setDaemon(true)
    //USER Thread - forground jvm wait

    public static void main(String[] args) throws InterruptedException {
        MyThread myThread=new MyThread("Thread-A");
//        myThread.setPriority(4);
        myThread.setPriority(Thread.MIN_PRIORITY);
        MyThread myThread2=new MyThread("Thread-B");
//        myThread2.setPriority(1);
        myThread2.setPriority(Thread.MAX_PRIORITY);

        myThread.start();
        myThread2.start();
//        myThread.interrupt();

        myThread2.join();
        myThread.join();
        Thread daemon=new Thread(()->{
            for(;;){
                System.out.println("Hello ");
            }
        });

        daemon.setDaemon(true);
        daemon.start();
        System.out.println("HELLO");


    }
}
