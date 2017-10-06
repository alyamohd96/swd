/**
 * This is the driver class for S1_Computus_Hard. It asks for a user input
 * for the year to calculate the Easter Date. It will then create an object
 * of type EasterDate called easterDate1 and prints the easter date
 * It will also calls the method to calculate one whole cycle of easter.
 */

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args)  {

        //asks for the user input. takes the input and assign it to a String
        System.out.println("Please enter year:");
        Scanner input = new Scanner(System.in);
        String year = input.next();

        //created a new EasterDate object and prints the date easter falls on that year.
        // also calculate one cycle of easter
        EasterDate easterDate1 = new EasterDate(year);
        System.out.println(easterDate1.toString());
        easterDate1.calculateOneCycle();

    }

}
