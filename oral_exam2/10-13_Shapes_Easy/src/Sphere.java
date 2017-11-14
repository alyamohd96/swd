public class Sphere extends ThreeDimensionalShape{

    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return calculateArea(this.radius);
    }

    @Override
    public double getVolume()   {
        return calculateVolume(this.radius);
    }

    @Override
    public String toString()   {
        return " The area of this Sphere is: " + String.valueOf(getArea() + " and the volume is " + String.valueOf(getVolume()) + "\n");
    }

    public static double calculateArea(double radius)    {
        return 4*Math.PI*Math.pow(radius,2);
    }

    public static double calculateVolume(double radius)  {
        return (4/3)*Math.PI*Math.pow(radius,3);
    }
}


