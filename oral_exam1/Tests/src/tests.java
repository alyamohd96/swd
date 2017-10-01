import java.util.Scanner;

public class tests {

    public static void main(String[] args)  {
        /*System.out.println("Input:");
        Scanner input = new Scanner(System.in);
        String inputAsString = input.nextLine();
        System.out.println("input as string:" + inputAsString);
        char[] inputAsChar = inputAsString.toCharArray();
        System.out.println("Input as char array:"+ new String(inputAsChar));

        char alphabet[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

        char[] space = {'a','b','D','e',' '};
        System.out.println("Test" + new String(space) + "if space works");
        String test = "ALL UPPERCASE";
        boolean canOrNot = isAlpha(test);
        System.out.print(canOrNot);*/

        String str = "MEET ME AT THREE";
        char[] ch  = str.toCharArray();
        int i = 0;
        int[] strInInt = new int[ch.length];
        for(char c : ch)
        {
            int temp = (int)c;
            int temp_integer = 64; //for upper case
            if(temp>=65 && temp<=90) {
                strInInt[i] = temp - temp_integer;
                System.out.print(temp - temp_integer + " ");
            }
            else {
                strInInt[i] = 32;
                System.out.println(" space ");
            }
            i++;
        }
    }


    public static boolean isAlpha(String name) {
        char[] chars = name.toCharArray();

        for (char c : chars) {
            if(!Character.isLetter(c) && !(c == ' ')) {
                return false;
            }
        }

        return true;

    }
}
