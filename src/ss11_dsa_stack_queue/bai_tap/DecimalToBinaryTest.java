package ss11_dsa_stack_queue.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinaryTest {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        int num;
        do {
            System.out.print("Nhập số cần chuyển đổi: ");
            num = scanner.nextInt();
        } while (num < 0);
        while (num != 0) {
            int temp = num % 2;
            stack.push(temp);
            num = num / 2;
        }
        System.out.print("\nGía trị nhị phân là: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
