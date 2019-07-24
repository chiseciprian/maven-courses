package ro.itschool.mvnbase.curs15;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainCountries {
    public static void main(String[] args) throws IOException {
        CountryReader countryReader = new CountryReader("src/main/resources/countries.txt");

        CountryStatistics countryStatistics = new CountryStatistics(countryReader.getCountries());

        System.out.println(countryStatistics.getAllCountries());
        System.out.println("-------------------");
        System.out.println(countryStatistics.getCountriesStartingWithLetter("R"));
        System.out.println("-------------------");
        System.out.println(countryStatistics.getCountryCapital("Madagascar"));
        System.out.println("-------------------");
        System.out.println(countryStatistics.getPopulation("Germany"));
        System.out.println("-------------------");
        System.out.println(countryStatistics.getArea("Germany"));
        System.out.println("-------------------");
        System.out.println(countryStatistics.getLargestCountry());
        System.out.println("-------------------");
        System.out.println(countryStatistics.getMostPeopleCountry());
        System.out.println("-------------------");
        System.out.println(countryStatistics.getMostDenseCountry());
        System.out.println("-------------------");


        List<Country> contryList = new ArrayList<>(countryStatistics.getAllCountries());
        CountryWritter countryWriter = new CountryWritter("src/main/resources/countriesWritte.txt");
        countryWriter.writter(contryList);


    }
}
