public class TwoDimensionalShapes extends ShapeBaseClass {

    protected int dimX;
    protected int dimY;

    public TwoDimensionalShapes(String name)   {
        super(name);
    }

    public TwoDimensionalShapes(String name, int dimX, int dimY) {
        super(name);
        this.dimX = dimX;
        this.dimY = dimY;
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
}


