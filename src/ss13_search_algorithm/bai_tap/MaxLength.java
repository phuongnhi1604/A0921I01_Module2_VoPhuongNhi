package ss13_search_algorithm.bai_tap;

import java.util.LinkedList;
import java.util.Scanner;


public class MaxLength {
    public static void main(String[] args) {
        LinkedList<Character> linkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi bất kỳ: ");
        String str = scanner.nextLine();

        for (int i = 0; i < str.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(str.charAt(i));
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) > list.getLast())
                    list.add(str.charAt(j));
            }
            if (list.size() > linkedList.size()) {
                linkedList.clear();
                linkedList.addAll(list);
            }
            list.clear();
        }

        for (Character ch : linkedList) {
            System.out.print(ch);
        }
        System.out.println();
    }
}
