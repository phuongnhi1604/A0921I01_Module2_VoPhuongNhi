package ss7_abstract_class_and_interface.bai_tap;

public class Square extends Shape implements Colorable {
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return this.side * this.side;
    }

    public String toString() {
        return "A Square with side=" + getSide() + ", which is a subclass of " + super.toString() + " and Area=" + getArea();
    }

    @Override
    public void resize(double percent) {
        this.side = this.side + this.side * (percent / 100);
    }

    @Override
    public void howToColor() {
        System.out.println("A square filled with 4 sides.");
    }
}
