public class Address {
    private String city;
    private String country;
    private String street;
    private String postalcode;

    public Address() {

    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    public Address(String city, String country, String street, String postalcode) {
        this.city = city;
        this.country = country;
        this.street = street;
        this.postalcode = postalcode;
    }
}
