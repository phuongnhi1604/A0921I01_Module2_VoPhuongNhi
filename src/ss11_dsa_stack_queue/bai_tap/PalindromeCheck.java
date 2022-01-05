package ss11_dsa_stack_queue.bai_tap;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Queue queue = new LinkedList();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi cần kiểm tra: ");
        String str = scanner.nextLine();
        for (int i = str.length() - 1; i >= 0; i--) {
            queue.add(str.charAt(i));
        }
        String tempString = "";
        while (!queue.isEmpty()) {
            tempString = tempString + queue.remove();
        }
        if (str.equals(tempString)) {
            System.out.println("Chuỗi vừa nhập là chuỗi Palindrome");
        } else {
            System.out.println("Chuỗi vừa nhập không là chuỗi Palindrome");
        }
    }
}
