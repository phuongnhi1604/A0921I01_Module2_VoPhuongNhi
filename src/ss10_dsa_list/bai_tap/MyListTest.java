package ss10_dsa_list.bai_tap;

import java.util.*;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<>();
        System.out.println("List: ");
        listInteger.add(0, 2);
        listInteger.add(1, 3);
        listInteger.add(2, 4);
        listInteger.add(3, 5);
        listInteger.add(4, 6);
        for (int i = 0; i < listInteger.size(); i++) {
            System.out.println("element " + (i + 1) + ": " + listInteger.get(i));
        }

        listInteger.add(2, 7);
        listInteger.add(6, 8);
        System.out.println("List after add 7 at index=2 and 8 at index=6: ");
        for (int i = 0; i < listInteger.size(); i++) {
            System.out.println("element " + (i + 1) + ": " + listInteger.get(i));
        }

        boolean checkContains = listInteger.contains(3);
        if (checkContains)
            System.out.println("List contains 3.");
        else
            System.out.println("List doesn't contain 3.");

        int indexOfValue = listInteger.indexOf(5);
        System.out.println("5 has index: " + indexOfValue);

        listInteger.remove(2);
        System.out.println("List after remove value at index = 2");
        for (int i = 0; i < listInteger.size(); i++) {
            System.out.println("element " + (i + 1) + ": " + listInteger.get(i));
        }

        listInteger.clone();
        System.out.println("List after clone");
        for (int i = 0; i < listInteger.size(); i++) {
            System.out.println("element " + (i + 1) + ": " + listInteger.get(i));
        }

        listInteger.clear();
    }
}
