package ro.itschool.mvnbase.curs9.Parent;

public class Main {
    public static void main(String[] args) {
        Child child1 = new Child();
        System.out.println(child1.prefix);
        print(new Parent());
        print(new Child());


        print(child1);
        System.out.println(child1.say("over", "HIGH"));

        Parent parent1 = new Child();
        print(parent1);


    }

    public static void print(Parent object) {
        System.out.println("---");
        object.doSomething();
        System.out.println(object.say());
        System.out.println(object.order());
        System.out.println(object.say("overloading"));
    }
}
