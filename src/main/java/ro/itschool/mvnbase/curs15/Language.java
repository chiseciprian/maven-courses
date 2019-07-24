package ro.itschool.mvnbase.curs15;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Language {
    private final String iso639_1;
    private final String iso639_2;
    private final String name;
    private final String nativeName;


    public Language(@JsonProperty("iso639_1") String iso639_1,
                    @JsonProperty("iso639_2") String iso639_2,
                    @JsonProperty("name") String name,
                    @JsonProperty("nativeName") String nativeName) {
        this.iso639_1 = iso639_1;
        this.iso639_2 = iso639_2;
        this.name = name;
        this.nativeName = nativeName;
    }

    public String getIso639_1() {
        return iso639_1;
    }

    public String getIso639_2() {
        return iso639_2;
    }

    public String getName() {
        return name;
    }

    public String getNativeName() {
        return nativeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Language language = (Language) o;
        return Objects.equals(iso639_1, language.iso639_1) &&
                Objects.equals(iso639_2, language.iso639_2) &&
                Objects.equals(name, language.name) &&
                Objects.equals(nativeName, language.nativeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iso639_1, iso639_2, name, nativeName);
    }

    @Override
    public String toString() {
        return "Language{" +
                "iso639_1='" + iso639_1 + '\'' +
                ", iso639_2='" + iso639_2 + '\'' +
                ", name='" + name + '\'' +
                ", nativeName='" + nativeName + '\'' +
                '}';
    }
}
