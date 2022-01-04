package ss6_Inheritance.bai_tap;

public class Point2DPoint3DTest {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(1, 2);
        System.out.println(point2D);

        Point2D point2D1 = new Point2D();
        System.out.println(point2D1);
        point2D1.setXY(3, 4);
        System.out.println(point2D1);


        Point3D point3D=new Point3D(1,2,3);
        System.out.println(point3D);

        Point3D point3D1=new Point3D();
        System.out.println(point3D1);
        point3D1.setXYZ(4,5,6);
        System.out.println(point3D1);
    }
}
