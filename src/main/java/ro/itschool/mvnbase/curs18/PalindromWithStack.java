package ro.itschool.mvnbase.curs18;

import java.util.Stack;

public class PalindromWithStack implements Palindrom {
    @Override
    public boolean check(String word) {
        if (word == null) {
            return false;
        }
        if (palindromWithStack(word).equals(word)) {
            return true;
        }
        return false;

    }

    private String palindromWithStack(String word) {
        Stack<Character> characters = new Stack<>();
        for (int i = 0; i < word.length(); i++) {
            characters.push(word.charAt(i));
        }
        String palindrom = "";
        while (!characters.isEmpty()) {
            palindrom += characters.pop();
        }
        return palindrom;
    }
}
