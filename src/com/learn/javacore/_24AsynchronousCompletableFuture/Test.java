package com.learn.javacore._24AsynchronousCompletableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Test {


    public static void main(String[] args) {
        CompletableFuture<String> completableFuture=CompletableFuture.supplyAsync(()->{
            try{
                Thread.sleep(3000);
                System.out.println("Worker Task Calling API ");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "ok";
        });

        String s=null;
        try{
            s=completableFuture.get();
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(s);
    }
}
