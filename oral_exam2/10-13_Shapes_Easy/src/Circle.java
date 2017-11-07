public class Circle {

    private double radius;

    public Circle() {

    }

    @Override
    public abstract double getArea() {
        return calculateArea(radius);
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
