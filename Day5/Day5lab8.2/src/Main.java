import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter String1 for check character: ");
        String St3  = scan.nextLine();
        System.out.print("Enter String2 for check character: ");
        String St4  = scan.nextLine();

        checkChar check1 = str -> str != null && !str.isEmpty() && str.matches("[A-Za-z]+");// using regex
        checkChar Check2 = str->str != null && !str.isEmpty() && str.chars().allMatch(Character::isLetter); //using listLetter
        System.out.println("checking for string1 isLetter:  "+check1.isCharacter(St3));
        System.out.println("checking for string2 isLetter:  "+Check2.isCharacter(St4));

    }
}