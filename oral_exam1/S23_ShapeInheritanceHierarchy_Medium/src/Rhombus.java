public class Rhombus extends TwoDimensionalShapes {

    private double sides;
    private double perimeter;
    private double area;

    public Rhombus(String name) {
        super(name);
    }

    public Rhombus(String name, int dimX, int dimY)  {
        super(name, dimX, dimY);
        this.sides = calculateSide(dimX,dimY);
        this.perimeter = calculatePerimeter(sides);
        this.area = calculateArea(dimX,dimY);
    }

    public Rhombus(String name, int sides, int dimX, int dimY)  {
        super(name, dimX, dimY);
        this.sides = sides;
        this.perimeter = calculatePerimeter(sides);
        this.area = calculateArea(dimX,dimY);
    }

    public double getSides() {
        return sides;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public double getArea() {
        return area;
    }

    private static double calculateSide(int dimX, int dimY)   {
        double p = Math.pow(dimY,2);
        double q = Math.pow(dimX,2);
        return (Math.sqrt(p + q)) /2;
    }

    private static double calculatePerimeter(double sides) {
        return 4*sides;
    }

    private static double calculateArea(int dimX, int dimY) {
        return dimX*dimY/2;
    }
}
