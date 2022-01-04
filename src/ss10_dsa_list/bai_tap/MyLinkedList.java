package ss10_dsa_list.bai_tap;

import javax.xml.soap.Node;

public class MyLinkedList<E> {
    private Node head;
    private int numNodes;

    public MyLinkedList() {
    }

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public void add(int index, E element) {
        Node temp = head;
        Node holder;

        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }

        holder = temp.next;
        temp.next = new Node(element);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(E e) {
        Node temp = head;
        head = new Node(e);
        head.next = temp;
        numNodes++;
    }

    public void addLast(E e) {
       if (head==null)
           addFirst(e);
       else {
           Node temp=head;
           while (temp.next != null)
               temp=temp.next;
           temp.next=new Node(e);
       }
    }

    public void remove(int index) {
        Node temp=head;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp.next = temp.next.next;
        }
        numNodes--;
    }

    public int size() {
        Node temp=head;
        int count=0;
        while (temp!=null){
            temp=temp.next;
            count++;
        }
        return count;
    }

    public boolean contains(E o) {
        Node temp=head;
        boolean check=false;
        for (int i=0;i<=numNodes;i++){
            if ((temp.data).equals(o)){
                check=true;
                break;
            }
            else {
                check=false;
                temp=temp.next;
            }
        }
        return check;
    }

    public int indexOf(E o) {
        Node temp=head;
        int index=0;
        for (int i=0;i>numNodes;i++){
            if ((temp.data).equals(o)){
                index=i;
                break;
            }else {
                temp=temp.next;
            }
        }
        return index;
    }


    public E get(int i) {
        Node temp=head;
        for (int j=0;j<i;j++){
            temp=temp.next;
        }
        return (E) temp.data;
    }

    public E getFirst() {
        Node temp=head;
        return (E) temp.data;
    }

    public E getLast() {
        Node temp=head;
        while (temp.next!=null)
            temp=temp.next;
        return (E) temp.data;
    }

    public void printList(){
        Node temp=head;
        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
