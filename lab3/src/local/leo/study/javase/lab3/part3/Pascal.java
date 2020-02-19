package local.leo.study.javase.lab3.part3;

import java.util.Arrays;

public class Pascal {
    public static void main(String[] args) {
        final Integer size = 10;
        Integer[][] pascalTriangle = new Integer[size][];
        pascalTriangle[0] = new Integer[1];
        pascalTriangle[0][0] = 1;

        for (int i = 0; i < size; i++) {
            pascalTriangle[i] = new Integer[i + 1];
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
}
