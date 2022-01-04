package ss11_dsa_stack_queue.bai_tap;

import java.util.Scanner;

public class ReverseTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /**
         * Đảo ngược phần tử trong mảng số nguyên
         */
        ReverseElement<Integer> array = new ReverseElement();
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();
        int value;
        for (int i = 0; i < n; i++) {
            System.out.print("\nNhập phần tử thứ " + (i + 1) + ": ");
            value = scanner.nextInt();
            array.push(value);
        }
        System.out.println("Mảng sau khi đảo ngược: ");
        while (!array.isEmpty()) {
            System.out.printf(" %d", array.pop());
        }

        /**
         * Đảo ngược chuỗi
         */
//        ReverseElement<String> wStack=new ReverseElement();
//        System.out.println("\nMời bạn nhập chuỗi cần đảo: ");
//        String str=scanner.nextLine();
//        for (int i=0;i<str.length();i++){
//            wStack.push(String.valueOf(str.charAt(i)));
//        }
//        System.out.println("Chuỗi sau khi đảo ngược:");
//        while (!wStack.isEmpty()){
//            System.out.printf("%s",wStack.pop());
//        }
    }
}
