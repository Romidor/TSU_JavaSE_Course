package local.leo.study.javase;

import java.util.Arrays;

public class Pascal {

    private int[][] numbers;

    public Pascal(int size) {
        if (size < 3) {
            throw new IllegalArgumentException("Size must be greater than 2");
        }
        computeTriangle(size);
    }

    private void computeTriangle(int size) {
        numbers = new int[size][];
        numbers[0] = new int[1];
        numbers[0][0] = 1;

        for (int i = 0; i < size; i++) {
            numbers[i] = new int[i + 1];
            numbers[i][0] = 1;
            numbers[i][numbers[i].length - 1] = 1;
            for (int j = 1; j < numbers[i].length - 1; j++) {
                numbers[i][j] = numbers[i - 1][j - 1] + numbers[i - 1][j];
            }
        }
    }

    public int[][] getNumbers() {
        return numbers;
    }

    @Override
    public String toString() {
        String result = "";
        for (int[] ints : getNumbers()) {
            result += Arrays.toString(ints) + "\n";
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pascal pascal = (Pascal) o;

        return Arrays.deepEquals(numbers, pascal.numbers);
    }

    @Override
    public int hashCode() {
        return Arrays.deepHashCode(numbers);
    }
}
