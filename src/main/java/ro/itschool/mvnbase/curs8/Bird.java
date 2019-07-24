package ro.itschool.mvnbase.curs8;

public class Bird extends Pet {
    private int numberOfLimbs;

    @Override
    public String voice() {
        return "CraCra";
    }

    @Override
    public int numberOfLimbs() {
        return this.numberOfLimbs=2;
    }
}
