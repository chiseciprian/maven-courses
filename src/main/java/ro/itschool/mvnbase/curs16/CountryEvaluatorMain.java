package ro.itschool.mvnbase.curs16;

import ro.itschool.mvnbase.curs15.Country;

public class CountryEvaluatorMain {
    public static void main(String[] args) {
        CountryEvaluator countryEvaluator = new CountryEvaluator();
       try {
           System.out.println(countryEvaluator.evaluate(new Country("Belgium")));
           System.out.println(countryEvaluator.evaluate(new Country("Germany")));
       }catch (BadCountryException bce){
           System.out.println("The country is bad is :"+ bce.getCountry());
       }
    }
}
