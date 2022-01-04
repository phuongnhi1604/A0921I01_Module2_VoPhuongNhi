package ss3_array_method.bai_tap;

import java.util.Scanner;

public class DeleteElement {
    public static void inPut(int[] arr, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
    }

    public static void outPut(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void delete(int[] arr, int x) {
        boolean isExist = false;
        for (int i = 0; i < arr.length; i++) {
            if (check(arr, x) == -1) {
                isExist = false;
            } else {
                isExist = true;
            }
        }
        if (isExist == false) {
            System.out.print("Không tìm thấy giá trị cần xóa: ");
        }else {
            for (int j=check(arr,x);j<arr.length-1;j++){
                arr[j]=arr[j+1];
            }
        }
    }

    public static int check(int[] arr, int x) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] array;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int size = scanner.nextInt();
        array = new int[size];
        inPut(array, size);
        System.out.println("Mảng vừa nhập là: ");
        outPut(array, size);

        System.out.print("Nhập phần tử cần xóa: ");
        int x = scanner.nextInt();
        System.out.println("Mảng trước khi xóa: ");
        outPut(array, size);

        delete(array,x);

        System.out.println("\nMảng sau khi xóa: ");
        outPut(array, size);
    }


}
