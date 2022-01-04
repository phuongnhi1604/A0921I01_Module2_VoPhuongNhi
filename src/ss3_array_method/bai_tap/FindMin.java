package ss3_array_method.bai_tap;

import java.util.Scanner;

public class FindMin {
    public static void inPut(int[] arr, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
    }
    public static void outPut(int[] arr){
        System.out.println("Mảng vừa nhập là: ");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int min(int[] arr){
        int min=arr[0];
        for (int i=1;i<arr.length;i++){
            if (arr[i]<min)
                min=arr[i];
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        inPut(array,size);
        outPut(array);
        System.out.print("\nPhần tử nhỏ nhất trong mảng là: "+min(array));
    }
}
