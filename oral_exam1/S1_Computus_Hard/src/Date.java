/**
 * The Date class is a class for storing dates. It contains the usual methods;
 * the accessor and mutator methods. It also has methods to check the validity of dates,
 * whether the year is a leap year, and it's own toString methods.
 *
 */
public class Date {

    /**
     * There are 3 fields. All the fields are private and of type integer.
     */
    private int month;          //stores the month
    private int day;            //stores the day
    private int year;           //stores the year

    /**
     * This Date constructor receives the year as it's parameter and
     * sets it to the class field year.
     * @param year
     */
    public Date(int year)   {
        this.year = year;
    }

    /**
     * This is the class constructor that accepts month day and year as its
     * parameter.
     * @param month month of the date of type int
     * @param day day of the date of type int
     * @param year year of the date of type int
     */
    public Date(int month, int day, int year) {
        if(isMonthValid(month) && isDayValid(month, day, year)) {
            this.month = month;
            this.day = day;
            this.year = year;
        }
        else
            throw new IllegalArgumentException("Date Invalid");
    }

    /**
     * Accessor method for the instance variable month.
     * @return integer month
     */
    public int getMonth() {
        return month;
    }

    /**
     * Accessor method for the instance variable day
     * @return integer day
     */
    public int getDay() {
        return day;
    }

    /**
     * Accessor method for the instance variable year
     * @return integer year
     */
    public int getYear() {
        return year;
    }

    /**
     * Mutator method for the month.
     * @param month
     */
    public void setMonth(int month) {
        if(!isMonthValid(month))
            throw new IllegalArgumentException("Month Invalid");
        else
            this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static boolean isDayValid(int month, int day, int year)  {
        if (day < 0 || day > 31)
            return false;
        else if(month == 4 || month == 6 || month == 9 || month == 11)
            if (day > 30)
                return false;
            else
                return true;
        else if(month == 2)
            if ((day == 29 && !isLeapYear(year)) || day > 29)
                return false;
            else
                return true;
        else
            return true;
    }

    public static boolean isMonthValid(int month)  {
        if (month < 1 || month > 12)
            return false;
        else
            return true;
    }

    public static boolean isLeapYear(int year)  {
        if(year%4 != 0)
            return false;
        else if(year%100 != 0)
            return true;
        else if(year%400 !=0)
            return false;
        else
            return true;
    }

    /**
     * private static method that returns the full name of the
     * month based on the integer input. For example, input 3 in
     * the method will return a String "March"
     * @param month
     * @return String of the month
     */
    private static String monthInString(int month)  {
        String monthInString;
        switch (month)  {
            case 1:
                monthInString = "January";
                break;

            case 2:
                monthInString =  "February";
                break;
            case 3:
                monthInString =  "March";
                break;
            case 4:
                monthInString =  "April";
                break;
            case 5:
                monthInString =  "May";
                break;
            case 6:
                monthInString =  "June";
                break;
            case 7:
                monthInString =  "July";
                break;
            case 8:
                monthInString =  "August";
                break;
            case 9:
                monthInString =  "September";
                break;
            case 10:
                monthInString =  "October";
                break;
            case 11:
                monthInString =  "November";
                break;
            case 12:
                monthInString =  "December";
                break;
            default:
                monthInString =  "Invalid month";
                break;
        }
        return monthInString;
    }

    /**
     * Public toString method that overrides the Object's toString method
     * @return string in the format month, day, year
     */
    @Override
    public String toString()    {
        String month = monthInString(this.month);
        String day = Integer.toString(this.day);
        String year = Integer.toString(this.year);

        return month + " " + day + ", " + year;
    }

}
