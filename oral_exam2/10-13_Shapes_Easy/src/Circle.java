public class Circle extends TwoDimensionalShapes {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return calculateArea(radius);
    }

    @Override
    public String toString()    {
        return " The area of this Circle is: " + String.valueOf(getArea() + "\n");
    }

    /**
     * A static method for calculating an area of the circle given
     * a radius
     * @param radius radius of a circle
     * @return area of the circle
     */
    public static double calculateArea(double radius)   {
        return Math.PI * Math.pow(radius,2);
    }

}
