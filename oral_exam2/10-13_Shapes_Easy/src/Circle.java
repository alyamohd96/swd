/**
 * This Circle extends the TwoDimensionalShapes abstract class thus indirectly implements the ShapesBaseClass interface.
 * This class has one private instance field, a constructor and three methods.
 */
public class Circle extends TwoDimensionalShapes {

    /**
     * This private instance field stores the radius of the circle
     */
    private double radius;

    /**
     * This is a one-argument constructor. The argument passed in is the radius of the circle
     * @param radius Radius of the circle
     */
    public Circle(double radius) {
        this.radius = radius;
    }


    /**
     * This method returns the area of the circle. It uses the calculateArea static method to calculate
     * the area of the circle.
     * @return the area of the circle
     */
    @Override
    public double getArea() {
        return calculateArea(radius);
    }

    /**
     * This toString method overrides the default toString method. It prints out just the area of
     * the circle instead
     * @return String of the area of the circle
     */
    @Override
    public String toString()    {
        return " The area of this Circle is: " + String.valueOf(getArea() + "\n");
    }

    /**
     * A static method for calculating an area of the circle given
     * a radius. The method uses the Math class for the pi value
     * @param radius radius of a circle
     * @return area of the circle
     */
    public static double calculateArea(double radius)   {
        return Math.PI * Math.pow(radius,2);
    }

}
