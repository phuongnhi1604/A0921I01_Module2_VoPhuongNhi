package ss13_search_algorithm.bai_tap;

import java.util.LinkedList;
import java.util.Scanner;

public class ConsecutiveString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        LinkedList<Character> linkedList=new LinkedList<>();

        LinkedList<Character> list=new LinkedList<>();

        System.out.print("Nhập chuỗi bất kỳ: ");
        String str=scanner.nextLine();

        for (int i=0;i<str.length();i++){
            if (list.size()>1 && (str.charAt(i) <= list.getLast()) && (list.contains(str.charAt(i)))){
                list.clear();
            }

            list.add(str.charAt(i));
            if (list.size()>linkedList.size()){
                linkedList.clear();
                linkedList.addAll(list);
            }
        }

        for (Character ch:linkedList){
            System.out.print(ch);
        }
        System.out.println();
    }
}
