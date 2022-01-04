package ss11_dsa_stack_queue.bai_tap;

public class Solution {
    private static class Node {
        int data;
        Node link;
    }

    private static class Queue {
        Node front;
        Node rear;
    }

    public static void enQueue(Queue q, int data) {
        Node temp = new Node();
        temp.data = data;
        if (q.front == null)
            q.front = temp;
        else q.rear.link = temp;
        q.rear = temp;
        q.rear.link = q.front;
    }

    public static int deQueue(Queue q) {
        if (q.front==null){
            System.out.println("Queue is empty!");
        }
        int value;
        if (q.front==q.rear){
            value=q.front.data;
            q.front=null;
            q.rear=null;
        }else {
            Node temp=q.front;
            value=temp.data;
            q.front=q.front.link;
            q.rear.link=q.front;
        }
        return value;
    }

    public static void displayQueue(Queue q){
        Node temp=q.front;
        System.out.println("\nCác phần tử trong danh sách liên kết vòng là: ");
        while (temp.link != q.front){
            System.out.printf(" %d",temp.data);
            temp=temp.link;
        }
        System.out.printf(" %d",temp.data);
    }

    public static void main(String[] args) {
        Queue queue=new Queue();
        queue.front= queue.rear=null;
        enQueue(queue,3);
        enQueue(queue, 7);
        enQueue(queue, 8);
        enQueue(queue,2);

        displayQueue(queue);

        System.out.printf("\nXóa phần tử có giá trị: %d",deQueue(queue));
        displayQueue(queue);

        enQueue(queue,10);
        displayQueue(queue);
    }
}
