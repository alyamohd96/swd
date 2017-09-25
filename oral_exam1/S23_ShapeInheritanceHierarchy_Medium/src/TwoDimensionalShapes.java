public class TwoDimensionalShapes extends ShapeBaseClass {

    private String name;
    private int dim1;
    private int dim2;
    private String color;


    public TwoDimensionalShapes(String name)   {
        super(name);
    }

    public TwoDimensionalShapes(String name, int dim1, int dim2) {
        super(name);
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    public int getDim1() {
        return dim1;
    }

    public void setDim1(int dim1) {
        this.dim1 = dim1;
    }

    public int getDim2() {
        return dim2;
    }

    public void setDim2(int dim2) {
        this.dim2 = dim2;
    }


}


