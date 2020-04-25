package local.leo.study.javase.lab8.part3;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class StringToDateConverter {

    public static Date convertToDate(int year, int month, int day) {
        Calendar c = new GregorianCalendar(year, month, day);
        return c.getTime();
    }

    public static Date convertToDate(int hours, int minutes) {
        Calendar c = new GregorianCalendar();
        c.set(Calendar.HOUR_OF_DAY, hours);
        c.set(Calendar.MINUTE, minutes);
        return c.getTime();
    }

    public static Calendar convertToCalendar(int year, int month, int day) {
        return new GregorianCalendar(year, month, day);
    }

    public static Calendar convertToCalendar(int hours, int minutes) {
        Calendar calendar = new GregorianCalendar();
        calendar.set(Calendar.HOUR_OF_DAY, hours);
        calendar.set(Calendar.MINUTE, minutes);
        return calendar;
    }
}
