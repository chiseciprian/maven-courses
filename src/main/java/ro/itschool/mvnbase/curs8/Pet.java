package ro.itschool.mvnbase.curs8;

public abstract class Pet implements Animal {


    @Override
    public void eat(String food) {
            System.out.println("The pet eats "+ food);
    }
}
