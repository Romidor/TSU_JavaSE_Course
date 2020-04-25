package local.leo.study.javase.lab8;

import local.leo.study.javase.lab8.part1.*;
import local.leo.study.javase.lab8.part2.Person;
import local.leo.study.javase.lab8.part3.StringToDateConverter;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.part1();
        main.part2();
        main.part3();
    }

    public void part1() {
        System.out.println();
        System.out.println("*** part 1 ***");
        List<Example> examples = new LinkedList<>();
        examples.add(new RegExpExample());
        examples.add(new ResourceBundleExample());
        examples.add(new DateExample());
        examples.add(new CalendarExample());
        Iterator<Example> it = examples.iterator();
        while (it.hasNext()) {
            it.next().action();
            it.remove();
        }
    }

    public void part2() {
        System.out.println();
        System.out.println("*** part 2 ***");
        Person p = new Person();
        p.setName("Fejke");
        p.setLastname("KHefowowe");
        p.setPatronymic("Oeojwkfnwks");
        p.setBirthDate(new Date());
        System.out.println(p.toString());
        System.out.println(p.getFormattedBirthDate("dd.MM.yyyy"));
        System.out.println(p.getFormattedBirthDate("dd MMMM"));
    }

    public void part3() {
        System.out.println();
        System.out.println("*** part 3 ***");
        System.out.println("work with dates");
        Date d = StringToDateConverter.convertToDate(23, 15);
        System.out.println(d.toString());
        d = StringToDateConverter.convertToDate(2000, 1, 1);
        System.out.println(d.toString());

        System.out.println("work with calendars");
        Calendar c = StringToDateConverter.convertToCalendar(23, 15);
        System.out.println(c.getTime().toString());
        c = StringToDateConverter.convertToCalendar(2000, 1, 1);
        System.out.println(c.getTime().toString());
    }
}
