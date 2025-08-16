package com.learn.javacore._23MultiThreading;

public class Multithreading {


    //         CPU
            // -Brain
            // -responsible for executing instruction from program
            // -performs operation
            // -ex:- intel,AMD ,Ryzen etc

    //        CORE
            // -individual processing unit
            // -cpu can have multicore (true parallel execution)
            // -quadcore 4core
            // - single core can use rapid switching through os scheduling

    //        PROGRAM
            // -set of instruction
            // - MSoffice

    //        PROCESS
            // -instance of program
            // -operating system create a process to manage program execution

    //        THREAD
            // -smallest unit of Process
            // -process can have multiple thread
            // -each thread run separate / independent

    //        MULTITHREADING
            // -multiple thread execut  concurrently within process
            // -chrome web (js,html,css)

    // (multitasking) - multiple process - (multi threading)multiple thread execution parallel
    // how acieve - singlecore-time slice multicore-different core


    // MULTITHREADING IN JAVA 2 WAYS
           //1.Runnable interface implement and override run and instanc.start()
           //2.Thread class extends and pass instruction in constructor and the instance.start()



    public static void main(String[] args) throws InterruptedException {

       MyThread myThread=new MyThread();
       Thread t2=new Thread(new MyThreadByRunnable());
       t2.start();
       myThread.start();

       // waiting
       t2.join();
       myThread.join();
       for(;;){
           System.out.println(Thread.currentThread().getName());
       }
    }


}
