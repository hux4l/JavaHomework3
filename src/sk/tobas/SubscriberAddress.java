package sk.tobas;

public class SubscriberAddress {

    private final String streetName;
    private final int streetNumber;
    private final String city;
    private final String country;
    private final int zipCode;

    public SubscriberAddress(String streetName, int streetNumber, String city, String country, int zipCode) {
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.city = city;
        this.country = country;
        this.zipCode = zipCode;
    }
}
