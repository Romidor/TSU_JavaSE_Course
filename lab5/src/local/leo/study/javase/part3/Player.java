package local.leo.study.javase.part3;

public interface Player {

    int roll(Dice dice);

    int getWins();

    void setWins(int wins);

    int getCurrentRollSum();

    void setCurrentRollSum(int currentRollSum);

    int getIndex();

    void setIndex(int index);
}
