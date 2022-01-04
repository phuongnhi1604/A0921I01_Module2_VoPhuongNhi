package ss3_array_method.bai_tap;

import java.util.Scanner;

public class MergeArray {
    public static void inPut(int[] arr, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
    }

    public static void merge(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length + arr2.length];
        int pos = 0;
        for (int i : arr1) {
            arr3[pos] = i;
            pos++;
        }
        for (int i : arr2) {
            arr3[pos] = i;
            pos++;
        }
        System.out.println("Mảng sau khi gộp là: ");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng array1: ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        System.out.println("Nhập mảng array1: ");
        inPut(array1, size1);
        System.out.print("Nhập số lượng phần tử của mảng array2: ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];
        System.out.println("Nhập mảng array1: ");
        inPut(array2,size2);

        merge(array1,array2);
    }
}
