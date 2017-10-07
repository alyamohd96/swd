/**
 * k\
 */
public class Rectangle extends TwoDimensionalShapes{

    private double perimeter;
    private double area;

    public Rectangle(String name)   {
        super(name);
    }

    public Rectangle(String name, int dimX, int dimY)   {
        super(name, dimX, dimY);
        this.perimeter = calculatePerimeter(dimX,dimY);
        this.area = calculateArea(dimX,dimY);
    }

    public double getPerimeter() {
        return perimeter;
    }

    public double getArea() {
        return area;
    }

    private static int calculatePerimeter(int dimX, int dimY)   {
        return (2*dimX) + (2*dimY);
    }

    private static int calculateArea(int dimX,int dimY) {
        return dimX*dimY;
    }
}
