public class Pyramid extends ThreeDimensionalShapes {

    private double surfaceArea;
    private double volume;

    public Pyramid(String name) {
        super(name);
    }

    public Pyramid(String name, double dimX, double dimY, double dimZ)  {
        super(name, dimX, dimY, dimZ);
        this.surfaceArea = calculateSurfaceArea(dimX,dimY,dimZ);
        this.volume = calculateVolume(dimX,dimY,dimZ);
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }

    public double getVolume() {
        return volume;
    }

    private static double calculateSurfaceArea(double dimX, double dimY, double dimZ)    {
        double a = dimX*dimY;
        double b = Math.pow(dimY/2,2) + Math.pow(dimZ,2);
        double c = dimX*Math.sqrt(b);
        double d = Math.pow(dimX/2,2) + Math.pow(dimZ,2);
        double e = dimY*Math.sqrt(d);
        return a + c + e;
        }

    private static double calculateVolume(double dimX, double dimY, double dimZ)    {
        return (dimX*dimY*dimZ)/3;
    }
}
