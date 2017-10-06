/**
 * This Cylinder class creates an object with the characteristics of a cylinder shape.
 * It can calculate the surface area and the volume of the cylinder. It inherits the ThreeDimensional Class
 */
public class Cylinder extends ThreeDimensionalShapes{

    /**
     * area stores the area of the cylinder in a double type
     */
    private double area;
    /**
     * volume stores the volume of the cylinder in double type
     */
    private double volume;

    /**
     * The constructor accepts a String as its argument. The argument will be the cylinder's name. It calls the constructor from the ThreeDimensionalShapes
     * @param name the name of the cylinder
     */
    public Cylinder(String name)    {
        super(name);
    }

    /**
     * The constructor accepts three arguments; the name, the radius and the height. It calls the constructor from the ThreeDimensionalShapes that accepts three arguments.
     * The radius passed in this constructor will become the dimX and dimY while the height will be passed as dimZ.
     * @param name the name of the cylinder
     * @param radius the radius of the cylinder
     * @param height the height of the cylinder
     */
    public Cylinder(String name, double radius, double height) {
        super(name, radius, radius, height);
        setDimX(radius);
        setDimY(radius);
        setDimZ(height);
        this.area = calculateSurfaceArea(radius, height);
        this.volume = calculateVolume(radius, height);
    }

    /**
     * This is the accessor method that returns the area instance variable which is the area of the cylinder.
     * @return the value of the area instance variable in type double
     */
    public double getArea() {
        return area;
    }

    /**
     * This is the accessor method that returns the volume instance variable which is the volume of the cylinder.
     * @return the value of the volume instance variable in type double
     */
    public double getVolume() {
        return volume;
    }

    /**
     * This calculateSurfaceArea is a static method that calculates the surface area given a certain radius and height
     * @param radius radius of the cylinder
     * @param height the height of the cylinder
     * @return the surfaceArea of the cylinder (type double)
     */
    private static double calculateSurfaceArea(double radius, double height)  {
        return (2*Math.PI*radius*height)+(2*Math.PI*Math.pow(radius,2));
    }

    /**
     * This calculateVolume is a static method that calculates the volume of the cylinder given a certain radius and height
     * @param radius of the cylinder
     * @param height the height of the cylinder
     * @return the volume of the cylinder (type double)
     */
    private double calculateVolume(double radius, double height)    {
        return Math.PI* Math.pow(radius,2)*height;
    }

}
