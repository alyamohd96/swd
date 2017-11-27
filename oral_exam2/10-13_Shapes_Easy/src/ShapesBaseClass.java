/**
 * This is a public interface. There are two abstract methods that should be implemented by
 * any classes that implements this interface; getArea and toString. The toString method overrides
 * the default toString method
 */
public interface ShapesBaseClass {

    /**
     * This abstract method will return a double that is the area of the shape
     * @return
     */
    public abstract double getArea();

    /**
     * This is abstract method will return a string. This method overrides the default toString method
     * @return
     */
    @Override
    public abstract String toString();

}
