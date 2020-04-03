package local.leo.study.javase;

import java.util.Arrays;

public class Fibonacci {

    private int[] numbers;

    public Fibonacci(int count) {
        if (count < 3) {
            throw new IllegalArgumentException("Size must be more than 2");
        }
        numbers = new int[count];
        numbers[0] = 0;
        numbers[1] = 1;

        if (count > 2) {
            for (int i = 2; i < count; i++) {
                numbers[i] = numbers[i - 1] + numbers[i - 2];
            }
        }
    }

    public int[] getNumbers() {
        return numbers;
    }

    @Override
    public String toString() {
        return "Fibonacci{" +
                "numbers=" + Arrays.toString(numbers) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Fibonacci fibonacci = (Fibonacci) o;

        return Arrays.equals(numbers, fibonacci.numbers);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(numbers);
    }
}
