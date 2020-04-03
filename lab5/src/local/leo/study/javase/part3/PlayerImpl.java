package local.leo.study.javase.part3;

public class PlayerImpl implements Player {

    private int wins; //количество побед в прошедших раундах
    private int currentRollSum; //сумма бросков в раунде
    private int index; //номер игрока (ник)

    @Override
    public int roll(Dice dice) {
        return dice.nextInt();
    }

    @Override
    public int getWins() {
        return wins;
    }

    @Override
    public void setWins(int wins) {
        this.wins = wins;
    }

    @Override
    public int getCurrentRollSum() {
        return currentRollSum;
    }

    @Override
    public void setCurrentRollSum(int currentRollSum) {
        this.currentRollSum = currentRollSum;
    }

    @Override
    public int getIndex() {
        return index;
    }

    @Override
    public void setIndex(int index) {
        this.index = index;
    }
}
