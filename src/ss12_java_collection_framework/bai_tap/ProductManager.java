package ss12_java_collection_framework.bai_tap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    private List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public void edit(int id) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sửa thông tin sản phẩm có Id = " + id + ": ");
        System.out.print("\nNhập tên sản phẩm muốn sửa: ");
        String productName = scanner.nextLine();
        System.out.print("\nNhập giá sản phẩm muốn sửa: ");
        double price = scanner.nextDouble();
        Product prod = new Product(id, productName, price);
        prod.setId(id);
        prod.setProductName(productName);
        prod.setPrice(price);
        int index = -1;

        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            if (product.getId() == id) {
                products.set(i, prod);
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("\nId sản phẩm không tồn tại.");
        } else {
            products.set(index, prod);
            System.out.println("\nDanh sách sản phẩm sau khi sửa sản phẩm có Id = " + id + ":");
            displayProduct();
        }

    }

    public void delete(int id) {
        int index = -1;
        for (int i = 0; i < products.size(); i++) {
            Product prod = products.get(i);
            if (prod.getId() == id) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("\nId sản phẩm không tồn tại.");
        } else {
            products.remove(index);
            System.out.println("\nDanh sách sản phẩm sau khi xóa sản phẩm có Id = " + id + ":");
            displayProduct();
        }
    }

    public void displayProduct() {
        for (Product product : products) {
            System.out.println(product.toString());
        }
    }

    public void find(int id) {
        int index = -1;
        for (int i = 0; i < products.size(); i++) {
            Product prod = products.get(i);
            if (prod.getId() == id) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("\nKhông tìm thấy sản phẩm có Id = " + id + " trong danh sách.");
        }else {
            Product temp=products.get(index);
            System.out.println("Product{" +
                    "id=" + temp.getId() +
                    ", productName='" + temp.getProductName() + '\'' +
                    ", price=" + temp.getPrice() +
                    '}');
        }
    }

    public void sort(){
        Product product=new Product();
        Collections.sort(products,product);
        //System.out.println("\nDanh sách sau khi sắp xếp tăng dần theo giá: ");
        System.out.println("\nDanh sách sau khi sắp xếp giảm dần theo giá: ");
        displayProduct();
    }
}
