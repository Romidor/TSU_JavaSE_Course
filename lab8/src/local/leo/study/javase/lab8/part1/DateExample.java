package local.leo.study.javase.lab8.part1;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample implements Example {

    @Override
    public void action() {
        System.out.println("вывод даты");
        Date date = new Date();
        System.out.println(date.toString());

        System.out.println("преобразование строки в дату");
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        String str = "2011-11-11";
        System.out.print("Строка " + str + " распаршена как ");
        Date parsingDate;
        try {
            parsingDate = ft.parse(str);
            System.out.println(parsingDate);
        } catch (ParseException e) {
            System.out.println("Нераспаршена с помощью " + ft);
        }

        System.out.println("задержка по времени");
        try {
            System.out.println(new Date());
            Thread.sleep(10000);
            System.out.println(new Date());
        } catch (Exception e) {
            System.out.println("Something went wrong :(");
        }


        System.out.println("разница дат в Java");
        try {
            long start = System.currentTimeMillis();
            System.out.println(new Date());
            Thread.sleep(10000);
            System.out.println(new Date());
            long end = System.currentTimeMillis();
            long diff = end - start;
            System.out.println("разница между датами " + diff + " миллисекунд");
        } catch (Exception e) {
            System.out.println("Something went wrong :(");
        }

        System.out.println("количество дней между датами");
        String date1 = "01.03.2016";
        String date2 = "01.02.2016";
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        Date dateOne = null;
        Date dateTwo = null;
        try {
            dateOne = format.parse(date1);
            dateTwo = format.parse(date2);
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
        long difference = dateOne.getTime() - dateTwo.getTime();
        int days = (int) (difference / (24 * 60 * 60 * 1000));
        System.out.println(days + "дн.");
    }
}
