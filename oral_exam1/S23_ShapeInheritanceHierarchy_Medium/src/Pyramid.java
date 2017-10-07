/**
 * The class Pyramid creates an object with the characteristics of a pyramid shape.
 * It can calculate the surface area and the volume of the pyramid. It inherits the ThreeDimensional Class
 */
public class Pyramid extends ThreeDimensionalShapes {

    /**
     * the instance variable surfaceArea stores the surface area of the pyramid
     */
    private double surfaceArea;
    /**
     * the instance variable surfaceArea stores the volume of the pyramid
     */
    private double volume;

    /**
     * Constructor with the argument name of the pyramid as its parameter.
     * It calls the super class constructor(ThreeDimensionalShapes).
     * @param name the name of the pyramid
     */
    public Pyramid(String name) {
        super(name);
    }

    /**
     * This constructor with 4 arguments; name, dimX, dimY, and dimZ
     * it will call the superclass's constructor with 4 arguments.
     * it will also calculate the surface area and the volume of the
     * pyramid
     * @param name the name of the pyramid
     * @param dimX an edge of the pyramid from the x axis
     * @param dimY an edge of the pyramid from the y axis
     * @param dimZ an edge of the pyramid from the z axis
     */
    public Pyramid(String name, double dimX, double dimY, double dimZ)  {
        super(name, dimX, dimY, dimZ);
        this.surfaceArea = calculateSurfaceArea(dimX,dimY,dimZ);
        this.volume = calculateVolume(dimX,dimY,dimZ);
    }

    /**
     * a accessor method that returns the value of the instance variable surface area
     * @return the surface area of the pyramid
     */
    public double getSurfaceArea() {
        return surfaceArea;
    }

    /**
     * a accessor method that returns the value of the instance variable volume
     * @return the volume of the pyramid
     */
    public double getVolume() {
        return volume;
    }

    /**
     * This calculateSurfaceArea is a static method that calculates the surface area
     * all the dimensions of the pyramid
     * @param dimX an edge of the pyramid from the x axis
     * @param dimY an edge of the pyramid from the y axis
     * @param dimZ an edge of the pyramid from the z axis
     * @return the calculated surface area of type double
     */
    private static double calculateSurfaceArea(double dimX, double dimY, double dimZ)    {
        double a = dimX*dimY;
        double b = Math.pow(dimY/2,2) + Math.pow(dimZ,2);
        double c = dimX*Math.sqrt(b);
        double d = Math.pow(dimX/2,2) + Math.pow(dimZ,2);
        double e = dimY*Math.sqrt(d);
        return a + c + e;
        }

    /**
     * This calculateVolume is a static method that calculates the volume
     * all the dimensions of the pyramid
     * @param dimX an edge of the pyramid from the x axis
     * @param dimY an edge of the pyramid from the y axis
     * @param dimZ an edge of the pyramid from the z axis
     * @return the calculated volume of type double
     */
    private static double calculateVolume(double dimX, double dimY, double dimZ)    {
        return (dimX*dimY*dimZ)/3;
    }
}
