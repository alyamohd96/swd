/**
 * This Triangle class is a concrete class that inherits from TwoDimensionalShapes
 * and indirectly implements the ShapesBaseClass. It contains 2 instance variables, width and height, and
 * a 2 argument constructor that takes in width and height of the Triangle.
 */
public class Triangle extends TwoDimensionalShapes {

    private double width;
    private double height;

    public Triangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /**
     *
     * @return
     */
    @Override
    public double getArea() {
        return calculateArea(this.width, this.height);
    }

    /**
     * This is a public static method to calculate an area of a triangle.
     * @param width width of triangle
     * @param height height of triangle
     * @return area of triangle
     */
    public static double calculateArea(double width, double height) {
        return (0.5)*(width)*(height);
    }

}
