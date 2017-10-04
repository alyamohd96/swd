public class Cube extends ThreeDimensionalShapes {

    private double surfaceArea;
    private double volume;

    public Cube(String name)    {
        super(name);
    }


    public Cube(String name, double edge) {
        super(name, edge, edge, edge);
        this.surfaceArea = calculateSurfaceArea(edge);
        this.volume = calculateVolume(edge);
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }

    public void setSurfaceArea(double surfaceArea) {
        this.surfaceArea = surfaceArea;
        double edge = Math.sqrt(surfaceArea/6);
        setDimX(edge);
        setDimY(edge);
        setDimZ(edge);
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
        double edge = Math.cbrt(volume);
        setDimX(edge);
        setDimY(edge);
        setDimZ(edge);
    }

    private static double calculateSurfaceArea(double edge) {
        return 6*Math.pow(edge,2);
    }

    private static double calculateVolume(double edge)   {
        return Math.pow(edge,3);
    }
}
