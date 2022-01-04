package ss2_loop.bai_tap;

import java.util.Scanner;

public class ShowPrimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers;
        int count=0;
        do {
            System.out.print("Mời bạn nhập số lượng số nguyên tố cần tìm: ");
            numbers = scanner.nextInt();
        } while (numbers < 1);
        System.out.println(numbers+" số nguyên tố đầu tiên: ");
        int i=2;
        while (count<numbers){
            if (isPrimeNumber(i)){
                System.out.print(i+" ");
                count++;
            }
            i++;
        }
    }

    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
