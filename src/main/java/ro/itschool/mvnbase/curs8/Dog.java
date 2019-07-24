package ro.itschool.mvnbase.curs8;

public class Dog extends Pet {
    private int numberOfLimbs;

   public String voice(){
       return "HamHam";
   }

    @Override
    public int numberOfLimbs() {
       return this.numberOfLimbs =4;
    }






}
