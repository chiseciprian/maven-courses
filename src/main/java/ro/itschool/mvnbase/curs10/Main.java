package ro.itschool.mvnbase.curs10;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> words = new java.util.ArrayList<>();
        words.add("Ana");
        words.add("are");
        words.add("mere");
        words.add("multe");
        words.add("mere");
        words.add("si");
        words.add("pere");
        words.add("Ana");
        words.add("si");
        words.add("Maria");
        words.add("si");
        words.add("Ionut");

        List<String> result = duplicateWord("mere", words);
        System.out.println(result);

        List<String> removeWord = removeWord("mere", words);
        System.out.println(removeWord);

        removeWordRef("Ana", words);
        System.out.println(words);

        // System.out.println(unicWords(words));

        System.out.println(unicWordsList(words));

    }

    public static void removeWordRef(String word, List<String> words) {
        Iterator<String> wordIterator = words.iterator();
        while (wordIterator.hasNext()) {
            String next = wordIterator.next();
            if (next.equals(word)) {
                wordIterator.remove();
            }
        }
    }

    public static List<String> removeWord(String word, List<String> words) {
        List<String> result = new ArrayList<>();
        for (String element : words) {
            if (!element.equals(word)) {
                result.add(element);
            }
        }
        return result;
    }


    public static List<String> duplicateWord(String word, List<String> words) {
        List<String> result = new ArrayList<>();
        for (String element : words) {
            result.add(element);
            if (element.equals(word)) {
                result.add(element);
            }
        }
        return result;
    }

    public static Set<String> unicWords(List<String> words) {
        Set<String> unic = new HashSet<>(words);

        return unic;
    }

    public static List<String> unicWordsList(List<String> words) {
        List<String> result = new ArrayList<>();

        for (String elements1 : words) {
            if (!result.contains(elements1)) {
                result.add(elements1);
            }
        }
        return result;
    }


}
