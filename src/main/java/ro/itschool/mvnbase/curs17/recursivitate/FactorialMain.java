package ro.itschool.mvnbase.curs17.recursivitate;

public class FactorialMain {
    public static void main(String[] args) {
        Factorial factorial=new Factorial();
        System.out.println(factorial.factorial(10));
        System.out.println(factorial.factorialWithFor(10));
    }
}
