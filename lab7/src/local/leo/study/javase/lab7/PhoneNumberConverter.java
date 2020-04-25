package local.leo.study.javase.lab7;


public class PhoneNumberConverter {

    public static String convert(String number) {
        StringBuilder result = new StringBuilder("+");
        int startIndex = number.length()-10;
        result.append(number.substring(startIndex));
        if (number.contains("+")) {
            result.insert(1, number.substring(1, startIndex));
        } else {
            result.insert(1, "7");
        }
        result.insert(result.length()-4, '-');
        result.insert(result.length()-8, '-');
        return result.toString();
    }

}
