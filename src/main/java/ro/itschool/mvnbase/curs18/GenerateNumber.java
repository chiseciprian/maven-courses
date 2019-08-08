package ro.itschool.mvnbase.curs18;

import java.util.Random;

public class GenerateNumber {
    public static void main(String[] args) {
        final Random random =new Random();
        System.out.println(random.nextInt(3)+1);
    }
}
