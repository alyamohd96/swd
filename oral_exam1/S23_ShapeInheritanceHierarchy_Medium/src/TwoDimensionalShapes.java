/**
 * The TwoDimensionalShapes class is a class that has the attributes of a
 * two dimensional shape. it has two instance variables which is the dimensions
 * of the two dimensional
 */
public class TwoDimensionalShapes extends ShapeBaseClass {

    private int dimX;
    private int dimY;

    /**
     * This constructor has a one parameter that accepts a String.
     * It calls its superclass constructor
     * @param name the name of the two dimensional shape
     */
    public TwoDimensionalShapes(String name)   {
        super(name);
    }

    /**
     * This constructor takes in three parameters; the name of the
     * shape, the dimensions on the x axis and the dimensions of the
     * y axis. It calls the constructor from its superclass.
     * @param name name of the shape
     * @param dimX dimensions on the x axis
     * @param dimY dimensions on the x axis
     */
    public TwoDimensionalShapes(String name, int dimX, int dimY) {
        super(name);
        this.dimX = dimX;
        this.dimY = dimY;
    }

    /**
     * an accessor method for the instance variable dimX
     * @return the value of dimX
     */
    public int getDimX() {
        return dimX;
    }

    /**
     * a mutator method that sets the number passed in the
     * parameter to the instance variable dimX
     * @param dimX dimensions of x axis
     */
    public void setDimX(int dimX) {
        this.dimX = dimX;
    }

    /**
     * an accessor method for the instance variable dimY
     * @return the value of dimY
     */
    public int getDimY() {
        return dimY;
    }

    /**
     * a mutator method that sets the number passed in the
     * parameter to the instance variable dimX
     * @param dimY dimensions of y axis
     */
    public void setDimY(int dimY) {
        this.dimY = dimY;
    }
}


