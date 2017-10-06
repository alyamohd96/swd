public class TriangularPrism extends ThreeDimensionalShapes {

    private double height;
    private double surfaceArea;
    private double volume;

    public TriangularPrism(String name)    {
        super(name);
    }

    public TriangularPrism(String name, String color)   {
        super(name,color);
    }

    public TriangularPrism(String name, double dimX, double dimY, double dimZ, double height)      {
        super(name, dimX, dimY, dimZ);
        this.height = height;
        this.surfaceArea = calculateSurfaceArea(dimX, dimY, dimZ, height);
        this.volume = calculateVolume(dimX, dimY, dimZ, height);
    }

    public double getHeight() {
        return height;
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }

    public double getVolume() {
        return volume;
    }

    public static double calculateSurfaceArea(double dimX, double dimY, double dimZ, double height)    {
        double temp = Math.pow(dimX,4) + 2*(Math.pow(dimX*dimY,2)) + 2*Math.pow(dimX*dimZ,2);
        double temp2 = Math.pow(dimY,4) + 2*(Math.pow(dimY*dimZ,2)) - Math.pow(dimZ,4);
        return dimX*height + dimY*height + dimZ*height + (1/2)*Math.sqrt((-temp-temp2));
    }

    public static double calculateVolume(double dimX, double dimY, double dimZ, double height)  {
        double temp = Math.pow(dimX,4) + 2*(Math.pow(dimX*dimY,2)) + 2*Math.pow(dimX*dimZ,2);
        double temp2 = Math.pow(dimY,4) + 2*(Math.pow(dimY*dimZ,2)) - Math.pow(dimZ,4);
        return (1/4)*height*Math.sqrt((-temp-temp2));
    }

}
