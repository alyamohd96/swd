/**
 * The Trapezoid class extends the TwoDimensionalShapes. The methods that
 * are specific to this class is the setters and getters for the instance
 * fields, calculateArea function and calculatePerimeter function which calculates
 * the area the perimeter respectively given the dimensions of the
 * trapezoid
 */
public class Trapezoid extends TwoDimensionalShapes{

    private int dimXTop;
    private int sideA;
    private int sideB;
    private double perimeter;
    private double area;

    /**
     * Constructor with the argument name of the trapezoid as its parameter.
     * It calls the super class constructor(TwoDimensionalShapes).
     * @param name the name of the trapezoid
     */
    public Trapezoid(String name)   {
        super(name);
    }

    /**
     * Constructor with the 6 arguments. The
     * @param name the name of the trapezoid
     * @param dimX the dimensions of the trapezoid on the x axis
     * @param dimY the dimensions of the trapezoid on the y axis
     * @param dimXTop the top dimensions of the trapezoid on the x axis
     * @param sideA one side of the trapezoid
     * @param sideB one side of the trapezoid
     */
    public Trapezoid(String name, int dimX, int dimY, int dimXTop, int sideA, int sideB, double perimeter, double area) {
        super(name, dimX, dimY);
        this.dimXTop = dimXTop;
        this.sideA = sideA;
        this.sideB = sideB;
        this.perimeter = calculatePerimeter(dimX,dimXTop,sideA,sideB);
        this.area = calculateArea(dimX,dimXTop,dimY);
    }

    /**
     * A static method for calculating the perimeter of the trapezoid given
     * the dimensions
     * @param dimX the dimensions of the trapezoid on the x axis
     * @param dimXTop the top dimensions of the trapezoid on the x axis
     * @param sideA one side of the trapezoid
     * @param sideB one side of the trapezoid
     * @return
     */
    private static double calculatePerimeter(int dimX, int dimXTop, int sideA, int sideB)   {
        return dimX + dimXTop + sideA + sideB;
    }

    /**
     * A static method for calculating the area of the trapezoid given
     * the dimensions
     * @param dimX the dimensions of the trapezoid on the x axis
     * @param dimXTop the top dimensions of the trapezoid on the x axis
     * @param dimY the dimensions of the trapezoid on the y axis
     * @return
     */
    private static double calculateArea(int dimX, int dimXTop, int dimY)    {
        return ((dimX + dimY)/2) * dimY;
    }
}
