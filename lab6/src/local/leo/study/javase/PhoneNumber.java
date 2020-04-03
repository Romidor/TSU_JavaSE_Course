package local.leo.study.javase;

public class PhoneNumber {

    private String countryCode;
    private String cityCode;
    private String extension;
    private String number;

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getFullNumber() {
        return countryCode + cityCode + number + "#" + extension;
    }

    @Override
    public String toString() {
        return getFullNumber();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PhoneNumber that = (PhoneNumber) o;

        if (getCountryCode() != null ? !getCountryCode().equals(that.getCountryCode()) : that.getCountryCode() != null)
            return false;
        if (getCityCode() != null ? !getCityCode().equals(that.getCityCode()) : that.getCityCode() != null)
            return false;
        if (getExtension() != null ? !getExtension().equals(that.getExtension()) : that.getExtension() != null)
            return false;
        return getNumber().equals(that.getNumber());
    }

    @Override
    public int hashCode() {
        int result = getCountryCode() != null ? getCountryCode().hashCode() : 0;
        result = 31 * result + (getCityCode() != null ? getCityCode().hashCode() : 0);
        result = 31 * result + (getExtension() != null ? getExtension().hashCode() : 0);
        result = 31 * result + getNumber().hashCode();
        return result;
    }
}
