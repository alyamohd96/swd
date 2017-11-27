/**
 * This Cube class extends the ThreeDimensionalShapes abstract class thus indirectly implements the ShapesBaseClass interface.
 * This class has one private instance field which stores the edge of the cube, a constructor and five methods.
 */
public class Cube extends ThreeDimensionalShape {

    /**
     * This private instance field stores the edge of the cube
     */
    private double edge;

    /**
     * This is a one argument constructor. The argument passed in the constructor is the edge of the cube
     * @param edge the edge of the cube
     */
    public Cube(double edge)   {
        this.edge = edge;
    }

    /**
     * This method returns the surface area of the cube. It uses the calculateArea static method to calculate
     * the area of the cube.
     * @return the surface area of the cube
     */
    @Override
    public double getArea()  {
        return calculateArea(this.edge);
    }

    /**
     * This method returns the volume of the cube. It uses the calculateVolume static method to calculate
     * the volume of the cube.
     * @return volume of the cube
     */
    @Override
    public double getVolume()   {
        return calculateVolume(this.edge);
    }

    /**
     * This toString method overrides the default toString method. It prints out just the area and the volume of
     * the cube instead
     * @return String of the area and the volume of the cube
     */
    @Override
    public String toString()   {
        return " The area of this Cube is: " + String.valueOf(getArea() + " and the volume is " + String.valueOf(getVolume()) + "\n");
    }

    /**
     * This is a static method that calculate the area of a cube. It has one argument which is the edge of the cube.
     * @param edge edge of cube
     * @return area of the cube
     */
    public static double calculateArea(double edge)    {
        return 6*Math.pow(edge,2);
    }

    /**
     * This is a static method that calculate the volume of a cube. It has one argument which is the edge of the cube.
     * @param edge edge of cube
     * @return volume of the cube
     */
    public static double calculateVolume(double edge) {
        return Math.pow(edge,3);
    }

}
