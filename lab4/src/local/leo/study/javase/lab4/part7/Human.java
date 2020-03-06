package local.leo.study.javase.lab4.part7;

import java.util.Date;

public class Human {

    private Address address;
    private Date birthDate;
    private String lastname;
    private int age;

    public Human(Address address, Date birthDate, String lastname, int age) {
        this.address = address;
        this.birthDate = birthDate;
        this.lastname = lastname;
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "address=" + address +
                ", birthDate=" + birthDate +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                '}';
    }
}
