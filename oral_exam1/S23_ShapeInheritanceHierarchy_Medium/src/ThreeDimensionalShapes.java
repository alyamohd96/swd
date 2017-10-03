public class ThreeDimensionalShapes extends ShapeBaseClass {

    private int dimX;
    private int dimY;
    private int dimZ;

    public ThreeDimensionalShapes(String name)  {
        super(name);
    }

    public ThreeDimensionalShapes(String name, int dimX, int dimY, int dimZ)    {
        super(name);
        this.dimX = dimX;
        this.dimY = dimY;
        this.dimZ = dimZ;
    }

    public int getDimX() {
        return dimX;
    }

    public void setDimX(int dimX) {
        this.dimX = dimX;
    }

    public int getDimY() {
        return dimY;
    }

    public void setDimY(int dimY) {
        this.dimY = dimY;
    }

    public int getDimZ() {
        return dimZ;
    }

    public void setDimZ(int dimZ) {
        this.dimZ = dimZ;
    }
}
