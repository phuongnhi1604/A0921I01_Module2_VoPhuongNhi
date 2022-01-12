package ss13_search_algorithm.bai_tap;

import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] array, int left, int right, int value) {
        int middle = (left + right) / 2;
        while (right>=left){
            if (array[middle] == value)
                return middle;
            else if (value < array[middle])
                return binarySearch(array,left,middle-1,value);
            else
                return binarySearch(array,middle+1,right,value);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] Array={1,2,3,4,5,6,7,8,9,10};
        int n=Array.length;
        int x=6;
        int result=binarySearch(Array,0,n-1,x);
        if (result==-1){
            System.out.println("Giá trị cần tìm không có trong mảng.");
        }else {
            System.out.println("Giá trị được tìm thấy tại vị trí: "+result);
        }
    }
}
