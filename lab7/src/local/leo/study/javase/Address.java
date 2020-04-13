package local.leo.study.javase;

import java.util.StringTokenizer;

public class Address {

    private String country;
    private String area;
    private String city;
    private String street;
    private String house;
    private String part;
    private String flat;

    public Address() {
    }

    public Address(String country, String area, String city, String street, String house, String part, String flat) {
        this.country = country;
        this.area = area;
        this.city = city;
        this.street = street;
        this.house = house;
        this.part = part;
        this.flat = flat;
    }

    public void setFullAddressWithSplit(String fullAddress) {
        String[] parts = fullAddress.split(", ");
        if (parts.length < 7) {
            System.out.println("This is not full address!");
            return;
        }
        country = parts[0];
        area = parts[1];
        city = parts[2];
        street = parts[3];
        house = parts[4];
        part = parts[5];
        flat = parts[6];
    }

    public void setFullAddressWithTokenizer(String fullAddress) {
        StringTokenizer st = new StringTokenizer(fullAddress,",.;");
        if (st.countTokens() < 7) {
            System.out.println("This is not full address!");
            return;
        }
        country = st.nextToken().replaceAll("\\s", "");
        area = st.nextToken().replaceAll("\\s", "");
        city = st.nextToken().replaceAll("\\s", "");
        street = st.nextToken().replaceAll("\\s", "");
        house = st.nextToken().replaceAll("\\s", "");
        part = st.nextToken().replaceAll("\\s", "");
        flat = st.nextToken().replaceAll("\\s", "");
    }

    public String getFullAddress() {
        return country + ", " + area + ", " + city + ", " + street + ", " + house + ", " + part + ", " + flat;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
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

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }

    public String getFlat() {
        return flat;
    }

    public void setFlat(String flat) {
        this.flat = flat;
    }

    @Override
    public String toString() {
        return "Address{" + getFullAddress() + "}";
    }
}
