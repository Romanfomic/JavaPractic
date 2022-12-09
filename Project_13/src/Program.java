import Adress.TestAdress;
import Person.TestPerson;
import Shirt.TestShirt;
import Telephone.TestTelephone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Program {
    public static void main(String[] args){
        str("I like Java!!!");
        TestPerson.test();
        TestAdress.test();
        TestShirt.test();
        TestTelephone.test();
        word();
    }
    static void str(String value){
        System.out.printf("The string: %s\n", value);
        System.out.printf("Last symbol: %s\n", value.charAt(value.length()-1));
        System.out.printf("String ends with \"!!!\": ");
        if(value.endsWith("!!!")){ System.out.printf("True\n"); }
        else{ System.out.printf("False\n"); }
        System.out.printf("String starts with \"I like\": ");
        if(value.startsWith("I like")){ System.out.printf("True\n"); }
        else{ System.out.printf("False\n"); }
        System.out.printf("String contains \"Java\": ");
        if(value.contains("Java")){ System.out.printf("True\n"); }
        else{ System.out.printf("False\n"); }
        System.out.printf("Index of \"Java\": %s\n", value.indexOf("Java"));
        String replace = value.replace("a", "o");
        System.out.printf("Replace 'a' to 'o': %s\n", replace);
        System.out.printf("Upper register: %s\n", value.toUpperCase());
        System.out.printf("Lower register: %s\n", value.toLowerCase());
        System.out.printf("Substring: %s\n", value.substring(7, 11));
    }
    static void word(){
        String str = "abcd jklm ghij defg";
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        ArrayList<String> wordsList = new ArrayList<>();

        wordsList.addAll(Arrays.asList(words));
        while (isTrue(wordsList)) {
            Collections.shuffle(wordsList);
        }
        for (String word: wordsList){
            result.append(word).append(" ");
        }
        result.deleteCharAt(result.length()-1);
        System.out.printf("%s\n", result);
    }
    public static boolean isTrue(ArrayList<String> wordsList) {
        for (int i = 0; i < wordsList.size() - 1; i++) {
            String firstWord = wordsList.get(i).toLowerCase();
            String secondWord = wordsList.get(i + 1).toLowerCase();
            if (firstWord.charAt(firstWord.length() - 1) != secondWord.charAt(0)) return true;
        }
        return false;
    }
}
