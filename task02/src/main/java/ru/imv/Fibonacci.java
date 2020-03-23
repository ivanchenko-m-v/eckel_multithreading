package ru.imv;

import java.util.*;
import java.util.stream.Collectors;

public class Fibonacci {
    private static Map<Integer, Integer> fibonacciNumbers = new TreeMap<>();
    private final Integer N;

    static {
        fibonacciNumbers.put(0, 0);
        fibonacciNumbers.put(1, 1);
    }

    public Fibonacci(Integer number) {
        if (number < 0) {
            throw new IndexOutOfBoundsException("Invalid N in Fibonacci row: N=" + number);
        }
        if (number > 1) {
            fibonacciNumbers.computeIfAbsent(number, unused -> computeFibonacci(number));
        }
        N = number;
    }

    private Integer computeFibonacci(Integer number) {
        Integer n_1 = fibonacciNumbers.computeIfAbsent(number - 1, unused -> computeFibonacci(number - 1));
        Integer n_2 = fibonacciNumbers.computeIfAbsent(number - 2, unused -> computeFibonacci(number - 2));

        return n_1 + n_2;
    }

    public List<Integer> getValues() {
        return fibonacciNumbers.keySet().stream()
                .map(key -> fibonacciNumbers.get(key))
                .collect(Collectors.toList());
    }
}
