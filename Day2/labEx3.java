import java.util.Arrays;
import java.util.Random;

public class labEx3 {
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

	    System.out.println("Random array : "+ Arrays.toString(array));
            Arrays.sort(array);
            System.out.println("\nSorted array: " + Arrays.toString(array));

            long startTime = System.nanoTime();
            boolean found = binarySearch(array, inputNumber);
            long endTime = System.nanoTime();

            System.out.println("Binary search for value " + inputNumber + " found: " + found);
            System.out.println("Binary search running time: " + (endTime - startTime) + " nanoseconds");
        } else {
            System.out.println("You entered an invalid type of data. Please enter only integer numbers.");
        }
    }

    private static boolean binarySearch(int[] array, int num) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (array[mid] == num) {
                return true;
            }
            if (array[mid] < num) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }
}
