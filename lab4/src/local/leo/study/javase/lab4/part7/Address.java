package local.leo.study.javase.lab4.part7;

public class Address {

    private String city;
    private String street;
    private String house;
    private String flat;

    public Address(String city, String street, String house, String flat) {
        this.city = city;
        this.street = street;
        this.house = house;
        this.flat = flat;
    }

    public String getFullAddress() {
        return city + ", " + street + ", " + house + ", " + flat;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getFlat() {
        return flat;
    }

    public void setFlat(String flat) {
        this.flat = flat;
    }

    @Override
    public String toString() {
        return getFullAddress();
    }
}
