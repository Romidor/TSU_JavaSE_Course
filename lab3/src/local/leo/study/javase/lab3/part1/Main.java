package local.leo.study.javase.lab3.part1;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        byte[] a = new byte[100];
        Random random = new Random(255);
        random.nextBytes(a);
        Arrays.sort(a);

        Byte[] aByte = new Byte[a.length];
        for (int i = 0; i < aByte.length; i++) {
            aByte[i] = Byte.valueOf(a[i]);
        }

        Integer[] aInteger = new Integer[aByte.length];
        for (int i = 0; i < aInteger.length; i++) {
            aInteger[i] = Integer.valueOf(aByte[i]);
        }

        int[] aInt = new int[aInteger.length];
        for (int i = 0; i < aInt.length; i++) {
            aInt[i] = aInteger[i];
        }

        String[] aString = new String[aInteger.length];
        for (int i = 0; i < aString.length; i++) {
            aString[i] = aInteger[i].toString();
        }

        System.out.println("byte: " + Arrays.toString(a));
        System.out.println("Byte: " + Arrays.toString(aByte));
        System.out.println("Integer: " + Arrays.toString(aInteger));
        System.out.println("int: " + Arrays.toString(aInt));
        System.out.println("String: " + Arrays.toString(aString));
    }
}
