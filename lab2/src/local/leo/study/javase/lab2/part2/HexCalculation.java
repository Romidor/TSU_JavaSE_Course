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

    public void bitwiseOr(long a, long b) {
        System.out.println("a:\t" + Long.toBinaryString(a)
                + "\nb:\t"
                + Long.toBinaryString(b)
                + "\n|\t"
                + Long.toBinaryString(a | b));
    }

    public void bitwiseAnd(int a, int b) {
        System.out.println("a:\t" + Integer.toBinaryString(a)
                + "\nb:\t"
                + Integer.toBinaryString(b)
                + "\n&\t"
                + Integer.toBinaryString(a & b));
    }

    public void bitwiseXor(int a, int b) {
        System.out.println("a:\t" + Integer.toBinaryString(a)
                + "\nb:\t"
                + Integer.toBinaryString(b)
                + "\n^\t"
                + Integer.toBinaryString(a ^ b));
    }

    public void bitwiseComplement(int a) {
        System.out.println("a:\t" + Integer.toBinaryString(a)
                + "\n~:\t" + Integer.toBinaryString(~a));
    }

    public void leftBitShift(int a, int count) {
        System.out.println("a = " + Integer.toBinaryString(a));
        int res = a << count;
        System.out.println("a << " + count
                + " = " + Integer.toBinaryString(res)
                + ". a = " + res);
    }

    public void rightBitShift(int a, int count) {
        System.out.println("a = " + Integer.toBinaryString(a));
        int res = a >> count;
        System.out.println("a >> " + count
                + " = " + Integer.toBinaryString(res)
                + ". a = " + res);
    }

    public static void main(String[] args) {
        int a = 0x7D3881;
        int b = 0x69EB60;
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
        calc.bitwiseOr((long) a, (long) b);
        calc.bitwiseAnd(a, b);
        calc.bitwiseXor(a, b);
        calc.bitwiseComplement(a);
        calc.leftBitShift(b, 1);
        calc.rightBitShift(a, 2);
    }
}
