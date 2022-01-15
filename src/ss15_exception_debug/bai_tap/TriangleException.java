package ss15_exception_debug.bai_tap;

import java.security.cert.TrustAnchor;
import java.util.Scanner;

public class TriangleException {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Triangle triangle=new Triangle();
        boolean check=false;
        double side1;
        double side2;
        double side3;

        System.out.println("Nhập độ dài ba cạnh: ");
        while (!check){
            try{
                side1=scanner.nextDouble();
                side2=scanner.nextDouble();
                side3=scanner.nextDouble();
                triangle=new Triangle(side1,side2,side3);
                check= true;
            }catch (IllegalTriangleException e){
                //e.printStackTrace();
                System.out.println(e.getMessage());
                System.out.println("Nhập độ dài ba cạnh: ");
                scanner.nextLine();
            }
        }
        System.out.println(triangle.toString());
    }
}
