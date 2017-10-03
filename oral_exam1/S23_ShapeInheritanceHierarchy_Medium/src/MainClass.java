public class MainClass {

    public static void main(String args[]) {

        ShapeBaseClass baseShape = new ShapeBaseClass("general shape", 3,2,7,8);
        System.out.print("Base Shape class created with name " + baseShape.getName() + " starting at " + baseShape.getStartXCoordinates() + ","
                + baseShape.getStartYCoordinates());
    }
}
