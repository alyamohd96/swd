public enum Date {

    Jan(1),
    Feb(2),
    Mar(3),
    Apr(4),
    May(5),
    June(6),
    July(7),
    Aug(8),
    Sept(9),
    Oct(10),
    Nov(11),
    Dec(12);

    private final int month;
    private final int day;
    private final int[] MONTH_31_DAYS = {1,3,5,7,8,10,12};

    Date(int month) {
        this.month = month;
    }

    Date(int month, int day)    {
        this.month = month;
        this.day = day;
    }

    public static boolean isDayValid(int month, int day, int year)  {
        if (day < 0 || day > 31)
            return false;
        else if(month == 4 || month == 6 || month == 9 || month == 11)
            if (day > 30)
                return false;
        else if(month == 2)
            if (day > 30 || )


    }

    public static boolean isMonthValid(int monthInput)  {
        if (monthInput < 0 || monthInput > 12)
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

}
