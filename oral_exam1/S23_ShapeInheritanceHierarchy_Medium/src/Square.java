/**
 * Created by ttmohd on 9/27/17.
 */
public class Square extends TwoDimensionalShapes{

    private int perimeter;
    private int area;

    public Square(String name) {
        super(name);
    }

    public Square(String name, int dimX, int dimY) {
        super(name, dimX, dimY);
        this.perimeter = calculatePerimeter(dimX);
        this.area = calculateArea(dimX);
    }

    public int getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(int perimeter) {
        this.perimeter = perimeter;
        this.dimX = this.dimY = perimeter/4;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
        this.dimX = this.dimY = (int) Math.sqrt((double) area);
    }

    private static int calculatePerimeter(int dimX) {
        return 4*dimX;
    }

    private static int calculateArea(int dimX)  {
        return (int) Math.pow(dimX,2);
    }
}
