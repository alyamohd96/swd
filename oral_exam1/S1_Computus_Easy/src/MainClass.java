import java.util.Arrays;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args)  {

        Integer marchEasterDays[] = {22,23,24,25,26,27,28,29,30,31};

        System.out.println("Please enter year:");
        Scanner input = new Scanner(System.in);
        String year = input.next();
        int yearToCalculate = Integer.parseInt(year);
        EasterDate easterDate1 = new EasterDate(yearToCalculate);
        System.out.println(easterDate1.toString());
        easterDate1.calculateOneCycle();


    }

}
