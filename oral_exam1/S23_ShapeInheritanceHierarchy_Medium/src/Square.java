/**
 * Created by ttmohd on 9/27/17.
 */
public class Square extends TwoDimensionalShapes{

    private int perimeter;
    private int area;

    public Square(String name) {
        super(name);
    }

    public Square(String name, int side) {
        super(name, side, side);
        this.perimeter = calculatePerimeter(side);
        this.area = calculateArea(side);
    }

    public int getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(int perimeter) {
        this.perimeter = perimeter;
        setDimX(perimeter/4);
        setDimY(perimeter/4);
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
        setDimX((int) Math.sqrt((double) area));
        setDimY((int) Math.sqrt((double) area));
    }

    private static int calculatePerimeter(int dimX) {
        return 4*dimX;
    }

    private static int calculateArea(int dimX)  {
        return (int) Math.pow(dimX,2);
    }
}
