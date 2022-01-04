package ss3_array_method.bai_tap;

import java.util.Scanner;

public class TotalColumn {
    public static void inPut(int[][] arr, int m, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Nhập arr[" + i + "][" + j + "] = ");
                arr[i][j] = scanner.nextInt();
            }
        }
    }

    public static void outPut(int[][] arr) {
        System.out.println("Ma trận vừa nhập: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static void totalColumn(int[][] arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cột cần tính tổng: ");
        int column = scanner.nextInt();
        int total = 0;
        for (int i = 0; i < arr.length; i++)
            total += arr[i][column - 1];

        System.out.print("Tổng các phần tử của cột thứ " + column + " là: " + total);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số dòng của ma trận: ");
        int m = scanner.nextInt();
        System.out.print("Nhập số cột của ma trận: ");
        int n = scanner.nextInt();

        int[][] array = new int[m][n];
        inPut(array, m, n);

        outPut(array);

        totalColumn(array);
    }
}
