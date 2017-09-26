import java.lang.*;

/**
 * This EasterDate class is a class that calculates the EasterDate.
 *
 *
 */

public class EasterDate {

    private Date easterDate;
    private int[] dateArray;

    /**
     * Default constructor with the year as an input
     * @param year year of the easter date
     */
    public EasterDate(int year) {
        easterDate.setYear(year);
    }

    /**
     * Calculate the Easter Date in the year using the
     * Anonymous Gregorian algorithm based on wikipedia:
     * https://en.wikipedia.org/wiki/Computus#Anonymous_Gregorian_algorithm
     * @param y the year we want to find out the easter date for
     */
    public void calculateEasterDate(int y)  {

        //The algorithm for calculating the Easter Date
        double a = y % 19;
        double b = Math.floor(y/100);
        System.out.println("b is" + b);
        double c = y % 100;
        double d = Math.floor(b/4);
        double e = b % 4;
        double f = Math.floor((b+8)/25);
        double g = Math.floor((b-f+1)/3);
        double h = ((19*a) + b - d - g + 15) % 30;
        double i = Math.floor(c/4);
        double k = c % 4;
        double l = (32 + (2*e) + (2*i) - h - k) % 7;
        double m = Math.floor((a+(11*h)+22l)/31);
        int month = (int) Math.floor((h+l-(7*m)+114)/31);
        int day = (int) ((h+l-(7*m)+114) % 31) + 1;
        easterDate.setMonth(month);
        easterDate.setDay(day);
        System.out.println();


    }

    public void calculateEntireCycle()   {

    }


}
