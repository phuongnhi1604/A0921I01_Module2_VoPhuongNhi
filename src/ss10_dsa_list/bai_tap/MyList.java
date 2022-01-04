package ss10_dsa_list.bai_tap;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    /**
     * Phương thức khởi tạo không tham số
     */
    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    /**
     * Phương thức khởi tạo có tham số
     */
    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    /**
     * Phương thức tăng gấp đôi kích thước mảng chứa các phần tử
     */
    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    /**
     * Phương thúc thêm phần tử vào danh sách tại vị trí index
     */
    public void add(int index, E element) {
        if (index >= 0 && index <= size) {
            size += 1;
            ensureCapa();
            for (int i = size - 2; i >= index; i--) {
                elements[i + 1] = elements[i];
            }
            elements[index] = element;
        }
    }

    /**
     * Phương thức xóa phần tử tại index chỉ định
     */
    public E remove(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size; i++) {
                elements[i] = elements[i + 1];
            }
            size -= 1;
        }
        return (E) elements;
    }

    /**
     * Phương thức trả về size của danh sách
     */
    public int size(){
        return size;
    }

    /**
     * Phương thức trả về một bản sao ngắn của danh sách
     */
    public E clone(){
        Object arrayTemp[]=new Object[size];
        for (int i=0;i<size;i++){
            arrayTemp[i]=elements[i];
        }
        return (E) arrayTemp;
    }

    /**
     * Phương thức kiểm tra có phần tử trong danh sách hay không
     */
    public boolean contains(E o){
        for (Object x:elements){
            if (o.equals((E) x))
                return true;
        }
        return false;
    }

    /**
     * Phương thức trả về index của giá trị có trong danh sách
     */
    public int indexOf(E o){
        for (int i=0;i<size;i++){
            if (elements[i].equals(o))
                return i;
        }
        return -1;
    }

    /**
     * Phương thức trả về phần tử vừa ở vị trí thứ i trong danh sách
     */
    public E get(int i){
        if (i>size || i<0){
            throw new IndexOutOfBoundsException("Index: "+i+", Size" + i);
        }
        return (E) elements[i];
    }

    /**
     * Phương thức xóa tất cả các phần tử trong danh sách
     */
    public void clear(){
        elements=new Object[DEFAULT_CAPACITY];
        size=0;
    }
}
