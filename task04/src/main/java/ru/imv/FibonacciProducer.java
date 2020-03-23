package ru.imv;

import java.util.List;

public class FibonacciProducer implements Runnable {

    private final Fibonacci fibonacciRow;

    public FibonacciProducer(Fibonacci fibonacciRow) {
        this.fibonacciRow = fibonacciRow;
    }

    @Override
    public void run() {
        List<Integer> ints = this.fibonacciRow.getValues();
        System.out.println(Thread.currentThread().getName() + " start printing values...");
        ints.stream().forEach(value -> {
            System.out.println(Thread.currentThread().getName() + " " + value + "; ");
        });
        System.out.println(Thread.currentThread().getName() + " finished printing values...");
    }
}//FibonacciProducer
