/**
 * This is the driver class for the ShapeInheritanceHierarchy Homework. The driver class create 4 objects:
 * 1. ShapeBaseClass
 * 2. TwoDimensionalClass
 * 3. Circle Class
 * 4. TriangularPrism
 * It then sets to some random values and prints out the values to check whether the object has been constructed properly
 */
public class MainClass {

    public static void main(String args[]) {

        /**
         * Creates a ShapeBaseClass with the variable baseShape. It is given a name "general shape". start coordinates of (3,2) and end coordinates of
         * (7,8). It then prints those values
         */
        ShapeBaseClass baseShape = new ShapeBaseClass("general shape", 3,2,7,8);
        System.out.print("Base Shape class created with name " + baseShape.getName() + " starting at " + baseShape.getStartXCoordinates() + ","
                + baseShape.getStartYCoordinates() + " and ends at " + baseShape.getEndXCoordinates() + "," + baseShape.getEndYCoordinates() + "\n");


        /**
         * Creates a TwoDimensionalShapes object with variable twoD. The name of the twoD is given "Basic 2D" and the coordinates starts at (7,8) and ends at (15,20).
         * This object is given a fill by setting its fill value to true. It is also given a border of 10mm. The values are printed
         */
        TwoDimensionalShapes twoD = new TwoDimensionalShapes("Basic 2D");
        twoD.setStartXCoordinates(7);
        twoD.setStartYCoordinates(8);
        twoD.setEndXCoordinates(15);
        twoD.setEndYCoordinates(20);
        twoD.setFill(true);
        twoD.setBorderThickness(10);
        System.out.print("Two Dimensional Shapes extends from ShapeBaseClass created with name " + twoD.getName() + " starting at " + twoD.getStartXCoordinates() + "," +
                            + twoD.getStartYCoordinates() + " and ends at " + twoD.getEndXCoordinates() + "," + twoD.getEndYCoordinates() + ". It's fill value is " + twoD.isFill() +
                            " and it's thickness is " + twoD.getBorderThickness() + " in milimeters.\n");

        /**
         * Creates a Circle object called "Face". The area is set to 40. The names and area are then printed. Then a perimeter of a circle with radius 5 is calculated
         */
        Circle circle1 = new Circle("Face");
        circle1.setArea(40);
        System.out.print("Circle shape extends from TwoDimensionalShapes class is created with the name " + circle1.getName() + " with area " + circle1.getArea() + "\n");
        System.out.print("Using the static calculatePerimeter function from Circle class with the radius of 5: " + Circle.calculatePerimeter(5));

        /**
         * Creates a TriangularPrism object called "cool prism" with the color Magenta. Then the area of a prism with the dimX = 32.5, dimY = 12, dim Z = 5, height=5 is calculated
         */
        TriangularPrism triangularPrism1 = new TriangularPrism("cool prism", "Magenta");
        System.out.print("Triangular prism created name " + triangularPrism1.getName() + "with color " + triangularPrism1.getColor());
        double area = triangularPrism1.calculateSurfaceArea(32.5,12,5,5);
        System.out.print("The surface area of the triangular prism is " + area);
    }
}
