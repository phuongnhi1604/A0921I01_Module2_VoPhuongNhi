package ss12_java_collection_framework.bai_tap;

public class MainProduct {
    public static void main(String[] args) {
        ProductManager manager=new ProductManager();
        manager.add(new Product(1, "Ban", 12000));
        manager.add(new Product(2, "Ghe", 10000));
        manager.add(new Product(3, "Tu", 15000));

        manager.displayProduct();

        manager.edit(3);

        manager.delete(1);

        System.out.println("\nThông tin sản phẩm cần tìm: ");
        manager.find(2);
        manager.find(3);

        manager.sort();
    }
}
