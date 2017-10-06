import org.junit.Test;

/**
 * This is the testing class for the computus using JUnit. There are 4 tests that tries to set the year to valid and invalid years.
 */
public class ComputusTest {


    /**
     * Tests the computus with year 1990
     * @throws Exception
     */
    @Test
    public void testComputus1990() throws Exception {
        EasterDate test1 = new EasterDate("1990");
        System.out.println(test1.toString());
        test1.calculateOneCycle();
    }

    /**
     * tests the computus with random symbols and numbers
     * @throws Exception
     */
    @Test
    public void testComputusRandomSymbols() throws Exception {
        EasterDate test2 = new EasterDate("#sa()7");
        System.out.println(test2.toString());
        test2.calculateOneCycle();
    }

    /**
     * tests the computus with the yar 2017
     * @throws Exception
     */
    @Test
    public void testComputus2017() throws Exception {
        EasterDate test3 = new EasterDate("2017");
        System.out.println(test3.toString());
        test3.calculateOneCycle();
    }

    /**
     * tests the computus with the year 1670
     * @throws Exception
     */
    @Test
    public void testComputus1670() throws Exception {
        EasterDate test4 = new EasterDate("1670");
        System.out.println(test4.toString());
        test4.calculateOneCycle();
    }

}
