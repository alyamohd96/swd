
public class Cylinder extends ThreeDimensionalShapes{

    private double area;
    private double volume;

    public Cylinder(String name)    {
        super(name);
    }

    public Cylinder(String name, double radius, double height) {
        super(name, radius, radius, height);
        setDimX(radius);
        setDimY(radius);
        setDimZ(height);
        this.area = calculateSurfaceArea(radius, height);
        this.volume = calculateVolume(radius, height);
    }

    public double getArea() {
        return area;
    }

    public double getVolume() {
        return volume;
    }

    private static double calculateSurfaceArea(double radius, double height)  {
        return (2*Math.PI*radius*height)+(2*Math.PI*Math.pow(radius,2));
    }

    private double calculateVolume(double radius, double height)    {
        return Math.PI* Math.pow(radius,2)*height;
    }

}
