/**
 * This Cube class is a class that exhibits the characteristics of a cube. It extends the ThreeDimensionalClass and stores the surfaceArea and
 * the volume of the cube.
 */
public class Cube extends ThreeDimensionalShapes {

    /**
     *This instance variable stores the surface area of the cube in type double
     */
    private double surfaceArea;
    /**
     *This instance variable stores the volume of the cube in type double
     */
    private double volume;

    /**
     * This constructor accepts a String for its parameter and set that string to the
     * name of the cube by calling the superclass's constructor
     * @param name the name of the cube
     */
    public Cube(String name)    {
        super(name);
    }

    /**
     * This constructor accepts 2 parameters; a String which is the name of the cube
     * and a double which is the edge of the cube. This constructor will call the
     * superclass's constructor and passed the edge for it's dimX, dimY, and dimZ.
     * it will also calculate the surfaceArea and the volume and set those values
     * to the instance variables surfaceArea and volume
     * @param name the name of the cube
     * @param edge the edge of the cube
     */
    public Cube(String name, double edge) {
        super(name, edge, edge, edge);
        this.surfaceArea = calculateSurfaceArea(edge);
        this.volume = calculateVolume(edge);
    }

    /**
     * the accessor method for the surfaceArea instance variable
     * @return the surface area of the cube in type double
     */
    public double getSurfaceArea() {
        return surfaceArea;
    }

    /**
     * mutator method for the surfaceArea instance variables.
     * when set, the method will calculate the edge for the cube
     * and set the dimX, dimY and dimZ using mutator methods from
     * the superclass to the new edge value
     * @param surfaceArea
     */
    public void setSurfaceArea(double surfaceArea) {
        this.surfaceArea = surfaceArea;
        double edge = Math.sqrt(surfaceArea/6);
        setDimX(edge);
        setDimY(edge);
        setDimZ(edge);
    }

    /**
     * The accessor method for the volume instance variable
     * @return the volume of the cube in type double
     */
    public double getVolume() {
        return volume;
    }

    /**
     * This mutator method sets the volume instance variable to the value
     * passed in the argument. it will also calculate the new edge of the cube and
     * set the dimX, dimY and dimZ using mutator methods from the superclass
     * to the new edge value
     * @param volume
     */
    public void setVolume(double volume) {
        this.volume = volume;
        double edge = Math.cbrt(volume);
        setDimX(edge);
        setDimY(edge);
        setDimZ(edge);
    }

    /**
     * This method calculates the surface area of the cube when given the edge
     * value in its argument
     * @param edge the edge of the cube
     * @return the surface area of the cube in type double
     */
    private static double calculateSurfaceArea(double edge) {
        return 6*Math.pow(edge,2);
    }

    /**
     * This static method calculates the volume of cube when given the edge
     * value in its argument
     * @param edge the edge of the cube
     * @return the volume of the cube in type double
     */
    private static double calculateVolume(double edge)   {
        return Math.pow(edge,3);
    }
}
