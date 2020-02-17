package local.leo.study.javase.lab2.part3;

import java.util.Scanner;

public class AverageAndMax {

    private static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите 3 числа через пробел: ");
        int a = SCANNER.nextInt();
        int b = SCANNER.nextInt();
        int c = SCANNER.nextInt();
        System.out.println("Среднее арифметическое введенных чисел: " + (a + b + c) / 3);
        System.out.println("Максимальное:" + Math.max(a, Math.max(b, c)));
    }
}
