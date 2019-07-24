package ro.itschool.mvnbase.curs15;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CountryReader {
    private final List<Country> countries;

    public CountryReader(String path) throws IOException {
        this.countries = fetchCountry(path);
    }

    private List<Country> fetchCountry(String path) throws IOException {
        List<Country> countries = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        String line;
        String[] countryResult;
        while ((line = bufferedReader.readLine()) != null) {
            countryResult = line.split("\\|");
            countries.add(new Country(countryResult[0], countryResult[1], Long.parseLong(countryResult[2]), Integer.parseInt(countryResult[3]),"Not available",new ArrayList<>(),new HashMap<>(),new ArrayList<>()));
        }
        return countries;
    }


    public List<Country> getCountries() {
        return countries;
    }
}
