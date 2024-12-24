import java.util.*;

public class labEx1 {
    public static void main(String[] args) {
        if (args.length >= 1) {
            String sentence = "ITI develops people and ITI house of developers and ITI for people";
            String strWord = args[0];

            // First Method: Using split and loop
            String[] words = sentence.split(" ");
            int counter = 0;

            for (String word : words) {
                if (strWord.equals(word)) {
                    counter++;
                }
            }

            if (counter > 0) {
                System.out.println("The count of the word [ " + strWord + " ] using Method 1 is: " + counter);
            } else {
                System.out.println("The word is not found in the sentence using Method 1.");
            }

            // Second Method: Using replace
            String replacedSentence = sentence.replace(strWord, "");
            int count = (sentence.length() - replacedSentence.length()) / strWord.length();

            if (count > 0) {
                System.out.println("The count of the word [ " + strWord + " ] using Method 2 is: " + count);
            } else {
                System.out.println("The word is not found in the sentence using Method 2.");
            }
        } else {
            System.out.println("Please provide one word as input.");
        }
    }
}
