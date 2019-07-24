package ro.itschool.mvnbase.curs15;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class ApiReader implements CountrySource{


    @Override
    public List<Country> getCountries() {
        ResponseEntity<List<Country>> exchange = new RestTemplate().exchange("https://restcountries.eu/rest/v2/all",
                HttpMethod.GET,
                new HttpEntity<>(null),
                new ParameterizedTypeReference<List<Country>>() {
                });
        return exchange.getBody();
    }
}
