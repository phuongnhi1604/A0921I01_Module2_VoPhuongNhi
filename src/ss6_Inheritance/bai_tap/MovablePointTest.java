package ss6_Inheritance.bai_tap;

public class MovablePointTest {
    public static void main(String[] args) {
        Point point = new Point(10, 20);
        System.out.println(point);
        Point point1 = new Point();
        System.out.println(point1);
        point1.setXY(11, 12);
        System.out.println(point1);

        MovablePoint movable=new MovablePoint(10,20,30,40);
        System.out.println(movable);
        movable.move();
        System.out.println(movable);
    }
}
