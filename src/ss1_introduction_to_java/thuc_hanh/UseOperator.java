package ss1_introduction_to_java.thuc_hanh;
import java.util.Scanner;

public class UseOperator {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter width: ");
        width= scanner.nextFloat();

        System.out.print("Enter height: ");
        height=scanner.nextFloat();

        float area=width*height;

        System.out.println("Area is: "+area);
    }
}
