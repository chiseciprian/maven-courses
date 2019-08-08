package ro.itschool.mvnbase.curs18;

public class Palindrom1Index implements Palindrom {

    @Override
    public boolean check(String word) {
        if (word == null) {
            return false;
        }
        for (int i = word.length() - 1; i >= 0; i--) {
            if (word.charAt(i) != word.charAt(word.length()-1-i)) {
                return false;
            }
        }
        return true;
    }
}


