package local.leo.study.javase;

public class Main {

    public static void main(String[] args) {
        part1();
        part2();
        part3();
    }

    public static void part1() {
        ExtendedClass ec1 = new ExtendedClass();
        ExtendedClass ec2 = new ExtendedClass();
        System.out.println(ec1.toString());
        System.out.println(ec1.hashCode());
        System.out.println(ec1.equals(ec2));
    }

    public static void part2() {
        PhoneNumber number = new PhoneNumber();
        number.setCountryCode("7");
        number.setCityCode("848");
        number.setNumber("443322");
        number.setExtension("567");
        System.out.println(number.toString());
        System.out.println(number.hashCode());
    }

    public static void part3() {
        System.out.println("Complex number");
        ComplexNumber n1 = new ComplexNumber(2.3, -9.53);
        ComplexNumber n2 = new ComplexNumber(4.004, 89.07);
        System.out.println(n1.toString());
        System.out.println(n2.toString());
        System.out.println(n1.equals(n2));
        System.out.println(n1.hashCode());
        System.out.println(n2.hashCode());

        System.out.println("Fibonacci");
        Fibonacci fibonacci1 = new Fibonacci(13);
        Fibonacci fibonacci2 = new Fibonacci(12);
        System.out.println(fibonacci1.toString());
        System.out.println(fibonacci1.hashCode());
        System.out.println(fibonacci1.equals(fibonacci2));
        System.out.println(fibonacci1.equals(n1));

        System.out.println("Pascal");
        Pascal p1 = new Pascal(4);
        Pascal p2 = new Pascal(7);
        System.out.println(p1.equals(p2));
        System.out.println(p1.toString());
        System.out.println(p1.hashCode());
        System.out.println(p2.toString());
        System.out.println(p2.hashCode());
    }
}
