package ro.itschool.mvnbase.curs14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Filereader {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileInputStream("src/main/resources/input.txt"));
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                System.out.println(scanner.nextInt());
            } else {
                System.out.println(scanner.next());
            }
        }
    }
}
