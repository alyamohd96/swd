import java.util.Random;

public class MergeClassDriver {

    public static void main(String args[])  {

        Random rand = new Random();
        int[] numberArray = new int[100];

        for(int num:numberArray)    {
            numberArray[num] = rand.nextInt(100);
        }



    }

}
