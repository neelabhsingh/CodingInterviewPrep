package com.codinginterviewprep.corejava.multithreading.executors;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class WebServer {
    private static final int THREAD_POOL_SIZE = 50;
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(THREAD_POOL_SIZE);
        for(int i=0; i<100; i++){
            int requestId = i;
            executorService.submit(() ->handleClientRequest(requestId) );
        }
        executorService.shutdown();
    }
    private static void handleClientRequest(int requestId){
        System.out.println("Start handling the client request"+ requestId + "on thread"+Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        }catch (InterruptedException exception){
            exception.printStackTrace();
        }
    }
}
