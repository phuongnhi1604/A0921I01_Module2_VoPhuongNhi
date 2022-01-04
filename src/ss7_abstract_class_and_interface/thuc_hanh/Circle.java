package ss7_abstract_class_and_interface.thuc_hanh;

public class Circle {
    private double radius=1.0;
    private String color="blue";
    private boolean filled=true;

    public Circle(){}

    public Circle(double radius){
        this.radius=radius;
    }
    public Circle(double radius, String color, boolean filled){
        this.radius=radius;
        this.color=color;
        this.filled=filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }

    public String toString(){
        return "A Circle with radius="+getRadius()+" with color of " + getColor() + " and " + (isFilled() ? "filled" : "not filled");
    }
}
