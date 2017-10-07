/**
 * The ThreeDimensionalShapes class is a class that has the attributes of a
 * three dimensional shape. it has three instance variables which is the dimensions
 * of a three dimensional shape
 */
public class ThreeDimensionalShapes extends ShapeBaseClass {

    private double dimX;
    private double dimY;
    private double dimZ;

    /**
     * This constructor has a one parameter that accepts a String.
     * It calls its superclass constructor
     * @param name the name of the two dimensional shape
     */
    public ThreeDimensionalShapes(String name)  {
        super(name);
    }

    /**
     * This constructor has two parameter that accepts two Strings.
     * It calls its superclass constructor
     * @param name the name of the circle
     * @param color the color of the circle
     */
    public ThreeDimensionalShapes(String name, String color)  {
        super(name, color);
    }

    /**
     * This constructor takes in four parameters; the name of the
     * shape, the dimensions on the x axis, the dimensions of the
     * y axis, and the dimensions of the z axis. It calls the constructor
     * from its superclass.
     * @param name name of the shape
     * @param dimX dimensions on the x axis
     * @param dimY dimensions on the y axis
     * @param dimZ dimensions on the z axis
     */
    public ThreeDimensionalShapes(String name, double dimX, double dimY, double dimZ)    {
        super(name);
        this.dimX = dimX;
        this.dimY = dimY;
        this.dimZ = dimZ;
    }

    /**
     * an accessor method for the instance variable dimX
     * @return the value of dimX
     */
    public double getDimX() {
        return dimX;
    }

    /**
     * a mutator method that sets the number passed in the
     * parameter to the instance variable dimX
     * @param dimX
     */
    public void setDimX(double dimX) {
        this.dimX = dimX;
    }

    /**
     * an accessor method for the instance variable dimY
     * @return the value of dimY
     */
    public double getDimY() {
        return dimY;
    }

    /**
     * a mutator method that sets the number passed in the
     * parameter to the instance variable dimY
     * @param dimY the value of dimY
     */
    public void setDimY(double dimY) {
        this.dimY = dimY;
    }

    /**
     * a mutator method that sets the number passed in the
     * parameter to the instance variable dimZ
     * @return the value of dimZ
     */
    public double getDimZ() {
        return dimZ;
    }

    /**
     * a mutator method that sets the number passed in the
     * parameter to the instance variable dimZ
     * @param dimZ the value of dimZ
     */
    public void setDimZ(double dimZ) {
        this.dimZ = dimZ;
    }
}
