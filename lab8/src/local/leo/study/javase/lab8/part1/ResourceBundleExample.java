package local.leo.study.javase.lab8.part1;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleExample implements Example {

    @Override
    public void action() {
        Locale currentLocale = new Locale("en", "US");
        System.out.println("en_US locale");
        ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
        System.out.println(messages.getString("greeting"));
        System.out.println(messages.getString("inquiry"));
        System.out.println(messages.getString("farewell"));

        currentLocale = new Locale("ru", "RU");
        System.out.println("ru_RU locale");
        messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
        System.out.println(messages.getString("greeting"));
        System.out.println(messages.getString("inquiry"));
        System.out.println(messages.getString("farewell"));
    }

}
