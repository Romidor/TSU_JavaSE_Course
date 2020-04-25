package local.leo.study.javase.lab8.part1;

import java.util.Arrays;

public class RegExpExample implements Example {

    @Override
    public void action() {
        String strTst1 = "Регулярные выражения - это не хухры мухры!";
        String[] words = strTst1.split("\\s");
        System.out.println(Arrays.toString(words));

        String strTst2 = "Слово +956 Сл0вО -351 15Тест";
        System.out.println(strTst2);
        System.out.println("replaceAll -> " + strTst2.replaceAll("(-|\\+)?\\d+", "*NUMBER*"));
        System.out.println("replaceFirst -> " + strTst2.replaceFirst("(-|\\+)?\\d+", "*NUMBER*"));
    }

}
