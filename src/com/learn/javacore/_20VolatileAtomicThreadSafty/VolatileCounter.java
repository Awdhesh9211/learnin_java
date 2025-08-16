package com.learn.javacore._20VolatileAtomicThreadSafty;

//For Atomicity and thread safty
import java.util.concurrent.atomic.AtomicInteger;

class Counter{

    private AtomicInteger count=new AtomicInteger(0);
    public void incr(){
        count.incrementAndGet();
    }
    public int getCount(){
       return count.get();
    }

}


public class VolatileCounter {


    public static void main(String[] args) throws InterruptedException {
        Counter counter=new Counter();

        Thread t1=new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                counter.incr();
            }
        });
        Thread t2=new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                counter.incr();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(counter.getCount());


    }
}
