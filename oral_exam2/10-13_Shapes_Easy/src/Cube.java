public class Cube extends ThreeDimensionalShape {

    private double edge;

    public Cube()   {
        super();
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    @Override
    public double getSurfaceArea()  {
        return 6*Math.pow(this.edge,2);
    }

    @Override
    public double getVolume()   {
        return Math.pow(this.edge,3);
    }

}
