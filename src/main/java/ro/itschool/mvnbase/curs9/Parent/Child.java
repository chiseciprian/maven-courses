package ro.itschool.mvnbase.curs9.Parent;

public class Child extends Parent {

    public Child() {
        super(10);
    }

    public Child(int age) {
        super(age);
    }

    @Override
    public void doSomething() {
        super.doSomething();
        System.out.println("Child : do something ");
    }

    protected String say(String message, String voice) {
        return "Child says " + message + " with voice " + voice;
    }

    @Override
    protected String say() {
        return "Child says something";
    }


    public String toString() {
        return "Child with age " + getAge();
    }


}
