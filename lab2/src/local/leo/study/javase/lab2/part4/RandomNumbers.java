package local.leo.study.javase.lab2.part4;

import java.util.Arrays;

public class RandomNumbers {

    private static final int K = 313;

    public static void main(String[] args) {
        int[] randomNumbers = new int[100];
        int div3Count = 0;
        int primeNumbersCount = 0;

        for (int i = 0; i < randomNumbers.length; i++) {
            //случайное число в диапазоне [0;K]
            randomNumbers[i] = (int) (Math.random() * (K + 1));
            //число кратно 3?
            if (randomNumbers[i] % 3 == 0) {
                div3Count++;
            }

            //является ли число простым?
            boolean s = true;
            for (int j = 2; j < randomNumbers[i]; j++) {
                if (randomNumbers[i] % j == 0) {
                    s = false;
                    break;
                }
            }
            if (s) {
                primeNumbersCount++;
            }
        }

        System.out.println("Массив: " + Arrays.toString(randomNumbers));
        Arrays.sort(randomNumbers);
        System.out.println("Отсортированный массив: " + Arrays.toString(randomNumbers));
        System.out.println("Количество чисел, кратных 3: " + div3Count);
        System.out.println("Количество простых чисел в массиве: " + primeNumbersCount);
    }
}
