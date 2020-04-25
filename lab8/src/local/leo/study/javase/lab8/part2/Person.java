package local.leo.study.javase.lab8.part2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {

    private String lastname;
    private String name;
    private String patronymic;
    private Date birthDate;

    @Override
    public String toString() {
        String result = getLastnameNP();
        return result + " " + getBirthDate().toString();
    }

    public String getFormattedBirthDate(String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        String date = sdf.format(birthDate);
        return date;
    }

    public String getLastnameNP() {
        StringBuilder sb = new StringBuilder(lastname);
        if (name != null) {
            sb.append(" ");
            sb.append(name.substring(0, 1));
            sb.append(".");
        }
        if (patronymic != null) {
            sb.append(" ");
            sb.append(patronymic.substring(0, 1));
            sb.append(".");
        }
        return sb.toString();
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

}
