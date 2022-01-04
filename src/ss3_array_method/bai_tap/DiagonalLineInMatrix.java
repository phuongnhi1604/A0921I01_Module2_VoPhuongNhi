package ss3_array_method.bai_tap;

import java.util.Scanner;

public class DiagonalLineInMatrix {
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

    public static void totalDiagonal(int[][] array, int m, int n) {
        int diagonal1 = 0;
        int diagonal2 = 0;
        for (int i = 0; i < n; i++) {
            diagonal1 += array[i][i];
            diagonal2 += array[m - 1 - i][i];
        }

        System.out.println("Tổng các phần tử ở đường chéo: " + (diagonal1 + diagonal2));
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

        totalDiagonal(array, m, n);
    }
}
