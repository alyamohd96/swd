public class Cone extends ThreeDimensionalShapes{

    private double surfaceArea;
    private double volume;

    public Cone(String name)    {
        super(name);
    }

    public Cone(String name, double radius, double height)  {
        super(name, radius, radius, height);
        this.surfaceArea = calculateSurfaceArea(radius,height);
        this.volume = calculateVolume(radius, height);
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }

    public double getVolume() {
        return volume;
    }

    public static double calculateSurfaceArea(double radius, double height)    {
        double a = Math.pow(height,2) + Math.pow(radius,2);
        return Math.PI*radius*(radius+(Math.sqrt(a)));
    }

    public static double calculateVolume(double radius, double height) {
        return Math.PI*Math.pow(radius,2)*(height/3);
    }
}
