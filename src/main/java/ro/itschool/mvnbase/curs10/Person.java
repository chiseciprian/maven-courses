package ro.itschool.mvnbase.curs10;

import java.util.Objects;

public class Person {
    private final String name;
    private final int age;
    private final String hairColor;

    Person(String name , int age, String hairColor){
        this.name=name;
        this.age=age;
        this.hairColor=hairColor;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getHairColor() {
        return hairColor;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public boolean equals(Object anotherPersonName) {
        if (this.getClass().equals(anotherPersonName.getClass())) {
            if (((Person) anotherPersonName).name.equals(this.name)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
