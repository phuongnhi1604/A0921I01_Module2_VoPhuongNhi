package ss6_Inheritance.bai_tap;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(){
        super();
    }

    public Cylinder(double radius, String color, double height){
        super(radius,color);
        this.height=height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return this.height*Math.PI*this.getRadius()*this.getRadius();
    }

    public String toString(){
        return "A Cylinder with radius="+this.getRadius()+" and height="+this.getHeight()+ " has Volume = "+this.getVolume() + " with color of " + getColor();
    }
}
