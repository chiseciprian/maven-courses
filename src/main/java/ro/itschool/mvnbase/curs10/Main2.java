package ro.itschool.mvnbase.curs10;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        List<Person> persoane = new ArrayList<>();

        persoane.add(new Person("Jane", 78, "brown"));
        persoane.add(new Person("Adam", 45, "blonde"));
        persoane.add(new Person("Jake", 10, "brown"));
        persoane.add(new Person("Ramon", 32, "red"));
        persoane.add(new Person("Melinda", 45, "blonde"));
        persoane.add(new Person("Iulia", 56, "brown"));
        persoane.add(new Person("Anabelle", 21, "brown"));
        persoane.add(new Person("Joker", 66, "brown"));
        persoane.add(new Person("Joker", 66, "brown"));


        System.out.println(personName(persoane));

        System.out.println(new HashSet<>(persoane));


        System.out.println(mapPerson(persoane));
        System.out.println(mapHair(persoane));



    }

    public static List<String> personName(List<Person> person){
       List<String> namePerson=new ArrayList<>();
        for (Person element : person){
            namePerson.add(element.getName());
        }
        return namePerson;
    }

    public static Map<String,String> mapPerson(List<Person> person){
        Map<String,String> mapPerson =new HashMap<>();
        for (Person pers : person){
            mapPerson.put(pers.getName(),pers.getHairColor());
        }
        return mapPerson;
    }

    public static Map<String,List<String>> mapHair(List<Person> person){
        Map<String,List<String>> mapHair = new HashMap<>();
        for (Person pers : person){


            List<String> name = mapHair.get(pers.getHairColor());
            if(name==null){
                name=new ArrayList<>();
                mapHair.put(pers.getHairColor(),name);
            }
            name.add(pers.getName());
        }
        return mapHair;
    }







}
