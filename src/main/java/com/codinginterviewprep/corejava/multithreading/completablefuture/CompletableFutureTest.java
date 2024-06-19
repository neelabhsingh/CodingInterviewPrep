package com.codinginterviewprep.corejava.multithreading.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
/*
https://codetechsummit.com/wp-admin/post.php?post=3438&action=edit
https://stackoverflow.com/questions/32730169/how-can-i-use-settimeout-functions-within-mocha-test-cases/32733027#32733027
https://blog.krecan.net/2013/12/25/completablefutures-why-to-use-async-methods/
 */
public class CompletableFutureTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        final CompletableFuture<Integer> future = CompletableFuture
                .supplyAsync(() -> doSomethingAndReturnA())
                .thenApply(a ->convertToB(a));
        System.out.println(future.get());
    }

    private static int convertToB(final String a){
        System.out.println("Convert To B: "+ Thread.currentThread().getName());
        return Integer.parseInt(a);
    }

    private static String doSomethingAndReturnA() {
        System.out.println("Do SomethingAnd ReturnA:"+ Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
        return "1";
    }
}
