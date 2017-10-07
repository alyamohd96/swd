/**
 * The class Pyramid creates an object with the characteristics of
 * a triangular prism shape. It can calculate the surface area and
 * the volume of the pyramid. It inherits the ThreeDimensional Class
 */
public class TriangularPrism extends ThreeDimensionalShapes {

    private double height;
    private double surfaceArea;
    private double volume;

    /**
     * Constructor with the argument name of the triangular prism
     * as its parameter. It calls the super class constructor(ThreeDimensionalShapes).
     * @param name the name of the pyramid
     */
    public TriangularPrism(String name)    {
        super(name);
    }

    /**
     * Constructor with the 2 arguments; the name and the color.
     * It calls the super class constructor(ThreeDimensionalShapes).
     * @param name the name of the triangular prism
     * @param color the color of the triangular prism
     */
    public TriangularPrism(String name, String color)   {
        super(name,color);
    }

    /**
     * Constructor with the 5 arguments.
     * It calls the super class constructor(ThreeDimensionalShapes).
     * @param name the name of the triangular prism
     * @param dimX the dimension on a x axis
     * @param dimY the dimension on a y axis
     * @param dimZ the dimension on a z axis
     * @param height the height of the triangular prism
     */
    public TriangularPrism(String name, double dimX, double dimY, double dimZ, double height)      {
        super(name, dimX, dimY, dimZ);
        this.height = height;
        this.surfaceArea = calculateSurfaceArea(dimX, dimY, dimZ, height);
        this.volume = calculateVolume(dimX, dimY, dimZ, height);
    }

    /**
     * an accessor method for the instance variable height
     * @return the value of height
     */
    public double getHeight() {
        return height;
    }

    /**
     * an accessor method for the instance variable surfaceArea
     * @return the surface area of the triangular prism
     */
    public double getSurfaceArea() {
        return surfaceArea;
    }

    /**
     * an accessor method for the instance variable volume
     * @return the volume of the triangular prism
     */
    public double getVolume() {
        return volume;
    }

    /**
     * This calculateSurfaceArea is a static method that calculates the surface area
     * given a few dimensions of the triangular prism
     * @param dimX the dimension on a x axis
     * @param dimY the dimension on a y axis
     * @param dimZ the dimension on a z axis
     * @param height the height of the triangular prism
     * @return the surface area of the triangular prism
     */
    public static double calculateSurfaceArea(double dimX, double dimY, double dimZ, double height)    {
        double temp = Math.pow(dimX,4) + 2*(Math.pow(dimX*dimY,2)) + 2*Math.pow(dimX*dimZ,2);
        double temp2 = Math.pow(dimY,4) + 2*(Math.pow(dimY*dimZ,2)) - Math.pow(dimZ,4);
        return dimX*height + dimY*height + dimZ*height + (1/2)*Math.sqrt((-temp-temp2));
    }

    /**
     * This calculateVolume is a static method that calculates the volume
     * given a few dimensions of the triangular prism
     * @param dimX the dimension on a x axis
     * @param dimY the dimension on a y axis
     * @param dimZ the dimension on a z axis
     * @param height the height of the triangular prism
     * @return the volume of the triangular prism
     */
    public static double calculateVolume(double dimX, double dimY, double dimZ, double height)  {
        double temp = Math.pow(dimX,4) + 2*(Math.pow(dimX*dimY,2)) + 2*Math.pow(dimX*dimZ,2);
        double temp2 = Math.pow(dimY,4) + 2*(Math.pow(dimY*dimZ,2)) - Math.pow(dimZ,4);
        return (1/4)*height*Math.sqrt((-temp-temp2));
    }

}
