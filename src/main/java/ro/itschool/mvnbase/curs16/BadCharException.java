package ro.itschool.mvnbase.curs16;

public class BadCharException extends Exception {
    private final String word;

    public BadCharException(String word) {
       super("character at posotion ");
        this.word = word;
    }

    public String getWord() {
        return word;
    }
}
