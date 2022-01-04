package ss6_Inheritance.bai_tap;

import org.omg.CORBA.MARSHAL;

public class Circle {
    private double radius;
    private String color;

    public Circle(){}

    public Circle(double radius,String color){
        this.radius=radius;
        this.color=color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return this.radius*this.radius* Math.PI;
    }

    public String toString(){
        return "A Circle with radius="+this.getRadius()+" has Area = "+this.getArea() + " with color of " + this.getColor();
    }
}
