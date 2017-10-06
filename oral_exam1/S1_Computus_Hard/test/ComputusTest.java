import org.junit.Test;

public class ComputusTest {

    public int[] year = {1997,1998,1999,2000,2001,2002,2003,2020,2032,2037};
    public int[] month = {3,4,4,4,4,3,4,4,3,4};
    public int[] day =  {30,12,4,23,15,31,20,12,28,5};


    @Test
    public void testComputus1990() throws Exception {
        EasterDate test1 = new EasterDate("1990");
        System.out.println(test1.toString());
        test1.calculateOneCycle();
    }

    @Test
    public void testComputusRandomSymbols() throws Exception {
        EasterDate test2 = new EasterDate("#sa()7");
        System.out.println(test2.toString());
        test2.calculateOneCycle();
    }

    @Test
    public void testComputus2017() throws Exception {
        EasterDate test3 = new EasterDate("2017");
        System.out.println(test3.toString());
        test3.calculateOneCycle();
    }

    @Test
    public void testComputus1670() throws Exception {
        EasterDate test4 = new EasterDate("1670");
        System.out.println(test4.toString());
        test4.calculateOneCycle();
    }

    /*@Test
    public void testDates() throws Exception    {
        for(int i=0;i<year.length;i++)
            EasterDate testDates = new EasterDate(Integer.toString(year[i]));

    }*/

}
