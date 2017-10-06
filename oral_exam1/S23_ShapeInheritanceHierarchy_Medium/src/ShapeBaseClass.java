public class ShapeBaseClass {

    private String name;
    private String color;
    private boolean fill = false;
    private int borderThickness = 1;    // border thickness in millimeters.
    private int startXCoordinates;
    private int startYCoordinates;
    private int endXCoordinates;
    private int endYCoordinates;

    public ShapeBaseClass(String name) {
        this.name = name;
    }

    public ShapeBaseClass(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public ShapeBaseClass(String name, int startXCoordinates, int startYCoordinates, int endXCoordinates, int endYCoordinates)    {
        this.name = name;
        this.startXCoordinates = startXCoordinates;
        this.startYCoordinates = startYCoordinates;
        this.endXCoordinates = endXCoordinates;
        this.endYCoordinates = endYCoordinates;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFill() {
        return fill;
    }

    public void setFill(boolean fill) {
        this.fill = fill;
    }
    
    public int getBorderThickness() {
        return borderThickness;
    }

    public void setBorderThickness(int borderThickness) {
        this.borderThickness = borderThickness;
    }

    public int getStartXCoordinates() {
        return startXCoordinates;
    }

    public void setStartXCoordinates(int startXCoordinates) {
        this.startXCoordinates = startXCoordinates;
    }

    public int getStartYCoordinates() {
        return startYCoordinates;
    }

    public void setStartYCoordinates(int startYCoordinates) {
        this.startYCoordinates = startYCoordinates;
    }

    public int getEndXCoordinates() {
        return endXCoordinates;
    }

    public void setEndXCoordinates(int endXCoordinates) {
        this.endXCoordinates = endXCoordinates;
    }

    public int getEndYCoordinates() {
        return endYCoordinates;
    }

    public void setEndYCoordinates(int endYCoordinates) {
        this.endYCoordinates = endYCoordinates;
    }
}
