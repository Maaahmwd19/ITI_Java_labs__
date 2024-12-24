import java.util.Random;
import java.util.Arrays;

public class labEx1{
public static void main(String[] agrs){

	int[] array = new int[1000];
	Random rand = new Random();

	for (int i=0; i<array.length ;i++)
	{
		array[i] = rand.nextInt(10000);
	}
	System.out.println("Random valus of array : "+ Arrays.toString(array));
	long ST = System.nanoTime();
	int max = findMax(array);
	int min = findMin(array);
	long ET = System.nanoTime();

	System.out.println("\nMinimum: "+min);
        System.out.println("\nMaximum: "+max);
        System.out.println("\nsearch running time [ " + (ET-ST)+" ] nsec");


}
	private static int findMax(int[] array){
		int max = Integer.MIN_VALUE;
		for(int val : array){
			if(val>max){
				max = val;
			}
		}
		return max;
	}

        private static int findMin(int[] array){
                int min = Integer.MAX_VALUE;
                for(int val : array){
                        if(val<min){
                                min = val;
                        }
                }
                return min;
        }






}
