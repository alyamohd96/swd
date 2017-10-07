/**
 * The Sphere class extends the ThreeDimensionalShapes. The fields that are
 * specific to this Sphere class radius, volume, and area. The methods that
 * are specific to this class is the setters and getters for the instance
 * fields, calculateArea function, and calculateVolume function which
 * the area the perimeter respectively given a radius.
 */
public class Sphere extends ThreeDimensionalShapes {

    private double radius;
    private double surfaceArea;
    private double volume;

    /**
     * Constructor with the argument name of the sphere as its parameter.
     * It calls the super class constructor(ThreeDimensionalShapes).
     * @param name the name of the sphere
     */
    public Sphere(String name) {
        super(name);
    }

    /**
     * Constructor with the argument name of the sphere and the radius
     * as its parameter. It calls the super class constructor(ThreeDimensionalShapes)
     * It passes the radius of the sphere on to the superclass's
     * constructor dimX, dimY, and dimZ
     * It also calculates the area and volume of the sphere and sets
     * it to the instance variables
     * @param name the name of the sphere
     * @param radius the radius of the sphere
     */
    public Sphere(String name, double radius)   {
        super(name,radius, radius, radius);
        this.radius = radius;
        this.surfaceArea = calculateSurfaceArea(radius);
        this.volume = calculateVolume(radius);
    }

    /**
     * Constructor with the 4 arguments
     * as its parameter. It calls the super class constructor(ThreeDimensionalShapes)
     * It also calculates the area and volume of the sphere and sets
     * @param name the name of the sphere
     * @param dimX radius of the sphere
     * @param dimY radius of the sphere
     * @param dimZ radius of the sphere
     */
    public Sphere(String name, double dimX, double dimY, double dimZ)    {
        super(name,dimX,dimY,dimZ);
        this.radius = dimX;
        this.surfaceArea = calculateSurfaceArea(radius);
        this.volume = calculateVolume(radius);
    }

    /**
     * a accessor method that returns the value of the instance variable radius
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * A mutator method that sets the value of the radius instance variable
     * it also calculates the surface area and volume
     * @param radius new radius of the circle
     */
    public void setRadius(double radius) {
        this.radius = radius;
        this.surfaceArea = calculateSurfaceArea(radius);
        this.volume = calculateVolume(radius);
    }

    /**
     * a accessor method that returns the value of the instance variable surface area
     * @return the surface area of the sphere
     */
    public double getSurfaceArea() {
        return surfaceArea;
    }

    /**
     * A mutator method that sets the value of the surfaceArea instance variable
     * it also calculates the radius
     * @param surfaceArea the surfaceArea of the sphere
     */
    public void setSurfaceArea(double surfaceArea) {
        this.surfaceArea = surfaceArea;
        this.radius = calculateRadiusSurfaceArea(surfaceArea);
    }

    /**
     * a accessor method that returns the value of the instance variable volume
     * @return the volume of the sphere
     */
    public double getVolume() {
        return volume;
    }

    /**
     * A mutator method that sets the value of the surfaceArea instance variable
     * it also calculates the radius
     * @param volume volume of the sphere
     */
    public void setVolume(double volume) {
        this.volume = volume;
        this.radius = calculateRadiusVolume(volume);
    }

    /**
     * This method calculates the surface area of a sphere given a radius
     * @param radius the radius of the sphere
     * @return the surface area of the surface
     */
    private static double calculateSurfaceArea(double radius) {
        return 4*Math.PI*Math.pow(radius,2);
    }

    /**
     * This method calculates the volume of a sphere given a radius
     * @param radius the radius of the sphere
     * @return the volume of the surface
     */
    private static double calculateVolume(double radius)    {
        return (4/3)*Math.PI*Math.pow(radius,3);
    }

    /**
     * This method calculates the radius of a sphere given a surface area
     * @param surfaceArea the surface area of the sphere
     * @return the radius of the sphere
     */
    private static double calculateRadiusSurfaceArea(double surfaceArea)   {
        return 0.5*Math.sqrt((surfaceArea/Math.PI));
    }

    /**
     * This method calculates the radius of a sphere given a volume
     * @param volume the volume of the sphere
     * @return the radius of the sphere
     */
    private static double calculateRadiusVolume(double volume)  {
        double temp = (3*volume)/(4*Math.PI);
        return Math.cbrt(temp);
    }
}
