public class ThreeDimensionalShapes extends ShapeBaseClass {

    private double dimX;
    private double dimY;
    private double dimZ;

    public ThreeDimensionalShapes(String name)  {
        super(name);
    }

    public ThreeDimensionalShapes(String name, String color)  {
        super(name, color);
    }

    public ThreeDimensionalShapes(String name, double dimX, double dimY, double dimZ)    {
        super(name);
        this.dimX = dimX;
        this.dimY = dimY;
        this.dimZ = dimZ;
    }

    public double getDimX() {
        return dimX;
    }

    public void setDimX(double dimX) {
        this.dimX = dimX;
    }

    public double getDimY() {
        return dimY;
    }

    public void setDimY(double dimY) {
        this.dimY = dimY;
    }

    public double getDimZ() {
        return dimZ;
    }

    public void setDimZ(double dimZ) {
        this.dimZ = dimZ;
    }
}
