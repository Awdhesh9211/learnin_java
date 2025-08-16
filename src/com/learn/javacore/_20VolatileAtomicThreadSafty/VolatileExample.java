package com.learn.javacore._20VolatileAtomicThreadSafty;

class SharedObj{

    private volatile boolean flag=false;

    public void setFlagTrue(){
        System.out.println("flag sett is true.");
        flag=true;
    }

    public  void printFlag(){
        while(!flag){
            //do nothing
        }
        System.out.println("flag is true.");
    }

}



public class VolatileExample {


    public static void main(String[] args){
        SharedObj sharedObj=new SharedObj();

        Thread writerThread=new Thread(()->{
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            sharedObj.setFlagTrue();
        });
        Thread readerThread=new Thread(()->{
            sharedObj.printFlag();
        });

        writerThread.start();
        readerThread.start();


    }
}
