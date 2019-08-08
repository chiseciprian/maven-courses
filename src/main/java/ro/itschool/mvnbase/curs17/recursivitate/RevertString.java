package ro.itschool.mvnbase.curs17.recursivitate;

public class RevertString {
    public String revertString(String word){
        if (word.equals("")){
            return "";
        }else {
            return word.charAt(word.length()-1)+revertString(word.substring(0,word.length()-1));
        }
    }

    public String reverStringTwo(String word){
        if (word.equals("")){
            return "";
        }else {
            return reverStringTwo(word.substring(1))+ word.charAt(0);
        }
    }
}
