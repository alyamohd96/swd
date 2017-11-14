public class Cube extends ThreeDimensionalShape {

    private double edge;

    public Cube(double edge)   {
        this.edge = edge;
    }

    @Override
    public double getArea()  {
        return calculateArea(this.edge);
    }

    @Override
    public double getVolume()   {
        return calculateVolume(this.edge);
    }

    @Override
    public String toString()   {
        return " The area of this Cube is: " + String.valueOf(getArea() + " and the volume is " + String.valueOf(getVolume()) + "\n");
    }

    public static double calculateArea(double edge)    {
        return 6*Math.pow(edge,2);
    }

    public static double calculateVolume(double edge) {
        return Math.pow(edge,3);
    }

}
