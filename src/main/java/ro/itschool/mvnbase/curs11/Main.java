package ro.itschool.mvnbase.curs11;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        persons.add(new Person(1,"Doe",24,"Medic",4000));
        persons.add(new Person(2,"Serena",35,"Musician",6000));
        persons.add(new Person(3,"Serena",26,"Nurse",2000));
        persons.add(new Person(4,"Simona",26,"Tenis",8000));
        persons.add(new Person(5,"Naomi",22,"Tenis",9000));

        PersonService service =new PersonService(persons);

        System.out.println(service.getAll());
        System.out.println("-------------");
        System.out.println(service.getById(2));
        System.out.println("-------------");
        System.out.println(service.getByName("Serena"));
        System.out.println("-------------");
        System.out.println(service.getByOcupation("Tenis"));
        System.out.println("-------------");
        System.out.println(service.findBySallary(9000));
        System.out.println("-------------");
        System.out.println(service.findBySallary(250));
        System.out.println("-------------");
        System.out.println(service.findOldestPerson());
        System.out.println("-------------");
        System.out.println(service.mapOcupationToName());

    }
}
