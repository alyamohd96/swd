/**
 * The Triangle class extends the TwoDimensionalShapes. The methods that
 * are specific to this class is the setters and getters for the instance
 * fields, calculateArea function and calculatePerimeter function which
 * the area the perimeter respectively given the dimensions of the
 * rectangle
 */
public class Triangle extends TwoDimensionalShapes {

    private double sideA;
    private double sideB;
    private double perimeter;
    private double area;

    /**
     * Constructor with the argument name of the triangle as its parameter.
     * It calls the super class constructor(TwoDimensionalShapes).
     * @param name the name of the triangle
     */
    public Triangle(String name)    {
        super(name);
    }

    /**
     *
     * Constructor with the 3 arguments; the name, the dimensions on the x axis
     * and the dimensions on the y axis
     * It calls the super class constructor(TwoDimensionalShapes).
     * @param name the name of the square
     * @param dimX the dimensions on the x axis
     * @param dimY the dimensions on the x axis
     */
    public Triangle(String name, int dimX, int dimY)    {
        super(name, dimX, dimY);
    }

    /**
     * Constructor with the 5 arguments; the name, the dimensions on the x axis,
     * the dimensions on the y axis, and the sides of the triangle
     * @param name the name of triangle
     * @param dimX the dimensions on the x axis
     * @param dimY the dimensions on the y axis
     * @param sideA a side of the triangle
     * @param sideB a side of the triangle
     */
    public Triangle(String name, int dimX, int dimY, double sideA, double sideB)    {
        super(name, dimX, dimY);
        this.sideA = sideA;
        this.sideB = sideB;
        this.perimeter = calculatePerimeter(dimX, sideA, sideB);
        this.area = calculateArea(dimX, dimY);
    }

    /**
     * A static method for calculating the perimeter of the triangle given
     * the dimensions
     * @param dimX the dimensions on the x axis
     * @param sideA a side of the triangle
     * @param sideB a side of the triangle
     * @return the perimeter of the triangle
     */
    private static double calculatePerimeter(int dimX, double sideA, double sideB) {
        return dimX + sideA + sideB;
    }

    /**
     * A static method for calculating the area of the triangle given
     * the dimensions
     * @param dimX the dimensions on the x axis
     * @param dimY the dimensions on the y axis
     * @return the area of the triangle
     */
    private static int calculateArea(int dimX, int dimY)  {
        return (1/2) * dimX * dimY;
    }
}
