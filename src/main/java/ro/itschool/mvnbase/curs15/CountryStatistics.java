package ro.itschool.mvnbase.curs15;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CountryStatistics {
    private final List<Country> countries;

    public CountryStatistics(List<Country> countries) {
        this.countries = countries;
    }

    public List<Country> getAllCountries() {
        return new ArrayList<>(countries);
    }

    public List<Country> getCountriesStartingWithLetter(String letter) {
        List<Country> countryList = new ArrayList<>();
        for (Country country : countries) {
            if (country.getName().startsWith(letter)) {
                countryList.add(country);
            }
        }
        return countryList;
    }

    public Optional<String> getCountryCapital(String countryName) {
        for (Country country : countries) {
            if (country.getName().equals(countryName)) {
                return Optional.of(country.getCapital());
            }
        }
        return Optional.empty();
    }

    public Optional<Long> getPopulation(String countryName) {
        for (Country country : countries) {
            if (country.getName().equals(countryName)) {
                return Optional.of(country.getPopulation());
            }
        }
        return Optional.empty();
    }

    public Optional<Integer> getArea(String countryName) {
        for (Country country : countries) {
            if (country.getName().equals(countryName)) {
                return Optional.of(country.getArea());
            }
        }
        return Optional.empty();
    }

    public Optional<Country> getLargestCountry() {
        int area = 0;
        Country result = null;
        for (Country country : countries) {
            if (country.getArea() > area) {
                area = country.getArea();
                result = country;
            }
        }
        return Optional.ofNullable(result);
    }

    public Optional<Country> getMostPeopleCountry() {
        long population = 0;
        Country result = null;
        for (Country country : countries) {
            if (country.getPopulation() > population) {
                population = country.getPopulation();
                result = country;
            }
        }
        return Optional.ofNullable(result);
    }


    public Optional<Country> getMostDenseCountry() {
        double density = 100;
        Country result = null;
        for (Country country : countries) {
            double calculateDensity = (double) country.getArea() / country.getPopulation();
            if (calculateDensity < density) {
                density = calculateDensity;
                result = country;
            }
        }
        return Optional.ofNullable(result);
    }

    public List<Country> getCountryByBorders(String countryInitial) {
        List<Country> neighbourCountry = new ArrayList<>();
        for (Country country : countries) {
            if (country.getBorders().contains(countryInitial)) {
                neighbourCountry.add(country);
            }
        }
        return neighbourCountry;
    }

    public List<Country>getCountriesByLanguage(String language){
        List<Country> countriesSpeakSameLanguage=new ArrayList<>();
        for (Country country:countries){
            if (country.getLanguages().get(0).getName().equals(language)){
                countriesSpeakSameLanguage.add(country);
            }
        }
        return countriesSpeakSameLanguage;
    }
}
