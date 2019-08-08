package ro.itschool.mvnbase.curs16;

public class Main {
    public static void main(String[] args) {
        try {
            metoda();
            System.out.println("Asta nu se executa");
        }catch (RuntimeException rex){
            System.out.println("Exceptie");
        }finally {
            System.out.println("aici sau la pachet?");
        }


    }

    private static void metoda() {
        throw new RuntimeException("Ceva nu miroase a bine");
    }
}
