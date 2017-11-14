public class Square extends TwoDimensionalShapes{

    private double edge;

    public Square(double edge)  {
        this.edge = edge;
    }

    @Override
    public double getArea() {
        return calculateArea(this.edge);
    }

    public static double calculateArea(double edge)   {
        return Math.pow(edge,2);
    }
}
