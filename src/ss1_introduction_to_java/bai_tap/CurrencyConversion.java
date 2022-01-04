package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double rate = 23000;
        double usd;
        double vnd;
        System.out.print("Nhập số tiền USD: ");
        usd = scanner.nextDouble();
        vnd = usd * rate;
        System.out.print("Giá trị VND: " + vnd);

    }
}
