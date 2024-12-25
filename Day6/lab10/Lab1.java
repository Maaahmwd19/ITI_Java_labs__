import MyDictionary.*;
import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the Action needed:\n" +
                    "1 - Add word\n" +
                    "2 - Print Dictionary\n" +
                    "3 - Print words starting with a character\n" +
                    "4 - Exit\n" +
                    "--------------------------------------------\n");

            int action = scan.nextInt();
            scan.nextLine();
            switch (action) {
                case 1: {
                    boolean flag = true;
                    while (flag) {
                        if (flag == true) {
                            System.out.println("Enter word to add to dictionary:");
                            String word = scan.nextLine();
                            dictionary.addWord(word);
                            System.out.println("want to add more !!.. if yes press 1 if not press 0");
                            int F= scan.nextInt();
                            scan.nextLine();
                            if(F==0)
                                flag=false;
                        }
                    }
                }
                break;

                case 2: {
                    dictionary.printAll();
                }
                break;

                case 3: {
                    System.out.println("Enter character to display words in dictionary:");
                    String str = scan.nextLine();
                    if (!str.isEmpty()) {
                        char character = str.charAt(0);
                        dictionary.printWords(character);
                    } else {
                        System.out.println("No character entered!");
                    }
                }
                break;

                case 4: {
                    System.out.println("Thank you...!");
                    scan.close();
                    System.exit(0);
                }
                break;

                default: {
                    System.out.println("Invalid action. Please try again.");
                }
            }
        }
    }
}
