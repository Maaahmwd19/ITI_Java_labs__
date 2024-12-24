import java.util.regex.*;


public class LabExercise3
{
public static void main(String[] args){


if(args.length>=2)
{

	String numberPattern = "^-?\\d+$";  
        String inputStringPattern = "^[a-zA-Z]+$";

	String numberArg = args[0];
        String stringArg = args[1];
	if (numberArg.matches(numberPattern)) {
        int number = Integer.parseInt(numberArg);
	if (stringArg.matches(inputStringPattern)) {
 			for (int i = 0; i < number; i++) {
                        System.out.println(stringArg);
                   	 }
                } else {
                    System.out.println("Error: The second argument must only contain letters.");
                }
            } else {
                System.out.println("Error: The first argument must be a valid integer.");
            }
        } else {
            System.out.println("Please provide two arguments: a number and a string.");
        }


    }
}
