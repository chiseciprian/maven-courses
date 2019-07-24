package ro.itschool.mvnbase.curs11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonService {
    private final List<Person> persons;

    PersonService(List<Person> persons) {
        if (persons==null){
           this.persons=new ArrayList<>();
        }else {
            this.persons=persons;
        }
    }

    public List<Person> getAll() {
        return new ArrayList<>(persons);
    }

    public Person getById(int id) {
        for (Person person : persons) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    public List<Person> getByName(String name) {
        List<Person> personByName = new ArrayList<>();
        for (Person person : persons) {
            if (person.getName().equals(name)) {
                personByName.add(person);
            }
        }
        return personByName;
    }

    public List<Person> getByOcupation(String ocupation) {
        List<Person> personByOcupation = new ArrayList<>();
        for (Person person : persons) {
            if (person.getOcupation().equals(ocupation)) {
                personByOcupation.add(person);
            }
        }
        return personByOcupation;
    }

    public List<Person> findBySallary(int sallary) {
        List<Person> personBySallary = new ArrayList<>();
        int contor = 0;
        for (Person person : persons) {
            if (person.getSallary() == sallary) {
                personBySallary.add(person);
                contor++;
            }
        }
        if (contor > 0) {
            return personBySallary;
        } else {
            System.out.println("Sallary not found");
            return null;
        }
    }

    public Person findOldestPerson() {
        int age = 0;
        Person personOld=null;
        for (Person person : persons) {
            if (person.getAge() > age){
                age=person.getAge();
                personOld=person;
            }
        }
        return personOld;
    }

    public Map<String,List<Person>> mapOcupationToName(){
        Map<String,List<Person>> mapOcupation = new HashMap<>();
        for (Person person : persons){
            List<Person> name = mapOcupation.get(person.getOcupation());
            if(name==null){
                name=new ArrayList<>();
                mapOcupation.put(person.getOcupation(),name);
            }
            name.add(person);
        }
        return mapOcupation;
    }


}
