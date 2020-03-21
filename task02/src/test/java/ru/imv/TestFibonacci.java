package ru.imv;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestFibonacci {
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void testException() {
        expectedException.expect(IndexOutOfBoundsException.class);
        expectedException.expectMessage("Invalid N in Fibonacci row: N=-7");

        Fibonacci f = new Fibonacci(-7);
    }

    @Test
    public void test0() {
        List<Integer> fib1 = Arrays.asList(0, 1);
        Fibonacci f1 = new Fibonacci(1);

        assertEquals(fib1, f1.getValues());
    }

    @Test
    public void test1() {
        List<Integer> fib1 = Arrays.asList(0, 1, 1);
        Fibonacci f1 = new Fibonacci(2);

        assertEquals(fib1, f1.getValues());
    }

    @Test
    public void test2() {
        List<Integer> fib1 = Arrays.asList(0, 1, 1, 2);
        Fibonacci f1 = new Fibonacci(3);

        assertEquals(fib1, f1.getValues());
    }

    @Test
    public void test3() {
        List<Integer> fib1 = Arrays.asList(0, 1, 1, 2, 3);
        Fibonacci f1 = new Fibonacci(4);

        assertEquals(fib1, f1.getValues());
    }

    @Test
    public void test4() {
        List<Integer> fib1 = Arrays.asList(0, 1, 1, 2, 3, 5);
        Fibonacci f1 = new Fibonacci(5);

        assertEquals(fib1, f1.getValues());
    }
    //

    @Test
    public void test22() {
        List<Integer> fib1 = Arrays.asList(0, 1, 1, 2, 3, 5
                , 8, 13, 21, 34, 55
                , 89, 144, 233, 377, 610
                , 987, 1597, 2584, 4181, 6765
                , 10946, 17711);
        Fibonacci f1 = new Fibonacci(22);

        assertEquals(fib1, f1.getValues());
    }

    @Test
    public void test23() {
        List<Integer> fib1 = Arrays.asList(0, 1, 1, 2, 3, 5
                , 8, 13, 21, 34, 55
                , 89, 144, 233, 377, 610
                , 987, 1597, 2584, 4181, 6765
                , 10946, 17711, 28657);
        Fibonacci f1 = new Fibonacci(23);

        assertEquals(fib1, f1.getValues());
    }
}//TestFibonacci
