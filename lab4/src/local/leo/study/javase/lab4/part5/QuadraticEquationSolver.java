package local.leo.study.javase.lab4.part5;

import local.leo.study.javase.lab4.part4.ComplexNumber;

public class QuadraticEquationSolver {

    public ComplexNumber[] solve(double a, double b, double c) {
        Discriminant d = new Discriminant(a, b, c);
        ComplexNumber[] answer = new ComplexNumber[2];
        if (d.value > 0) {
            answer[0] = new ComplexNumber((-b + Math.sqrt(d.value)) / (2 * a), 0);
            answer[1] = new ComplexNumber((-b - Math.sqrt(d.value)) / (2 * a), 0);
        } else if (d.value == 0) {
            answer[0] = new ComplexNumber(-b / (2 * a), 0);
            answer[1] = null;
        } else {
            answer[0] = new ComplexNumber(-b / (2 * a), Math.sqrt(Math.abs(d.value)) / (2 * a));
            answer[1] = new ComplexNumber(-b / (2 * a), -Math.sqrt(Math.abs(d.value)) / (2 * a));
        }
        return answer;
    }

    private class Discriminant {
        private double value;

        public Discriminant(double a, double b, double c) {
            value = b * b - 4 * a * c;
        }

        public double getValue() {
            return value;
        }
    }
}
