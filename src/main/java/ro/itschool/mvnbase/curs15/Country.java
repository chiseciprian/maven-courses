package ro.itschool.mvnbase.curs15;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Country {
    private final String name;
    private final String capital;
    private final long population;
    private final int area;
    private final String region;
    private final List<String> borders;
    private final Map<String, String> translations;
    private final List<Language> languages;

    public Country(@JsonProperty("name") String name,
                   @JsonProperty("capital") String capital,
                   @JsonProperty("population") long population,
                   @JsonProperty("area") int area,
                   @JsonProperty("region") String region,
                   @JsonProperty("borders") List<String> borders,
                   @JsonProperty("translations") Map<String, String> translations,
                   @JsonProperty("languages") List<Language> languages) {
        this.name = name;
        this.capital = capital;
        this.population = population;
        this.area = area;
        this.region = region;
        this.borders = borders;
        this.translations = translations;
        this.languages = languages;
    }

    public Country(String name) {
        this(name,null,0,0,null,null,null,null);
    }


    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public long getPopulation() {
        return population;
    }

    public int getArea() {
        return area;
    }

    public String getRegion() {
        return region;
    }

    public List<String> getBorders() {
        return borders;
    }

    public Map<String, String> getTranslations() {
        return translations;
    }


    public List<Language> getLanguages() {
        return languages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return population == country.population &&
                area == country.area &&
                Objects.equals(name, country.name) &&
                Objects.equals(capital, country.capital) &&
                Objects.equals(region, country.region) &&
                Objects.equals(borders, country.borders) &&
                Objects.equals(translations, country.translations) &&
                Objects.equals(languages, country.languages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, capital, population, area, region, borders, translations, languages);
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", capital='" + capital + '\'' +
                ", population=" + population +
                ", area=" + area +
                ", region='" + region + '\'' +
                ", borders=" + borders +
                ", translations=" + translations +
                ", languages=" + languages +
                '}'+"\n";
    }
}
