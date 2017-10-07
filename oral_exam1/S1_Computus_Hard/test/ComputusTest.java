import org.junit.Test;

public class ComputusTest {



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

}
