/**
 * The Circle class extends the TwoDimensionalShapes. The fields that are
 * specific to this Circle class radius, perimeter, and area. The methods that
 * are specific to this class is the setters and getters for the instance
 * fields, calculateArea function, and calculatePerimeter function which
 * the area the perimeter respectively given a radius.
 *
 */

public class Circle extends TwoDimensionalShapes {


    private double radius;
    private double perimeter;
    private double area;

    /**
     * Constructor with the argument name of the circle as its parameter.
     * It calls the super class constructor(TwoDimensionalShapes).
     * @param name the name of the circle
     */
    public Circle(String name)  {
        super(name);
    }

    /**
     * Constructor with the argument name of the circle and the radius
     * as its parameter. It calls the super class constructor(TwoDimensionalShapes).
     * @param name the name of the circle
     * @param radius the radius of the circle
     */
    public Circle(String name, double radius)   {
        super(name, (int) radius, (int) radius);
        this.radius = radius;
        this.perimeter = calculatePerimeter(radius);
        this.area = calculateArea(radius);
    }

    /**
     * Accessor method for the radius instance field.
     * @return the radius of the circle
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Mutator method for the radius instance field. This method also
     * calculates the perimeter and the area of the circle and set them to the
     * perimeter and the area instance field.
     * @param radius the radius of the circle
     */
    public void setRadius(double radius) {
        this.radius = radius;
        this.perimeter = calculatePerimeter(radius);
        this.area = calculateArea(radius);
    }

    /**
     * Mutator method for the perimeter instance field. This method also
     * calculates the new radius of the circle and set the radius to the radius instance
     * variable
     * @param perimeter the perimeter of the circle
     */
    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
        this.radius = perimeter / (2 * Math.PI);
    }

    /**
     * Mutator method for the area instance variable. This method also
     * calculates the new radius of the circle and set the radius to the radius instance
     * @param area the area of the circle
     */
    public void setArea(double area) {
        this.area = area;
        this.radius = Math.sqrt(area/Math.PI) ;
    }

    /**
     * Accessor method for the perimeter instance variable.
     * @return the perimeter of the circle
     */
    public double getPerimeter()   {
        return this.perimeter;
    }

    /**
     * Accessor method for the area instance variable.
     * @return the area of the circle
     */
    public double getArea()    {
        return this.area;
    }

    /**
     * A static method for calculating a perimeter of the circle given
     * a radius
     * @param radius radius of a circle
     * @return perimeter of the circle
     */
    public static double calculatePerimeter(double radius)  {
        return 2 * Math.PI * radius;
    }

    /**
     * A static method for calculating a area of the circle given
     * a radius
     * @param radius radius of a circle
     * @return area of the circle
     */
    public static double calculateArea(double radius)   {
        return Math.PI * Math.pow(radius,2);
    }

}
