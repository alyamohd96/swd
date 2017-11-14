public class Tetrahedron extends ThreeDimensionalShape {

    private double edge;

    public Tetrahedron(double edge) {
        this.edge = edge;
    }

    @Override
    public double getSurfaceArea() {
        return calculateSurfaceArea(this.edge);
    }

    @Override
    public double getVolume()   {
        return calculateVolume(this.edge);
    }

    public static double calculateSurfaceArea(double edge)    {
        return Math.sqrt(3)*Math.pow(edge,2);
    }

    public static double calculateVolume(double edge)  {
        return Math.pow(edge,3) / (6*Math.sqrt(2));
    }
}
