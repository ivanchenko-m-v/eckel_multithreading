package ru.imv;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

/**
 * Hello world!
 */
public class Task04App {
    public static void main(String[] args) {
        execCachedThreadPool();
        execFixedThreadPool();
        execSingleThreadExecutor();
    }

    private static void execCachedThreadPool() {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("-----------------------newCachedThreadPool-----------------------");
        execService(Executors.newCachedThreadPool());
        System.out.println("\n-----------------------------------------------------------------");
    }

    private static void execFixedThreadPool() {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("-----------------------newFixedThreadPool------------------------");
        execService(Executors.newFixedThreadPool(5));
        System.out.println("\n-----------------------------------------------------------------");
    }

    private static void execSingleThreadExecutor() {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("-----------------------newSingleThreadExecutor-------------------");
        execService(Executors.newSingleThreadExecutor());
        System.out.println("\n-----------------------------------------------------------------");
    }

    private static void execService(ExecutorService executorService) {
        IntStream.range(0, 5)
                .forEach(i -> executorService.execute(new FibonacciProducer(new Fibonacci(genN()))));
        executorService.shutdown();
    }

    /**
     * generate random Integer from 10 to 19
     *
     * @return
     */
    private static Integer genN() {
        return Math.toIntExact(Math.round((Math.random() * 10.0) + 10L));
    }
}
