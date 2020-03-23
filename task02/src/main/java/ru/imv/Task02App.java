package ru.imv;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public class Task02App {
    public static void main(String[] args) {
        List<Thread> threads = new ArrayList<>();
        for (int i = 5; i < 25; i += 5) {
            Thread t = new Thread(new FibonacciProducer(new Fibonacci(i)));
            t.setName("Thread " + String.format("%02d", i/5));
            threads.add(t);
        }
        threads.forEach(Thread::start);
        System.out.println("Waiting....");
    }
}
