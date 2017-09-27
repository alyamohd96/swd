import java.lang.*;
import java.util.Arrays;

/**
 * This EasterDate class is a class that calculates the EasterDate.
 * The fields for this class is easterDate of type Date. It stores the
 * calculated easterDate
 *
 */

public class EasterDate {

    //class fields
    private Date easterDate;       //stores the easter date in Date type class
    private int[] dateArray;
    private int[] aprilCount = new int[26];
    private int[] marchCount = new int[10];
    private final Integer aprilEasterDays[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26};
    private final Integer marchEasterDays[] = {22,23,24,25,26,27,28,29,30,31};

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

        int[] monthDay = new int[2];
        monthDay[0] = (int) Math.floor((h+l-(7*m)+114)/31);
        monthDay[1] = (int) ((h+l-(7*m)+114) % 31) + 1;

        return monthDay;
    }

    /**
     *
     */
    public void calculateOneCycle()    {
        int[] resultTemporary = new int[2];
        int index;
        int count = 0;
        int year = 1876;
        //for(int i=0; i<5700000;i++)
        for (int i = 0; i<5700000; i++)   {
            resultTemporary = calculateEasterDate(year);
            if(resultTemporary[0] == 3) {
                index = Arrays.asList(marchEasterDays).indexOf(resultTemporary[1]);
                marchCount[index]++;
            }
            else    {
                index = Arrays.asList(aprilEasterDays).indexOf(resultTemporary[1]);
                aprilCount[index]++;
            }
            year++;
        }
        printDatesOccurrence();
    }

    /**
     *
     */
    private void printDatesOccurrence()  {
        for(int i = 0;i<marchCount.length;i++)
            System.out.println("March " + marchEasterDays[i] + " = " + marchCount[i]);
        for(int i = 0;i<aprilCount.length;i++)
            System.out.println("April " + aprilEasterDays[i] + " = " + aprilCount[i]);
    }

    @Override
    public String toString()    {
        return easterDate.toString();
    }


}
