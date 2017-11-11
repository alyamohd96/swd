

public class Cube extends ThreeDimensionalShape {

    private double edge;

    @Override
    public double getSurfaceArea()  {
        return 6*Math.pow(this.edge,2);
    }
}
