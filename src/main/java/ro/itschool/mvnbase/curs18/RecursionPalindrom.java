package ro.itschool.mvnbase.curs18;

public class RecursionPalindrom implements Palindrom{
    @Override
    public boolean check(String word) {
       if (word==null){
           return false;
       }
        if (recursionReverse(word).equals(word)){
            return true;
        }
        return false;
    }

    private String recursionReverse(String word){
        if (word.equals("")){
            return "";
        }else {
            return recursionReverse(word.substring(1))+ word.charAt(0);
        }
    }
}
