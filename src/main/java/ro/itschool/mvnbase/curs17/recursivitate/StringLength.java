package ro.itschool.mvnbase.curs17.recursivitate;

public class StringLength {
    public int stringLenght(String word){
        if (word.equals("")){
            return 0;
        }else {
            return 1+stringLenght(word.substring(1));
        }
    }
}
