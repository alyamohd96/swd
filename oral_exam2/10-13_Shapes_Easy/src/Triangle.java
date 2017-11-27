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
     * This method returns the area of the triangle. It uses the calculateArea static method to calculate
     * the area of the triangle.
     * @return the area of the triangle
     */
    @Override
    public double getArea() {
        return calculateArea(this.width, this.height);
    }

    /**
     * This toString method overrides the default toString method. It prints out just the area of
     * the triangle instead
     * @return String of the area of the triangle
     */
    @Override
    public String toString()    {
        return " The area of this Triangle is: " + String.valueOf(getArea() + "\n");
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
