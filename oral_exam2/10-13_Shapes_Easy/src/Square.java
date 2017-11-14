public class Square extends TwoDimensionalShapes{

    private double edge;

    public Square(double edge)  {
        this.edge = edge;
    }

    @Override
    public double getArea() {
        return calculateArea(this.edge);
    }

    @Override
    public String toString()    {
        return " The area of this Square is: " + String.valueOf(getArea() + "\n");
    }

    public static double calculateArea(double edge)   {
        return Math.pow(edge,2);
    }
}
