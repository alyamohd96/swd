import java.lang.*;
import java.util.Arrays;

/**
 * This EasterDate class is a class that calculates the EasterDate.
 * The fields for this class is easterDate of type Date. It stores the
 * calculated easterDate
 *
 */

public class EasterDate {

    /**
     * The instance variable "easterDate" is of type Date. It stores the easter date
     * after it is calculated.
     */
    private Date easterDate;       //stores the easter date in Date type class
    /**
     * The instance variable "aprilCount" is of type integer array. It has 26 elements and
     * is initialized to the default value. This array is used to store the number of times
     * easter falls on a specific day in April.
     */
    private int[] aprilCount = new int[26];
    /**
     * The instance variable "marchCount" is of type integer array. It has 10 elements and
     * is initialized to the default value. This array is used to store the number of times
     * easter falls on a specific day in March.
     */
    private int[] marchCount = new int[10];
    /**
     * The instance variable "aprilEasterDays" is of type integer array. It has 26 elements and
     * is initialized to numbers from 1 to 26.
     */
    private final Integer aprilEasterDays[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26};
    /**
     * The instance variable "marchEasterDays" is of type integer array. It has 10 elements and
     * is initialized to numbers from 22 to 31;
     */
    private final Integer marchEasterDays[] = {22,23,24,25,26,27,28,29,30,31};

    /**
     * Default constructor with the year as an input. It validate the
     * year by checking if contains anything other than numbers. It also v
     * validates the year lesser than 1700 as the easter date started on
     * 1770. If all the validity passes, the constructor calls the method
     * calculateEasterDate to calculate the easter date and set it to the instance
     * variable easterDate
     *
     * @param input year in String
     */
    public EasterDate(String input) {
        if (!isNumber(input)) {
            throw new IllegalArgumentException("Accepts only numbers!");
        }
        else if(Integer.parseInt(input) <1700)   {
            throw new IllegalArgumentException("Easter was not recorded till the year 1700.");
        }
        else {
            int year = Integer.parseInt(input);
            int[] monthDay = calculateEasterDate(year);
            easterDate = new Date(monthDay[0], monthDay[1], year);
        }
    }

    /**
     * Calculate the Easter Date in the year using the
     * Anonymous Gregorian algorithm based on wikipedia:
     * https://en.wikipedia.org/wiki/Computus#Anonymous_Gregorian_algorithm
     * @param y the year we want to find out the easter date for
     * @return a integer array of size 2. int[0] stores month and int[1] stores the day
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
     * This method calculates the Easter Date for one entire cycle
     * which lasts for 5,700,000 years. Then it will print the number
     * of times Easter lands on a specific date for one cycle.
     */
    public void calculateOneCycle()    {
        int[] resultTemporary = new int[2];
        int index;
        int year = 1876;
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
     *Prints the number of times Easter lands on a specific date
     */
    private void printDatesOccurrence()  {
        for(int i = 0;i<marchCount.length;i++)
            System.out.println("March " + marchEasterDays[i] + " = " + marchCount[i]);
        for(int i = 0;i<aprilCount.length;i++)
            System.out.println("April " + aprilEasterDays[i] + " = " + aprilCount[i]);
    }

    /**
     * A method that checks whether the input is numbers or not.
     * Returns true if the input is only numbers and false
     * if it contains anything else
     * @param input Input from user of type String
     * @return true if the argument contains only numbers. false if not
     */
    private static boolean isNumber(String input)   {
        return input.matches("[-+]?\\d*\\.?\\d+");
    }

    /**
     * toString method that overrides the default toString method from
     * the Object class.
     * @return String. The calculated Easter Date in the format month day, year
     */
    @Override
    public String toString()    {
        return easterDate.toString();
    }


}
