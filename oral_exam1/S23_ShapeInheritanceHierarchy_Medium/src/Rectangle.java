/**
 * The Rectangle class extends the TwoDimensionalShapes. The methods that
 * are specific to this class is the setters and getters for the instance
 * fields, calculateArea function, and calculatePerimeter function which
 * the area the perimeter respectively given the dimensions of the
 * rectangle
 *
 */
public class Rectangle extends TwoDimensionalShapes{

    /**
     * The instance variable perimeter stores the perimeter of
     * the rectangle
     */
    private double perimeter;
    /**
     * The instance variable perimeter stores the area of
     * the rectangle
     */
    private double area;

    /**
     * Constructor with the argument name of the rectangle as its parameter.
     * It calls the super class constructor(TwoDimensionalShapes).
     * @param name the name of the rectangle
     */
    public Rectangle(String name)   {
        super(name);
    }

    /**
     * Constructor with the argument name of the rectangle and the two dimensions
     * as its parameter. It calls the super class constructor(TwoDimensionalShapes).
     * @param name the name of the rectangle
     * @param dimX the length of the rectangle
     * @param dimY the width of the rectagle
     */
    public Rectangle(String name, int dimX, int dimY)   {
        super(name, dimX, dimY);
        this.perimeter = calculatePerimeter(dimX,dimY);
        this.area = calculateArea(dimX,dimY);
    }

    /**
     * Accessor method for the perimeter instance variable.
     * @return the perimeter of the rectangle
     */
    public double getPerimeter() {
        return perimeter;
    }

    /**
     * Accessor method for the area instance variable.
     * @return the area of the rectangle
     */
    public double getArea() {
        return area;
    }

    /**
     * A static method for calculating a perimeter of the rectangle given
     * the two dimensions of the rectangle
     * @param dimX the length of the cube
     * @param dimY the width of the cube
     * @return perimeter of the rectangle
     */
    private static int calculatePerimeter(int dimX, int dimY)   {
        return (2*dimX) + (2*dimY);
    }

    /**
     * A static method for calculating a area of the circle given
     * a radius
     * @param dimX the length of the cube
     * @param dimY the width of the cube
     * @return area of the rectangle
     */
    private static int calculateArea(int dimX,int dimY) {
        return dimX*dimY;
    }
}
