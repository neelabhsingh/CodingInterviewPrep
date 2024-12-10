package com.codinginterviewprep.corejava.multithreading.concurrency;

import java.util.concurrent.TimeUnit;

public class StopThreadIssue {
    private static volatile boolean stopRequest;

    public static void main(String[] args) throws InterruptedException {
        Thread backgroundThread = new Thread(() ->{
            int i=0;
            while (!stopRequest){
                System.out.println("Value of stopRequest in Background Thread " + stopRequest);
                System.out.println(i);
                i++;
            }
        });
        backgroundThread.start();
        TimeUnit.SECONDS.sleep(1);
        stopRequest=true;
        System.out.println("Value of stopRequest in Main Thread " + stopRequest);
    }
}
