import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ExceptionThrow thrower = new ExceptionThrow();
        while (true) {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter numbers : ");
                int num1 = scan.nextInt();
                int num2 = scan.nextInt();
                System.out.println("Enter String: ");

                scan.nextLine();
                String name = scan.nextLine();
                thrower.getPositiveNumber(num1);
                thrower.divide(num1, num2);
                thrower.checkStringLength(name);
            } catch (  NullPointerException e) {
                System.out.println("Caught: " + e.getMessage());
            } catch (ArithmeticException e) {
                System.out.println("Caugh t: " + e.getMessage());

            } catch (myException e) {
                System.out.println("Caughft: " + e.getMessage());

            } finally {
                System.out.println("Finally block");
            }
        }
    }
    }

