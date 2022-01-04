package ss6_Inheritance.bai_tap;

public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle=new Triangle(3,4,5,"red",true);
        System.out.println(triangle);

        triangle.setSide1(2);
        triangle.setSide2(2);
        triangle.setSide3(2);
        System.out.println(triangle);
    }
}
