import java.util.Scanner;

public class MainClass {

    public static void main(String[] args)  {

        System.out.println("Please enter year:");
        Scanner input = new Scanner(System.in);
        String year = input.next();
        int yearToCalculate = Integer.parseInt(year);
        EasterDate easterDate1 = new EasterDate(yearToCalculate);
        System.out.println(easterDate1.toString());
        easterDate1.calculateOneCycle();



    }

}
