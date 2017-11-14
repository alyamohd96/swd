public class Cube extends ThreeDimensionalShape {

    private double edge;

    public Cube(double edge)   {
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    @Override
    public double getSurfaceArea()  {
        return calculateArea(this.edge);
    }

    @Override
    public double getVolume()   {
        return calculateVolume(this.edge);
    }

    public static double calculateArea(double edge)    {
        return 6*Math.pow(edge,2);
    }

    public static double calculateVolume(double edge) {
        return Math.pow(edge,3);
    }

}
