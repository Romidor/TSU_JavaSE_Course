package local.leo.study.javase.part3;

public class DiceGame {
    private Dice dice;
    private int dicesCount;

    public DiceGame(Dice dice) {
        this.dice = dice;
    }

    public void startGame(final int playersCount, final int dicesCount) {
        this.dicesCount = dicesCount;
        Player[] players = new Player[playersCount];

        for (int i = 0; i < playersCount; i++) {
            players[i] = new PlayerImpl();
            players[i].setIndex(i);
        }

        int maxWinsCount = 0;
        int winner = 0;
        int round = 1;

        while (maxWinsCount < 7) {
            System.out.println("*** Round " + round + " ***");
            int maxRoll = 0;

            for (int i = 0; i < players.length; i++) {
                System.out.print("Player " + players[i].getIndex() +
                        " (" + players[i].getWins() + "w) rolled ");
                //ход
                int currentRoll = 0;
                for (int j = 0; j < dicesCount; j++) {
                    currentRoll += players[i].roll(dice);
                }
                System.out.print(currentRoll);
                players[i].setCurrentRollSum(players[i].getCurrentRollSum() + currentRoll);
                System.out.println(" (total: " + players[i].getCurrentRollSum() + ")");
                //поиск победителя
                if (maxRoll < players[i].getCurrentRollSum()) {
                    maxRoll = players[i].getCurrentRollSum();
                    winner = i;
                }
            }

            players[winner].setWins(players[winner].getWins() + 1);
            //ставим победителя раунда на первое место
            for (int i = winner; i > 0; i--) {
                Player buffer = players[i];
                players[i] = players[i - 1];
                players[i - 1] = buffer;
            }

            for (Player p : players) {
                if (p.getWins() > maxWinsCount) {
                    maxWinsCount = p.getWins();
                }
            }
            //всегда выводится 0-й игрок, так как перед этим победитель ставится на 0 индекс в массиве
            System.out.println("*** Player " + players[0].getIndex() + " won round " + round + " ***");
            round++;
        }
        System.out.println("*** Player " + players[0].getIndex() + " won the game! ***");
    }

}
