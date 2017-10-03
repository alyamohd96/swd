public class ShapeBaseClass {

    private String name;
    private String color;
    private boolean fill;
    private int borderThickness;
    private int startCoordinates;
    private int endCoordinates;

    public ShapeBaseClass(String name) {
        this.name = name;
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

    public int getStartCoordinates() {
        return startCoordinates;
    }

    public void setStartCoordinates(int startCoordinates) {
        this.startCoordinates = startCoordinates;
    }

    public int getEndCoordinates() {
        return endCoordinates;
    }

    public void setEndCoordinates(int endCoordinates) {
        this.endCoordinates = endCoordinates;
    }
}
