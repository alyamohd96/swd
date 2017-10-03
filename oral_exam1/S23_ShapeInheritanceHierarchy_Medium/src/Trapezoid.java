public class Trapezoid extends TwoDimensionalShapes{

    private int dimXTop;
    private int sideA;
    private int sideB;
    private double perimeter;
    private double area;

    public Trapezoid(String name)   {
        super(name);
    }

    public Trapezoid(String name, int dimX, int dimY, int dimXTop, int sideA, int sideB, double perimeter, double area) {
        super(name, dimX, dimY);
        this.dimXTop = dimXTop;
        this.sideA = sideA;
        this.sideB = sideB;
        this.perimeter = calculatePerimeter(dimX,dimXTop,sideA,sideB);
        this.area = calculateArea(dimX,dimXTop,dimY);
    }

    private static double calculatePerimeter(int dimX, int dimXTop, int sideA, int sideB)   {
        return dimX + dimXTop + sideA + sideB;
    }

    private static double calculateArea(int dimX, int dimXTop, int dimY)    {
        return ((dimX + dimY)/2) * dimY;
    }
}
