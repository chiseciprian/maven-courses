package ro.itschool.mvnbase.curs9.Parent.collections;

import ro.itschool.mvnbase.curs9.Parent.Child;
import ro.itschool.mvnbase.curs9.Parent.Parent;

import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        Set<Parent> parents =new HashSet<>();

        parents.add((new Parent(33)));
        parents.add((new Parent(56)));
        parents.add((new Parent(52)));
        parents.add((new Child(2)));
        parents.add((new Parent(23)));
        parents.add((new Parent(33)));

        System.out.println(parents);

    }
}
