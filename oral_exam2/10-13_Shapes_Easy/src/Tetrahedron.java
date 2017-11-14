public class Tetrahedron extends ThreeDimensionalShape {

    private double edge;

    public Tetrahedron(double edge) {
        this.edge = edge;
    }

    @Override
    public double getArea() {
        return calculateArea(this.edge);
    }

    @Override
    public double getVolume()   {
        return calculateVolume(this.edge);
    }

    @Override
    public String toString()   {
        return " The area of this Tetrahedron is: " + String.valueOf(getArea() + " and the volume is " + String.valueOf(getVolume()) + "\n");
    }

    public static double calculateArea(double edge)    {
        return Math.sqrt(3)*Math.pow(edge,2);
    }

    public static double calculateVolume(double edge)  {
        return Math.pow(edge,3) / (6*Math.sqrt(2));
    }
}
