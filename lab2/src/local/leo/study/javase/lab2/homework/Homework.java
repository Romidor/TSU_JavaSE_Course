package local.leo.study.javase.lab2.homework;

import java.util.Arrays;

public class Homework {

    public static void fibonacci() {
        final int N = 20;
        int[] fibonacciNumbers = new int[N];
        fibonacciNumbers[0] = 0;
        fibonacciNumbers[1] = 1;

        for (int i = 2; i < N; i++) {
            fibonacciNumbers[i] = fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2];
        }

        System.out.println("First " + N + " Fibonacci numbers:\n" + Arrays.toString(fibonacciNumbers));
    }

    public static void pascal() {
        final int size = 10;
        int[][] pascalTriangle = new int[size][];
        pascalTriangle[0] = new int[1];
        pascalTriangle[0][0] = 1;

        for (int i = 0; i < size; i++) {
            pascalTriangle[i] = new int[i + 1];
            pascalTriangle[i][0] = 1;
            pascalTriangle[i][pascalTriangle[i].length - 1] = 1;
            for (int j = 1; j < pascalTriangle[i].length - 1; j++) {
                pascalTriangle[i][j] = pascalTriangle[i - 1][j - 1] + pascalTriangle[i - 1][j];
            }
        }

        System.out.println("Pascal triangle:\n");
        for (int i = 0; i < size; i++) {
            System.out.println(Arrays.toString(pascalTriangle[i]));
        }
    }

    public static void main(String[] args) {
        fibonacci();
        pascal();
    }

}
