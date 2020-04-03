package local.leo.study.javase.part3;

import java.util.Random;

public class DiceImpl implements Dice {

    private int edgeCount;
    private Random random;

    public DiceImpl(int edgeCount) {
        this.edgeCount = edgeCount - 1;
        random = new Random();
    }

    @Override
    public int nextInt() {
        return 1 + random.nextInt(edgeCount);
    }
}
