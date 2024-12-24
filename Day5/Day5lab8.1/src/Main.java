import java.util.Scanner;
import java.util.function.Predicate;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 1st String for is better : ");
        String St1  = scan.nextLine();
        System.out.print("Enter 2ed String for is better : ");
        String St2  = scan.nextLine();


        String longer = StringUtils.betterString(St1, St2,(s1,s2 ) -> St1.length() > St2.length());
        System.out.println(longer);
        String first = StringUtils.betterString(St1, St1,(st1 ,s2 )-> true);
        System.out.println(first);






    }
}