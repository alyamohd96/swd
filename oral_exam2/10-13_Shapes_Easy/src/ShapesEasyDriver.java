/**
 * This is the driver class for Shapes Easy. It creates a few different shapes and stores it in a ShapesBaseClass
 * array. Then, it will print the class of the shape whether two dimensional or three dimensional, areas and volume
 * of the shape.
 */
public class ShapesEasyDriver {

    public static void main(String args[])  {

        ShapesBaseClass[] shapes = new ShapesBaseClass[6];

        shapes[0] = new Circle(5.4);
        shapes[1] = new Square(8.4);
        shapes[2] = new Triangle(4,6);
        shapes[3] = new Cube(5);
        shapes[4] = new Sphere(6.5);
        shapes[5] = new Tetrahedron(9.3);

        System.out.print("Printing Polymorphically:\n");

        for (ShapesBaseClass currentShape: shapes)  {
            if(currentShape instanceof TwoDimensionalShapes) {
                System.out.print("This is a Two Dimensional Shape\n");
            }
            else    {
                System.out.print("This is a Three Dimensional Shape\n");
            }

            System.out.print(currentShape.toString());
        }

    }

}
