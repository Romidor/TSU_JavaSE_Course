package local.leo.study.javase.lab4;

import local.leo.study.javase.lab4.part2.FibonaciGenerator;
import local.leo.study.javase.lab4.part3.PascalTriangleGenerator;
import local.leo.study.javase.lab4.part4.ComplexNumber;
import local.leo.study.javase.lab4.part5.QuadraticEquationSolver;
import local.leo.study.javase.lab4.part6.DiceGame;
import local.leo.study.javase.lab4.part7.Address;
import local.leo.study.javase.lab4.part7.Human;
import local.leo.study.javase.lab4.part7.HumanRepository;
import local.leo.study.javase.lab4.part8.CalculatorEnterpriseEdition;
import local.leo.study.javase.lab4.part8.CalculatorStandartEdition;

import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    private static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        part2();
        part3();
        part4();
        part5();
        part6();
        part7();
        part8();
    }

    public static void part2() {
        System.out.println("part2:");
        try {
            FibonaciGenerator generator = new FibonaciGenerator(SCANNER.nextInt());
            System.out.println(Arrays.toString(generator.getNumbers()));
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        System.out.println();
    }

    public static void part3() {
        System.out.println("part3");
        try {
            PascalTriangleGenerator ptg = new PascalTriangleGenerator(SCANNER.nextInt());
            int[][] result = ptg.getNumbers();
            for (int[] ints : result) {
                System.out.println(Arrays.toString(ints));
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        System.out.println();
    }

    public static void part4() {
        System.out.println("part4");
        ComplexNumber u = new ComplexNumber(5, 3);
        ComplexNumber v = new ComplexNumber(2, 4);
        System.out.println(u.toAlgebraicString());
        System.out.println(u.toTrigonometricString());

        ComplexNumber w = u.add(v);
        System.out.println("u + v = "
                + w.toAlgebraicString()
                + " = "
                + w.toTrigonometricString());

        w = u.sub(v);
        System.out.println("u - v = "
                + w.toAlgebraicString()
                + " = "
                + w.toTrigonometricString());

        w = u.mult(v);
        System.out.println("u * v = "
                + w.toAlgebraicString()
                + " = "
                + w.toTrigonometricString());

        w = u.div(v);
        System.out.println("u / v = "
                + w.toAlgebraicString()
                + " = "
                + w.toTrigonometricString());
    }

    public static void part5() {
        System.out.println("part5");
        QuadraticEquationSolver qes = new QuadraticEquationSolver();

        ComplexNumber[] ans = qes.solve(2, 3, 4);
        for (ComplexNumber c : ans) {
            System.out.println(c.toAlgebraicString());
        }

        ans = qes.solve(3, 10, -3);
        for (ComplexNumber c : ans) {
            System.out.println(c.toAlgebraicString());
        }

        ans = qes.solve(1, -70, 600);
        for (ComplexNumber c : ans) {
            System.out.println(c.toAlgebraicString());
        }
    }

    public static void part6() {
        System.out.println("part6");
        DiceGame game = new DiceGame();
        game.startGame(6, 5);
    }

    public static void part7() {
        System.out.println("part7");
        HumanRepository humanRepository = new HumanRepository(5);
        humanRepository.saveAll(
                new Human(
                        new Address("Samara",
                                "Revolutsionnaya",
                                "46",
                                "508"),
                        new Date(),
                        "lastname1",
                        20),
                new Human(
                        new Address("Samara",
                                "Revolutsionnaya",
                                "46",
                                "408"),
                        new Date(),
                        "lastname2",
                        30),
                new Human(
                        new Address("Samara",
                                "Podshipnikovaya",
                                "46",
                                "308"),
                        new Date(),
                        "lastname3",
                        40),
                new Human(
                        new Address("Samara",
                                "Revolutsionnaya",
                                "46",
                                "208"),
                        new Date(),
                        "lastname4",
                        50),
                new Human(
                        new Address("Samara",
                                "Podshipnikovaya",
                                "46",
                                "108"),
                        new Date(),
                        "lastname5",
                        60));

        //поиск по фамилии
        System.out.println("поиск по фамилии: " + humanRepository.findByLastname("lastname3"));

        //поиск по адресу (должен вывести 4 по порядку человека)
        System.out.println("поиск по адресу: " + humanRepository.findByAddress(humanRepository.getHumans()[3].getAddress().getFullAddress()));

        //поиск людей, даты рождения которых находятся между др первого и последнего человека в массиве
        System.out.println("поиск по дате рождения" + Arrays.toString(humanRepository.findBetweenBirthDates(
                humanRepository.getHumans()[0].getBirthDate(),
                humanRepository.getHumans()[humanRepository.getHumans().length - 1].getBirthDate())));

        //самый старый
        System.out.println("поиск самого старого: " + humanRepository.findTheOldest());

        //самый молодой
        System.out.println("поиск самого молодого: " + humanRepository.findTheYoungest());
    }

    public static void part8() {
        System.out.println("part8");
        CalculatorStandartEdition se = new CalculatorStandartEdition();
        System.out.println(se.calculateF1(13));
        System.out.println(se.calculateF2(14));
        CalculatorEnterpriseEdition ee = new CalculatorEnterpriseEdition();
        System.out.println(Arrays.toString(ee.calculateF1OnInterval(0, 3.14, Math.PI / 3)));
        System.out.println(Arrays.toString(ee.calculateF2OnInterval(27, 270, 27)));
    }
}
