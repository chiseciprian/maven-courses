package ro.itschool.mvnbase.curs18;

public class PalindromRecursionAll implements Palindrom {
    @Override
    public boolean check(String word) {
        if (word == null) {
            return false;
        }
        if (word.equals("") || word.length() == 1) {
            return true;
        } else {
            if (word.charAt(0) == (word.charAt(word.length() - 1))) {
               return check(word.substring(1, word.length() - 1));
            } else {
                return false;
            }
        }
    }


}
