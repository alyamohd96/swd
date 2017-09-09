import java.util.Scanner;

public class tests {

    public static void main(String[] args)  {
        /*System.out.println("Input:");
        Scanner input = new Scanner(System.in);
        String inputAsString = input.nextLine();
        System.out.println("input as string:" + inputAsString);
        char[] inputAsChar = inputAsString.toCharArray();
        System.out.println("Input as char array:"+ new String(inputAsChar));*/

        char[] space = {'a','b','D','e'};
        System.out.println("Test" + new String(space) + "if space works");
        String test = "ALL UPPERCASE";
        boolean canOrNot = isAlpha(test);
        System.out.print(canOrNot);

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
