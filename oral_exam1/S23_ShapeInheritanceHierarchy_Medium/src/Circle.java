public class Circle extends TwoDimensionalShapes {

    //private String name;
    private double radius;
    private double perimeter;
    private double area;

    public Circle(String name)  {
        super(name);
    }

    public Circle(String name, double radius)   {
        super(name, (int) radius, (int) radius);
        this.radius = radius;
        this.perimeter = calculatePerimeter(radius);
        this.area = calculateArea(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        this.perimeter = calculatePerimeter(radius);
        this.area = calculateArea(radius);
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
        this.radius = perimeter / (2 * Math.PI);
    }

    public void setArea(double area) {
        this.area = area;
        this.radius = Math.sqrt(area/Math.PI) ;
    }

    public double getPerimeter()   {
        return this.perimeter;
    }

    public double getArea()    {
        return this.area;
    }

    private static double calculatePerimeter(double radius)  {
        return 2 * Math.PI * radius;
    }

    private static double calculateArea(double radius)   {
        return Math.PI * Math.pow(radius,2);
    }

}
