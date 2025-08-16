package com.learn.javacore._23MultiThreading._08ThreadCommunication;


class SharedResource{
    private int data;
    private boolean hasData;

    public synchronized void produce(int data){
        while (hasData){
            try{
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        this.data=data;
        hasData=true;
        System.out.println("Produced  ="+data);
        notify();
    }

    public synchronized int consume(){
        while (!hasData){
            try{
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        hasData=false;
        notify();
        System.out.println("Consumed ="+data);
        return data;
    }

}

class Producer implements Runnable {

    private SharedResource sharedResource;

    public Producer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            sharedResource.produce(i);
        }
    }
}
class Consumer implements Runnable {

    private SharedResource sharedResource;

    public Consumer(SharedResource sharedResource) {

        this.sharedResource = sharedResource;
    }


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            int v=sharedResource.consume();
        }
    }
}


public class ThreadCommunication {

    public static void main(String[] args) {
        SharedResource sharedResource=new SharedResource();

        Thread producerthread=new Thread(new Producer(sharedResource));
        Thread consumerThread=new Thread(new Consumer(sharedResource));

        producerthread.start();
        consumerThread.start();
    }
}
