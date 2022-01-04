package ss3_array_method.bai_tap;

import java.util.Scanner;

public class AddElement {
    public static void inPut(int[] arr, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
    }

    public static void outPut(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void insert(int[] arr, int x, int index) {
        int n = arr.length;
        int[] newArr = new int[n + 1];
        int j = 0;
        for (int i = 0; i < newArr.length; i++) {
            if (i == index) {
                newArr[i] = x;
            } else {
                newArr[i] = arr[j];
                j++;
            }
        }
        newArr[index] = x;
        System.out.println("\nMảng sau khi thêm phần tử: ");
        outPut(newArr);
    }

    public static void main(String[] args) {
        int[] array;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int size = scanner.nextInt();
        array = new int[size];
        inPut(array, size);

        System.out.print("\nNhập giá trị phần tử muốn chèn: ");
        int x = scanner.nextInt();
        int pos;
        do {
            System.out.print("Nhập vị trí muốn chèn:  ");
            pos = scanner.nextInt();
            if (pos < 1 || pos > array.length + 1)
                System.out.print("Vị trí không phù hợp.");
        } while (pos < 1 || pos > array.length + 1);

        System.out.println("Mảng trước khi thêm phần tử: ");
        outPut(array);

        insert(array, x, pos - 1);
    }
}
