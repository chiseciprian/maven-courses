package ro.itschool.mvnbase.curs16;

import ro.itschool.mvnbase.curs15.Country;

public class CountryEvaluator {
    public String evaluate(Country country)throws BadCountryException {
        if (country.getName().equals("Germany")){
            throw new BadCountryException(country);
        }
        return "You'are good";
    }
}
