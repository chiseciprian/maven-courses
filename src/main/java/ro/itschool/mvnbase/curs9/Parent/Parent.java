package ro.itschool.mvnbase.curs9.Parent;

public class Parent {
    static String prefix = "mr";
    static final String CONSTANT = "This is it";

    private int age;

    public Parent() {
        this(10);
    }

    public Parent(int age) {
        this.age = age;
    }

    protected final String order() {
        return "Make your bed!";
    }

    public void doSomething() {
        System.out.println("Parent : do something");
    }

    protected String say() {
        return say("something");
    }

    protected String say(String messgage) {
        return "Parent says " + messgage;
    }

    @Override
    public int hashCode() {
        return age % 3;
    }

    public boolean equals(Object anotherParent) {
        System.out.println("Comparing " + this + " with " + anotherParent);
        if (this.getClass().equals(anotherParent.getClass())) {
            if (((Parent) anotherParent).age == this.age) {
                return true;
            }
        }
        return false;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "Parent with age " + getAge();
    }
}
