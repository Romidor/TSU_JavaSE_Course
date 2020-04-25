package local.leo.study.javase.lab8.part1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarExample implements Example {

    @Override
    public void action() {
        String[] months = {"Янв","Фев","Мар","Апр","Май",
                "Июн","Июл","Авг","Сен","Окт","Ноя","Дек",};
        int year;

        GregorianCalendar gcalendar = new GregorianCalendar();

        System.out.print("Дата: ");
        System.out.print(months[gcalendar.get(Calendar.MONTH)]);
        System.out.print(" " + gcalendar.get(Calendar.DATE) + " ");
        System.out.println(year = gcalendar.get(Calendar.YEAR));
        System.out.print("Время: ");
        System.out.print(gcalendar.get(Calendar.HOUR) + ":");
        System.out.print(gcalendar.get(Calendar.MINUTE) + ":");
        System.out.println(gcalendar.get(Calendar.SECOND));

        if (gcalendar.isLeapYear(year)) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }

    }
}
