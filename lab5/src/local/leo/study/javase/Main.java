package local.leo.study.javase;

import local.leo.study.javase.part3.Dice;
import local.leo.study.javase.part3.DiceGame;
import local.leo.study.javase.part3.DiceImpl;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        part1();
        part2();
        part3();
    }

    public static void part1() {
        List<Voice> animals = new LinkedList<>();
        animals.add(new Cat());
        animals.add(new Dog());
        animals.add(new Cow());
        animals.forEach(Voice::voice);
    }

    public static void part2() {
        Animal1 animal1 = new Animal1();
        Animal2 animal2 = new Animal2();

        animal1.voice();
        animal1.doSomethingWithWool();

        animal2.voice();
        animal2.flap();
    }

    public static void part3() {
        Dice dice = new DiceImpl(6);
        DiceGame diceGame = new DiceGame(dice);
        diceGame.startGame(6, 2);
    }
}
