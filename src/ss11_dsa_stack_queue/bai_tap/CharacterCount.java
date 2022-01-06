package ss11_dsa_stack_queue.bai_tap;

import java.awt.*;
import java.util.*;

public class CharacterCount {
    public static void characterCount(String str){
        Map<Character, Integer> map=new TreeMap<Character, Integer>();

        str.toLowerCase();
        char[] strArr=str.toCharArray();

        for (char c : strArr){
            if (map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }else {
                map.put(c,1);
            }
        }
        for (Map.Entry entry : map.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhập chuỗi bất kỳ: ");
        String inputString=scanner.nextLine();
        characterCount(inputString);
    }
}
