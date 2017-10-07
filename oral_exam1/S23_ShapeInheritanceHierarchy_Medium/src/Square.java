/**
 * The Square class extends the TwoDimensionalShapes. The fields that are
 * specific to this Square class perimeter and area. The methods that
 * are specific to this class is the setters and getters for the instance
 * fields, calculateArea function and calculatePerimeter function
 */
public class Square extends TwoDimensionalShapes{

    private int perimeter;
    private int area;

    /**
     * Constructor with the argument name of the square as its parameter.
     * It calls the super class constructor(TwoDimensionalShapes).
     * @param name the name of the square
     */
    public Square(String name) {
        super(name);
    }

    /**
     * Constructor with the argument name of the square and the side
     * as its parameter. It calls the super class constructor(TwoDimensionalShapes).
     * It also calculates the area and the perimeter of the square
     * @param name the name of the circle
     * @param side the side of the circle
     */
    public Square(String name, int side) {
        super(name, side, side);
        this.perimeter = calculatePerimeter(side);
        this.area = calculateArea(side);
    }

    /**
     * the accessor method returns the value of the instance variable perimeter
     * @return the perimeter of the square
     */
    public int getPerimeter() {
        return perimeter;
    }

    /**
     * the mutator method sets the value of the instance variable perimeter of the value
     * passed in the argument. it also set the dimX and dimY from the perimeter value
     * given.
     * @param perimeter perimeter of the square
     */
    public void setPerimeter(int perimeter) {
        this.perimeter = perimeter;
        setDimX(perimeter/4);
        setDimY(perimeter/4);
    }

    /**
     * the accessor method returns the value of the instance variable area
     * @return the area of the square
     */
    public int getArea() {
        return area;
    }

    /**
     * the mutator method sets the value of the instance variable area of the value
     * passed in the argument. it also set the dimX and dimY from the area value
     * given.
     * @param area the area of the square
     */
    public void setArea(int area) {
        this.area = area;
        setDimX((int) Math.sqrt((double) area));
        setDimY((int) Math.sqrt((double) area));
    }

    /**
     * This method calculates the perimeter of the square given a
     * side of the square
     * @param dimX a side of the square
     * @return the perimeter of the square
     */
    private static int calculatePerimeter(int dimX) {
        return 4*dimX;
    }

    /**
     * This method calculates the area of the square given a
     * side of the square
     * @param dimX
     * @return
     */
    private static int calculateArea(int dimX)  {
        return (int) Math.pow(dimX,2);
    }
}
