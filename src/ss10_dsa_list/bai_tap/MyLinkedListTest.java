package ss10_dsa_list.bai_tap;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<Integer> linkedList=new MyLinkedList<Integer>();
        linkedList.addFirst(3);
        linkedList.addFirst(2);
        linkedList.addFirst(1);
        linkedList.addLast(4);
        linkedList.addLast(5);
        linkedList.addLast(6);
        linkedList.printList();

        linkedList.add(2,7);
        System.out.println("List after add 7 at index=2");
        linkedList.printList();

        System.out.println("The first element: "+linkedList.getFirst());
        System.out.println("The last element: "+linkedList.getLast());
    }
}
