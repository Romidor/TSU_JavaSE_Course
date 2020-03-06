package local.leo.study.javase.lab4.part2;

public final class FibonaciGenerator {

    private int[] numbers;

    public FibonaciGenerator(int count) {
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
}
