import java.util.Random;
import java.util.Arrays;


public class labEx2 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide an integer as a command-line argument.");
            return;
        }

        String numberPattern = "^-?\\d+$";
        String numStr = args[0];

        if (numStr.matches(numberPattern)) {
            int inputNumber = Integer.parseInt(numStr);
            int[] array = new int[1000];
            Random rand = new Random();

            for (int i = 0; i < array.length; i++) {
                array[i] = rand.nextInt(10000);
            }
	    System.out.println("Random Values for the array : "+ Arrays.toString(array));
            long startTime = System.nanoTime();
            boolean found = linearSearch(array, inputNumber);
            long endTime = System.nanoTime();

            System.out.println("\nLinear search for value [ " + inputNumber + " ] found: " + found);
            System.out.println("Linear search running time: " + (endTime - startTime) + " nanoseconds");
        } else {
            System.out.println("You entered an invalid type of data. Please enter only integer numbers.");
        }
    }

    private static boolean linearSearch(int[] array, int num) {
        for (int value : array) {
            if (value == num) {
                return true;
            }
        }
        return false;
    }
}
