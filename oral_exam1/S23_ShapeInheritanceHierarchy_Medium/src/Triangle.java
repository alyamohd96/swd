import com.sun.javafx.fxml.builder.TriangleMeshBuilder;

public class Triangle extends TwoDimensionalShapes {

    private double sideA;
    private double sideB;
    private double perimeter;
    private double area;

    public Triangle(String name)    {
        super(name);
    }

    public Triangle(String name, int dimX, int dimY)    {
        super(name, dimX, dimY);

    }

    public Triangle(String name, int dimX, int dimY, double sideA, double sideB)    {
        super(name, dimX, dimY);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    private static int calculatePerimeter(int dimX, int dimY) {

    }

    private static int calculateArea()  {

    }
}
