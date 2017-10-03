public class Sphere extends ThreeDimensionalShapes {

    private double radius;
    private double surfaceArea;
    private double volume;

    public Sphere(String name) {
        super(name);
    }

    public Sphere(String name, double radius)   {
        super(name,(int) radius, (int) radius, (int) radius);
        this.radius = radius;
        this.surfaceArea = calculateSurfaceArea(radius);
        this.volume = calculateVolume(radius);
    }

    public Sphere(String name, int dimX, int dimY, int dimZ)    {
        super(name,dimX,dimY,dimZ);
        this.radius = dimX;
        this.surfaceArea = calculateSurfaceArea(radius);
        this.volume = calculateVolume(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }

    public void setSurfaceArea(double surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    private static double calculateSurfaceArea(double radius) {
        return 4*Math.PI*Math.pow(radius,2);
    }

    private static double calculateVolume(double radius)    {
        return (4/3)*Math.PI*Math.pow(radius,3);
    }
}
