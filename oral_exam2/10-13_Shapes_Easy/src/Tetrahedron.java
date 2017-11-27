/**
 * This tetrahedron class extends from ThreeDimensionalShapes. It has one private field, a one argument constructor and
 * five methods. The Sphere class indirectly implements the ShapesBaseClass interface. It also has the implementation
 * for the abstract methods inherited.
 */
public class Tetrahedron extends ThreeDimensionalShape {

    /**
     * this is an instance field that stores the edge of the tetrahedron
     */
    private double edge;

    /**
     * one argument constructor which is the edge of the tetrahedron
     * @param edge
     */
    public Tetrahedron(double edge) {
        this.edge = edge;
    }

    /**
     * This method returns the surface area of the Tetrahedron. It uses the calculateArea static method to calculate
     * the area of the Tetrahedron.
     * @return the surface area of the Tetrahedron
     */
    @Override
    public double getArea() {
        return calculateArea(this.edge);
    }

    /**
     * This method returns the volume of the Tetrahedron. It uses the calculateVolume static method to calculate
     * the volume of the Tetrahedron.
     * @return volume of the Tetrahedron
     */
    @Override
    public double getVolume()   {
        return calculateVolume(this.edge);
    }

    /**
     * This toString method overrides the default toString method. It prints out just the area and the volume of
     * the Tetrahedron instead
     * @return String of the area and the volume of the Tetrahedron
     */
    @Override
    public String toString()   {
        return " The area of this Tetrahedron is: " + String.valueOf(getArea() + " and the volume is " + String.valueOf(getVolume()) + "\n");
    }

    /**
     * This is a static method that calculate the area of a Tetrahedron. It has one argument which is the edge of the Tetrahedron.
     * @param edge edge of the Tetrahedron
     * @return the area of the Tetrahedron
     */
    public static double calculateArea(double edge)    {
        return Math.sqrt(3)*Math.pow(edge,2);
    }

    /**
     * This is a static method that calculate the area of a Tetrahedron. It has one argument which is the edge of the Tetrahedron.
     * @param edge edge of the Tetrahedron
     * @return the volume of the Tetrahedron
     */
    public static double calculateVolume(double edge)  {
        return Math.pow(edge,3) / (6*Math.sqrt(2));
    }
}
