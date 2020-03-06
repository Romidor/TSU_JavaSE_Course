package local.leo.study.javase.lab4.part6;

import java.util.Random;

public class DiceGame {

    private Random dice;
    private int dicesCount;

    public void startGame(final int playersCount, final int dicesCount) {
        this.dicesCount = dicesCount;
        dice = new Random();
        Player[] players = new Player[playersCount];

        for (int i = 0; i < playersCount; i++) {
            players[i] = new Player();
            players[i].index = i;
        }

        int maxWinsCount = 0;
        int winner = 0;
        int round = 1;

        while (maxWinsCount < 7) {
            System.out.println("*** Round " + round + " ***");
            int maxRoll = 0;

            for (int i = 0; i < players.length; i++) {
                System.out.print("Player " + "(" + players[i].wins + "w) " + players[i].index + " rolled ");
                //ход
                players[i].roll();
                System.out.println(" (total: " + players[i].currentRollSum + ")");
                //поиск победителя
                if (maxRoll < players[i].currentRollSum) {
                    maxRoll = players[i].currentRollSum;
                    winner = i;
                }
            }

            players[winner].wins++;
            //ставим победителя раунда на первое место
            for (int i = winner; i > 0; i--) {
                Player buffer = players[i];
                players[i] = players[i - 1];
                players[i - 1] = buffer;
            }

            for (Player p : players) {
                if (p.wins > maxWinsCount) {
                    maxWinsCount = p.wins;
                }
            }
            //всегда выводится 0-й игрок, так как перед этим победитель ставится на 0 индекс в массиве
            System.out.println("*** Player " + players[0].index + " won round " + round + " ***");
            round++;
        }
        System.out.println("*** Player " + players[0].index + " won the game! ***");
    }

    private class Player {
        private int wins; //количество побед в прошедших раундах
        private int currentRollSum; //сумма бросков в раунде
        private int index; //номер игрока (ник)

        public void roll() {
            currentRollSum = 0;
            int croll;
            //кидаем все кости
            for (int i = 0; i < dicesCount; i++) {
                croll = dice.nextInt(12);
                currentRollSum += croll;
                System.out.print(croll + " ");
            }
        }
    }
}
