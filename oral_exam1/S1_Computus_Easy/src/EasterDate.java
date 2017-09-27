import java.lang.*;

/**
 * This EasterDate class is a class that calculates the EasterDate.
 * The fields for this class is easterDate of type Date. It stores the
 * calculated easterDate
 *
 */

public class EasterDate {

    private Date easterDate;
    //private int[] dateArray;

    /**
     * Default constructor with the year as an input.
     * It calls the
     * @param year year of the easter date
     */
    public EasterDate(int year) {
        int[] monthDay = calculateEasterDate(year);
        easterDate = new Date(monthDay[0],monthDay[1],year);
    }

    /**
     * Calculate the Easter Date in the year using the
     * Anonymous Gregorian algorithm based on wikipedia:
     * https://en.wikipedia.org/wiki/Computus#Anonymous_Gregorian_algorithm
     * @param y the year we want to find out the easter date for
     */
    private static int[] calculateEasterDate(int y)  {

        //The algorithm for calculating the Easter Date
        double a = y % 19;
        double b = Math.floor(y/100);
        double c = y % 100;
        double d = Math.floor(b/4);
        double e = b % 4;
        double f = Math.floor((b+8)/25);
        double g = Math.floor((b-f+1)/3);
        double h = ((19*a) + b - d - g + 15) % 30;
        double i = Math.floor(c/4);
        double k = c % 4;
        double l = (32 + (2*e) + (2*i) - h - k) % 7;
        double m = Math.floor((a+(11*h)+22l)/451);


        System.out.println("a is " + a);
        System.out.println("b is " + b);
        System.out.println("c is " + c);
        System.out.println("d is " + d);
        System.out.println("e is " + e);
        System.out.println("f is " + f);
        System.out.println("g is " + g);
        System.out.println("h is " + h);
        System.out.println("i is " + i);
        System.out.println("k is " + k);
        System.out.println("l is " + l);
        System.out.println("m is " + m);

        int[] monthDay = new int[2];
        monthDay[0] = (int) Math.floor((h+l-(7*m)+114)/31);
        monthDay[1] = (int) ((h+l-(7*m)+114) % 31) + 1;

        System.out.println(monthDay[0]);
        System.out.println(monthDay[1]);
        //easterDate.setMonth(month);
        //easterDate.setDay(day);
        //System.out.println(easterDate.toString());
        return monthDay;
    }

    /*
    private static int[] calculateOneCycle()    {
        for(i)
    }*/

    @Override
    public String toString()    {
        return easterDate.toString();
    }

}
