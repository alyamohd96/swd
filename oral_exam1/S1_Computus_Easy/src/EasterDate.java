import java.lang.*;

public class EasterDate {

    public Date easterDate;

    public EasterDate(Date easterDate) {
        this.easterDate = easterDate;
    }

    public EasterDate(int y) {
        int year = y;
    }


    private EasterDate calculateEasterDate(int y)  {

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
        System.out.println();
        int day = (int) ((h+l-(7*m)+114) % 31) + 1;

    }
}
