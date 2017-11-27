/**
 * This Square extends the TwoDimensionalShapes abstract class thus indirectly implements the ShapesBaseClass interface.
 * This class has one private instance field, a constructor and three methods.
 */
public class Square extends TwoDimensionalShapes{

    /**
     * This is an instance field which stores the edge of the square
     */
    private double edge;

    /**
     * This is a one-argument constructor. The argument passed in is the edge of the square
     * @param edge edge of the square
     */
    public Square(double edge)  {
        this.edge = edge;
    }

    /**
     * This method returns the area of the square. It uses the calculateArea static method to calculate
     * the area of the square.
     * @return the area of the square
     */
    @Override
    public double getArea() {
        return calculateArea(this.edge);
    }

    /**
     * This toString method overrides the default toString method. It prints out just the area of
     * the circle instead
     * @return String of the area of the circle
     */
    @Override
    public String toString()    {
        return " The area of this Square is: " + String.valueOf(getArea() + "\n");
    }

    /**
     * A static method for calculating an area of the square given
     * an edge.
     * @param edge edge of the square
     * @return area of the square
     */
    public static double calculateArea(double edge)   {
        return Math.pow(edge,2);
    }
}
