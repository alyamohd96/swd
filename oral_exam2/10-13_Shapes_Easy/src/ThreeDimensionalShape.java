/**
 * This is an abstract class that implements ShapesBaseClass. It contains one abstract class that will be implemented
 * by any class that inherit this class
 */
public abstract class ThreeDimensionalShape implements ShapesBaseClass {

    /**
     * This is an abstract method that will be implemented
     * by any class that inherit this class.
     * @return volume of the shape
     */
    public abstract double getVolume();
}
