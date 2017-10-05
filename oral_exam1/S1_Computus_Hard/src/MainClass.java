import java.util.Scanner;

public class MainClass {

    public static void main(String[] args)  {

        System.out.println("Please enter year:");
        Scanner input = new Scanner(System.in);
        String year = input.next();

        EasterDate easterDate1 = new EasterDate(year);
        System.out.println(easterDate1.toString());
        easterDate1.calculateOneCycle();

    }

}
