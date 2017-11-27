import java.util.Arrays;
import java.util.Random;

public class MergeClassDriver {

    public static void main(String args[])  {

        Random rand = new Random();
        final int[] numberArray = new int[100];

        for(int num = 0; num<numberArray.length; num++)    {
            numberArray[num] = rand.nextInt(100);
        }

        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(numberArray)+"\n");

        MergeSort.sort(numberArray, 0, numberArray.length-1);

        System.out.println("After sorting:");
        System.out.println(Arrays.toString(numberArray)+"\n");
    }
}
