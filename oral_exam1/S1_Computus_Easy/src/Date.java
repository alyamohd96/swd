public class Date {

    private int month;
    private int day;
    private int year;

    public Date(int month, int day, int year) {
        if(isMonthValid(month) && isDayValid(month, day, year))
            this.month = month;
            this.day = day;
            this.year = year;
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

    public String monthFullName(int month)  {
        switch (month)  {
            case 1:
                return "January";
                break;
            case 2:
                return "February";
                break;
            case 3:
                return "March";
                break;
            case 4:
                return "April";
                break;
            case 5:
                return "May";
                break;
            case 6:
                return "June";
                break;
            case 7:
                return "July";
                break;
            case 8:
                return "August";
                break;
            case 9:
                return "September";
                break;
            case 10:
                return "October";
                break;
            case 11:
                return "November";
                break;
            case 12:
                return "December";
                break;
        }
    }

}
