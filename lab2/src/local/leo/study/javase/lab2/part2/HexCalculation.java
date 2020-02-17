package local.leo.study.javase.lab2.part2;

public class HexCalculation {

    //сложение
    public void sum(int a, int b) {
        System.out.printf("%X + %X = %X\n", a, b, a + b);
    }

    //вычитание
    public void dec(int a, int b) {
        System.out.printf("%X - %X = %X\n", a, b, a - b);
    }

    //умножение
    public void mult(int a, int b) {
        System.out.printf("%X * %X = %X\n", a, b, a * b);
    }

    //деление
    public void div(int a, int b) {
        System.out.printf("%X / %X = %X\n", a, b, a / b);
    }

    public void prefixIncrement(int a) {
        System.out.printf("++a = %X\n", a + 1);
    }

    public void postfixIncrement(int a) {
        System.out.printf("a++ = %X\n", a + 1);
    }

    public void prefixDecrement(int a) {
        System.out.printf("--a = %X\n", a - 1);
    }

    public void postfixDecrement(int a) {
        System.out.printf("a-- = %X\n", a - 1);
    }

    public void объединение(long a, long b) {
        System.out.println("a:\t" + Long.toBinaryString(a)
                + "\nb:\t"
                + Long.toBinaryString(b)
                + "\n=\t"
                + Long.toBinaryString(a | b));
    }

    public void пересечение(int a, int b) {
        System.out.println("a:\t" + Integer.toBinaryString(a)
                + "\nb:\t"
                + Integer.toBinaryString(b)
                + "\n=\t"
                + Integer.toBinaryString(a & b));
    }

    public void крышечка(int a, int b) {
        System.out.println("a:\t" + Integer.toBinaryString(a)
                + "\nb:\t"
                + Integer.toBinaryString(b)
                + "\n=\t"
                + Integer.toBinaryString(a ^ b));
    }

    public static void main(String[] args) {
        int a = 0x34F5B0;
        int b = 0x7D3881;
        System.out.printf("a = %X = %d\nb = %X = %d\n", a, a, b, b);
        HexCalculation calc = new HexCalculation();
        calc.sum(a, b);
        calc.dec(a, b);
        calc.mult(a, b);
        calc.div(a, b);
        calc.prefixIncrement(b);
        calc.postfixIncrement(b);
        calc.prefixDecrement(b);
        calc.postfixDecrement(b);
        calc.объединение((long) a, (long) b);
        calc.пересечение(a, b);
        calc.крышечка(a, b);
    }
}
