package ro.itschool.mvnbase.curs8;

public class Cat extends Pet {
    private int numberOfLimbs;

    @Override
    public String voice() {
        return "MiauMiau";
    }

    @Override
    public int numberOfLimbs() {
        return this.numberOfLimbs=4;
    }
}
