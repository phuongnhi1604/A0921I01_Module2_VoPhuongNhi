package ss4_class_object.bai_tap;

import java.util.Scanner;

public class QuadraticMain {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhập giá trị a: ");
        double a=scanner.nextDouble();
        System.out.print("Nhập giá trị b: ");
        double b=scanner.nextDouble();
        System.out.print("Nhập giá trị c: ");
        double c=scanner.nextDouble();

        QuadraticEquation equation=new QuadraticEquation(a,b,c);
        if (equation.checkDelta()==1){
            System.out.println("The equation has two roots: "+equation.getRoot1()+" and "+equation.getRoot2());
        }else if (equation.checkDelta()==0){
            System.out.println("The equation has one roots: "+equation.getRoot1());
        }else {
            System.out.println("The equation has no real roots");
        }
    }
}
