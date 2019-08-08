package ro.itschool.mvnbase.curs16;

public class TooLongException extends Exception {
    private final String word;

    public TooLongException(String word) {
        super("This is not an integer");
        this.word = word;
    }

    public String getWord(){
        return word;
    }


}
