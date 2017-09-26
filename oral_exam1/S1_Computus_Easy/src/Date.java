public class Date {

    private int month;
    private int day;
    private int year;

    public Date(int month, int day, int year) {
        if(isMonthValid(month) && isDayValid(month, day, year)) {
            this.month = month;
            this.day = day;
            this.year = year;
        }
        else
            System.out.println("Invalid month or day");     //try with exception
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public void setMonth(int month) {
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
        if (month < 0 || month > 12)
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

        return month + ", " + day + ", " + year;
    }

}
