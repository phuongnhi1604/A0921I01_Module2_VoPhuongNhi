package ss4_class_object.bai_tap;

public class FanClass {
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public FanClass() {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void turnOn() {
        this.on=true;
    }

    public void turnOff() {
        this.on=false;
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

    public String toString(){
        if (on==true)
            return "\nFan speed: " + getSpeed() + ", color: " + getColor() +
                    ", radius: " + getRadius() + "\nFan is on\n";
        else
            return "\nFan color: " + getColor() + ", radius: " + getRadius() +
                    "\nFan is off\n";
    }
}
