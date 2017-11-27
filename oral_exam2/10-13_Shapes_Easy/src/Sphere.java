/**
 * This Sphere class extends from ThreeDimensionalShapes. It has one private field, a one argument constructor and
 * five methods. The Sphere class indirectly implements the ShapesBaseClass interface. It also has the implementation
 * for the abstract methods inherited.
 */
public class Sphere extends ThreeDimensionalShape{

    /**
     * This is an instance variable that stores the radius of the sphere
     */
    private double radius;

    /**
     * This is a one argument constructor that takes in the radius of the sphere. It assigns it to the
     * instance field, radius
     * @param radius the radius of the sphere
     */
    public Sphere(double radius) {
        this.radius = radius;
    }

    /**
     * This method returns the surface area of the sphere. It uses the calculateArea static method to calculate
     * the area of the sphere.
     * @return the surface area of the sphere
     */
    @Override
    public double getArea() {
        return calculateArea(this.radius);
    }

    /**
     * This method returns the volume of the cube. It uses the calculateVolume static method to calculate
     * the volume of the cube.
     * @return volume of the cube
     */
    @Override
    public double getVolume()   {
        return calculateVolume(this.radius);
    }

    /**
     * This toString method overrides the default toString method. It prints out just the area and the volume of
     * the sphere instead
     * @return String of the area and the volume of the sphere
     */
    @Override
    public String toString()   {
        return " The area of this Sphere is: " + String.valueOf(getArea() + " and the volume is " + String.valueOf(getVolume()) + "\n");
    }

    /**
     * This is a static method that calculate the area of a cube. It has one argument which is the radius of the sphere.
     * @param radius radius of the sphere
     * @return the area of the sphere
     */
    public static double calculateArea(double radius)    {
        return 4*Math.PI*Math.pow(radius,2);
    }

    /**
     * This is a static method that calculate the volume of a sphere. It has one argument which is the radius of the cube.
     * @param radius of the sphere
     * @return the volume of the sphere
     */
    public static double calculateVolume(double radius)  {
        return (4/3)*Math.PI*Math.pow(radius,3);
    }
}


