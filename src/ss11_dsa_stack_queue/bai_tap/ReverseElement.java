package ss11_dsa_stack_queue.bai_tap;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class ReverseElement<T> {
    private LinkedList<T> stack;

    public ReverseElement() {
        stack = new LinkedList();
    }

    public void push(T element) {
        stack.addFirst(element);
    }

    public int size() {
        return stack.size();
    }

    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }
}
