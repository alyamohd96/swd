/**
 * This Cone class creates an object with the characteristics of a cone shape.
 * It can calculate the surface area and the volume of the cone. It inherits the ThreeDimensional Class
 */
public class Cone extends ThreeDimensionalShapes{

    /**
     * surfaceArea is an instance variable of type double that stores the surface area of the cone
     */
    private double surfaceArea;
    /**
     * volume is an instance variable of type double that stores the volume of the cone
     */
    private double volume;

    /**
     * The constructor for cone class that accepts a String argument. The argument will be  the name of the cone.
     * This constuctor call the ThreeDimensionalShapes constructor
     * @param name the name of the cone
     */
    public Cone(String name)    {
        super(name);
    }

    /**
     * This constructor has 3 parameters. The first is the name of the class, second if the radius of the cone
     * and third is the height of the cone. This constructor calls the super constructor and pass the radius for its dimX
     * and dimY and pass the height for its dimZ
     * @param name The name of the cone
     * @param radius the radius of the cone
     * @param height the height of the cone
     */
    public Cone(String name, double radius, double height)  {
        super(name, radius, radius, height);
        this.surfaceArea = calculateSurfaceArea(radius,height);
        this.volume = calculateVolume(radius, height);
    }

    /**
     * The getSurface area is an accessor method for the surfaceArea instance variable. It return the surface area of type double
     * @return the surface area of type double
     */
    public double getSurfaceArea() {
        return surfaceArea;
    }

    /**
     * An accessor method for the volume instance variable. It returns the volume of the cone of type double
     * @return the volume of type double
     */
    public double getVolume() {
        return volume;
    }

    /**
     * This calculateSurfaceArea is a static method that calculates the surface area given a certain radius and height
     * @param radius radius of the cone
     * @param height the height of the cone
     * @return the surfaceArea of the cone (type double)
     */
    public static double calculateSurfaceArea(double radius, double height)    {
        double a = Math.pow(height,2) + Math.pow(radius,2);
        return Math.PI*radius*(radius+(Math.sqrt(a)));
    }

    /**
     * This calculateVolume is a static method that calculates the volume of the cone given a certain radius and height
     * @param radius of the cone
     * @param height the height of the cone
     * @return the volume of the cone (type double)
     */
    public static double calculateVolume(double radius, double height) {
        return Math.PI*Math.pow(radius,2)*(height/3);
    }
}
