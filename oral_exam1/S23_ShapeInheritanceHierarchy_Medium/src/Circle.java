public class Circle extends TwoDimensionalShapes {

    private String name;
    private double radius;

    public Circle(String name)  {
        super(name);
    }

    public Circle(String name, double radius)   {
        super(name);
        this.radius = radius;
    }



}
