package ss14_sort_algorithm.bai_tap;

public class InsertSort {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

    public static void insertSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            int k;
            for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
                list[k + 1] = list[k];
            }
            list[k + 1] = currentElement;
        }
    }

    public static void main(String[] args) {
        System.out.println("Mảng trước khi sắp xếp: ");
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");

        insertSort(list);
        System.out.println("\nMảng sau khi sắp xếp: ");
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}
