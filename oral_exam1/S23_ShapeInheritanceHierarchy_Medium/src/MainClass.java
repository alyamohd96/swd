public class MainClass {

    public static void main(String args[]) {

        ShapeBaseClass baseShape = new ShapeBaseClass("general shape", 3,2,7,8);
        System.out.print("Base Shape class created with name " + baseShape.getName() + " starting at " + baseShape.getStartXCoordinates() + ","
                + baseShape.getStartYCoordinates() + " and ends at " + baseShape.getEndXCoordinates() + "," + baseShape.getEndYCoordinates() + "\n");


        //TwoDimensionalClass test
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


        //Circle class test
        Circle circle1 = new Circle("Face");
        circle1.setArea(40);
        System.out.print("Circle shape extends from TwoDimensionalShapes class is created with the name " + circle1.getName() + " with area " + circle1.getArea() + "\n");
        System.out.print("Using the static calculatePerimeter function from Circle class with the radius of 5: " + Circle.calculatePerimeter(5));

    }
}
