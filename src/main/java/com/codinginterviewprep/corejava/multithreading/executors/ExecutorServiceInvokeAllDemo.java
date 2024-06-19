package com.codinginterviewprep.corejava.multithreading.executors;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.*;

public class ExecutorServiceInvokeAllDemo {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        List<Callable<String>> tasks = Arrays.asList(
                () -> "Task 1",
                () -> "Task 2",
                () -> "Task 3"
        );
        List<Future<String>> results = executorService.invokeAll(tasks);
        for(Future<String> resultFuture :results){
            System.out.println("Result: "+ resultFuture.get());
        }
        executorService.shutdown();
    }
}
