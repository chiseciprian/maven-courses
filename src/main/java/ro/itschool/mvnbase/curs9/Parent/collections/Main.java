package ro.itschool.mvnbase.curs9.Parent.collections;

import ro.itschool.mvnbase.curs9.Parent.Child;
import ro.itschool.mvnbase.curs9.Parent.Parent;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent(3);
        Parent child = new Child(3);
        Child charlie = new Child(3);

        System.out.println(parent.equals(child));
        System.out.println(charlie.equals(child));

        List<Parent> parents = new ArrayList<>();
        parents.add(new Parent(50));
        parents.add(new Parent(36));
        parents.add(new Child(13));
        parents.add(new Parent(32));

        for (Parent p : parents) {
            System.out.println(p);
        }

    }
}
