package local.leo.study.javase;

/**
 * Created by leo on 04.04.2020.
 */
public class ComplexNumber {

    private double x;
    private double y;
    private double module;
    private double f;

    public ComplexNumber(double real, double imaginaries) {
        x = real;
        y = imaginaries;
        computeModule();
        computeF();
    }

    private void computeModule() {
        module = Math.sqrt(x * x + y * y);
    }

    private void computeF() {
        f = Math.atan((y / x));
    }

    public ComplexNumber add(ComplexNumber toAdd) {
        double a = x + toAdd.getX();
        double b = y + toAdd.getY();
        return new ComplexNumber(a, b);
    }

    public ComplexNumber sub(ComplexNumber toSub) {
        double a = x - toSub.getX();
        double b = y - toSub.getY();
        return new ComplexNumber(a, b);
    }

    public ComplexNumber mult(ComplexNumber toMult) {
        double a = x * toMult.getX() - y * toMult.getY();
        double b = x * toMult.getY() - y * toMult.getX();
        return new ComplexNumber(a, b);
    }

    public ComplexNumber div(ComplexNumber toDiv) {
        double a = (x * toDiv.getX() + y * toDiv.getY()) / (toDiv.getModule() * toDiv.getModule());
        double b = (y * toDiv.getX() - x * toDiv.getY()) / (toDiv.getModule() * toDiv.getModule());
        return new ComplexNumber(a, b);
    }

    public String toAlgebraicString() {
        if (x == 0 && y == 0) {
            return "0";
        } else if (x == 0) {
            return String.format("%.3fi", y);
        } else if (y == 0) {
            return String.format("%.3f", x);
        } else {
            return String.format("%.3f + %.3fi", x, y);
        }
    }

    public String toTrigonometricString() {
        return String.format("%.3f(cos%.3f + isin%.3f)", module, f, f);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getModule() {
        return module;
    }

    public double getF() {
        return f;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ComplexNumber that = (ComplexNumber) o;

        if (Double.compare(that.x, x) != 0) return false;
        return Double.compare(that.y, y) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(x);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(y);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return toAlgebraicString();
    }
}
