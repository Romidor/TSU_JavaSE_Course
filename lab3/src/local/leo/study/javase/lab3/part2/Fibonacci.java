package local.leo.study.javase.lab3.part2;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        final Integer N = 20;
        Integer[] fibonacciNumbers = new Integer[N];
        fibonacciNumbers[0] = 0;
        fibonacciNumbers[1] = 1;

        for (int i = 2; i < N; i++) {
            fibonacciNumbers[i] = fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2];
        }

        System.out.println("First " + N + " Fibonacci numbers:\n" + Arrays.toString(fibonacciNumbers));
    }
}
