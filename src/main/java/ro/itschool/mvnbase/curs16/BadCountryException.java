package ro.itschool.mvnbase.curs16;

import ro.itschool.mvnbase.curs15.Country;

public class BadCountryException extends Exception {
    private final Country country;

    public BadCountryException(Country country){
        this.country=country;
    }

    public Country getCountry(){
        return country;
    }
}
