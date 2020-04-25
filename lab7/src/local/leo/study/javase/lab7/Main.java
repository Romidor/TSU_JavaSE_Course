package local.leo.study.javase.lab7;

public class Main {

    public static void main(String[] args) {
        part1();
        part2();
        part3();
        part4();
        part5();
    }

    public static void part1() {
        System.out.println("*** part 1 ***");
        String sql = generateSql("MOp-1702a", 3);
        System.out.println(sql);
    }

    public static String generateSql(String group, int dolgCount) {
        String sql = "insert into T_GroupSelected " +
                "values (select id_Student, firstName, lastName, id_Group g " +
                "from T_Student " +
                "where dolgCount > " + dolgCount + " and g = '" + group + "');";
        return sql;
    }

    public static void part2() {
        System.out.println("*** part 2 ***");
        Person p = new Person();
        p.setLastname("Vomisareg");
        System.out.println(p.getLastnameNP());
        p.setName("Dinoel");
        p.setPatronymic("Hcivogelo");
        System.out.println(p.getLastnameNP());
    }

    public static void part3() {
        System.out.println("*** part 3 ***");
        Address a = new Address();
        a.setFullAddressWithTokenizer("A, B, C, D, E, F, G");
        System.out.println(a.getFullAddress());
        a.setFullAddressWithTokenizer("A; B; C; D; E. F. G");
        System.out.println(a.getFullAddress());
        a.setFullAddressWithSplit("A, B, C, D, E, F, G");
        System.out.println(a.getFullAddress());
    }

    public static void part4() {
        System.out.println("*** part 4 ***");
        String[] shirts = {"S001,Black Polo Shirt,Black,XL",
                "S002,Black Polo Shirt,Black,L",
                "S003,Blue Polo Shirt,Blue,XL",
                "S004,Blue Polo Shirt,Blue,M",
                "S005,Tan Polo Shirt,Tan,XL",
                "S006,Black T-Shirt,Black,XL",
                "S007,White T-Shirt,White,XL",
                "S008,White T-Shirt,White,L",
                "S009,Green T-Shirt,Green,S",
                "S010,Orange T-Shirt,Orange,S",
                "S011,Maroon Polo Shirt,Maroon,S"};
        Shirt[] shirts1 = new Shirt[shirts.length];
        for (int i = 0; i < shirts.length; i++) {
            String[] attributes = shirts[i].split(",");
            shirts1[i] = new Shirt(
                    attributes[0],
                    attributes[1],
                    attributes[2],
                    attributes[3]
            );
            System.out.println(shirts1[i].toString());
        }
    }

    public static void part5() {
        System.out.println("*** part 5 ***");
        System.out.println(PhoneNumberConverter.convert("89175655655"));
        System.out.println(PhoneNumberConverter.convert("+79175655655"));
        System.out.println(PhoneNumberConverter.convert("+104289652211"));
    }
}
