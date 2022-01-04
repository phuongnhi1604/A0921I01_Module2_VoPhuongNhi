package ss3_array_method.bai_tap;

import java.util.Scanner;

public class CountNumberOfOccurrences {
    public static void main(String[] args) {
        String str = "hoc lap trinh java tai codegym";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ký tự bất kỳ: ");
        char c = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Không tìm thấy ký tự " + c + " trong chuỗi.");
        } else {
            System.out.println("Ký tự '" + c + "' xuất hiện " + count + " lần trong chuỗi.");
        }
    }
}
