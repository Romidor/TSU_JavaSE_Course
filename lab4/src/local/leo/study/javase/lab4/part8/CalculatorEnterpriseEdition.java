package local.leo.study.javase.lab4.part8;

public class CalculatorEnterpriseEdition {

    private enum MenuItems {
        Calculate_F1,
        Calculate_F2,
        Calculate_F1_On_Interval_And_Step,
        Calculate_F2_On_Interval_And_Step
    }

    public void printMenu() {
        for (MenuItems m : MenuItems.values()) {
            System.out.println(m.name());
        }
    }

    public double[] calculateF1OnInterval(double start, double end, double step) {
        double[] result = new double[(int) Math.round(Math.abs(start - end) / step)];
        for (int i = 0; i < result.length; i++) {
            result[i] = calculateF1(start);
            start += step;
        }
        return result;
    }

    public double[] calculateF2OnInterval(double start, double end, double step) {
        double[] result = new double[(int) Math.round(Math.abs(start - end) / step)];
        for (int i = 0; i < result.length; i++) {
            result[i] = calculateF2(start);
            start += step;
        }
        return result;
    }

    public double calculateF1(double x) {
        return Math.cos(x);
    }

    public double calculateF2(double x) {
        return Math.pow(x, 1.0d / 3.0d);
    }
}
