package ro.itschool.mvnbase.curs15;

import java.io.IOException;
import java.util.List;

public class MainWithApi {
    public static void main(String[] args) throws IOException {
        List<Country>countries=new ApiReader().getCountries();
       // System.out.println(countries);

        CountryStatistics countryStatistics=new CountryStatistics(countries);
        System.out.println(countryStatistics.getCountryByBorders("ROU"));
        System.out.println("----------------------");
        System.out.println(countryStatistics.getCountriesByLanguage("Spanish"));

        CountryWritter countryWritter=new CountryWritter("src/main/resources/countries.html");
        countryWritter.writterHtml(countries);
    }
}

