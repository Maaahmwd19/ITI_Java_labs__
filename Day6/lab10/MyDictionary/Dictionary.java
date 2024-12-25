package MyDictionary;

import java.util.*;

public class Dictionary {
    private Map<Character, List<String>> dictionary;
    public Dictionary(){
        dictionary = new TreeMap<>();
        for (char ch = 'a'; ch <= 'z'; ch++){
            dictionary.put(ch, new LinkedList<>());
        }
    }
    public void addWord(String word){
        dictionary.get(Character.toLowerCase(word.charAt(0))).add(word.toLowerCase());
        Collections.sort(dictionary.get(Character.toLowerCase(word.charAt(0))));
    }

    public void printAll(){
        char ch = 'a';
        for (List<String> lst: dictionary.values()){
            System.out.print(ch + ":");

            System.out.println(lst);
            System.out.println("------------------------------");
            ch++;
        }
    }
    public void printWords(char ch){
        System.out.println(dictionary.get(Character.toLowerCase(ch)));
    }
}
