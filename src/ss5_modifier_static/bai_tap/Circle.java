package ss5_modifier_static.bai_tap;

public class Circle {
    private double radius=1.0;
    private String color="red";

    Circle(){
    }
    Circle(double radius){
        this.radius=radius;
    }
    protected double getRadius(){
        return radius;
    }
    protected double getArea(){
        return Math.PI*Math.pow(radius,2);
    }
}
