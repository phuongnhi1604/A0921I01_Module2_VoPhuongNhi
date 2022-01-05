package ss11_dsa_stack_queue.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class BracketCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập biểu thức cần kiểm tra: ");
        String str = scanner.nextLine();
        if (check(str)){
            System.out.println("Well!");
        }else {
            System.out.println("Bad!");
        }
    }

    public static boolean check(String str) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '[' || c == '{' || c == '(') {
                stack.push(c);
            } else if (c == ']' || c == '}' || c == ')') {
                if (stack.isEmpty())
                    return false;
                switch (c){
                    case ']':
                        if (stack.pop()!='[')
                            return false;
                        break;
                    case '}':
                        if (stack.pop()!='{')
                            return false;
                        break;
                    case ')':
                        if (stack.pop()!='(')
                            return false;
                        break;
                    default:
                        break;
                }
            }
        }
        return stack.isEmpty();
    }
}
