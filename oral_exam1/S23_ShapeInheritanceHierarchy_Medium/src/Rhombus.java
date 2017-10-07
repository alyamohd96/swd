/**
 * The Rhombus class extends the TwoDimensionalShapes. The fields that are
 * specific to this Rhombus class sides, perimeter, and area. The methods that
 * are specific to this class is the setters and getters for the instance
 * fields, calculateArea function, and calculatePerimeter function which
 * the area the perimeter respectively given sides.
 *
 */
public class Rhombus extends TwoDimensionalShapes {

    private double sides;
    private double perimeter;
    private double area;

    /**
     * Constructor with the argument name of the rhombus as its parameter.
     * It calls the super class constructor(TwoDimensionalShapes).
     * @param name the name of the rhombus
     */
    public Rhombus(String name) {
        super(name);
    }

    /**
     * Constructor with the argument name of the rhombus and the dimensions
     * as its parameter. It calls the super class constructor(TwoDimensionalShapes).
     * It also calculates the sides, the surface area, and the perimeter and set them
     * to the instance variables respectively
     * @param name the name of the circle
     * @param dimX the dimensions of the rhombus
     * @param dimY the radius of the circle
     */
    public Rhombus(String name, int dimX, int dimY)  {
        super(name, dimX, dimY);
        this.sides = calculateSide(dimX,dimY);
        this.perimeter = calculatePerimeter(sides);
        this.area = calculateArea(dimX,dimY);
    }

    /**
     * Constructor with the argument name of the rhombus, the dimensions, and the sides
     * as its parameter. It calls the super class constructor(TwoDimensionalShapes).
     * It also calculates the surface area and the perimeter and set them
     * to the instance variables respectively
     * @param name
     * @param sides
     * @param dimX
     * @param dimY
     */
    public Rhombus(String name, int sides, int dimX, int dimY)  {
        super(name, dimX, dimY);
        this.sides = sides;
        this.perimeter = calculatePerimeter(sides);
        this.area = calculateArea(dimX,dimY);
    }

    /**
     * Accessor method for the sides instance field.
     * @return the sides of the rhombus
     */
    public double getSides() {
        return sides;
    }

    /**
     * Accessor method for the perimeter instance field
     * @return the perimeter of the rhombus
     */
    public double getPerimeter() {
        return perimeter;
    }

    /**
     * Accessor method for the area instance field
     * @return the area of the rhombus
     */
    public double getArea() {
        return area;
    }

    /**
     *
     * A static method for calculating a sides of the rhombus given
     * the dimensions
     * @param dimX the dimension of the rhombus on x axis
     * @param dimY the dimension of the rhombus on y axis
     * @return the sides of the rhombus
     */
    private static double calculateSide(int dimX, int dimY)   {
        double p = Math.pow(dimY,2);
        double q = Math.pow(dimX,2);
        return (Math.sqrt(p + q)) /2;
    }

    /**
     /**
     * A static method for calculating a perimeter of the rhombus given
     * a side
     * @param sides the side of the rhombus
     * @return the perimeter of the rhombus
     */
    private static double calculatePerimeter(double sides) {
        return 4*sides;
    }

    /**
     * A static method for calculating a area of the rhombus given
     * @param dimX the dimension of the rhombus in x axis
     * @param dimY the dimension of the rhombus in y axis
     * @return the area of the rhombus
     */
    private static double calculateArea(int dimX, int dimY) {
        return dimX*dimY/2;
    }
}
