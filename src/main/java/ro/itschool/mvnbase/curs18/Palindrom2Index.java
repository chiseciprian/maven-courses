package ro.itschool.mvnbase.curs18;

public class Palindrom2Index implements Palindrom {
    public boolean check(String word) {
        if (word == null) {
            return false;
        }
        int start = 0;
        int end = word.length() - 1;
        while (start <= end) {
            if (word.charAt(start) == word.charAt(end)) {
                start++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }
}
