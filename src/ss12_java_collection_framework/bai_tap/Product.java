package ss12_java_collection_framework.bai_tap;

import java.util.Comparator;

public class Product implements Comparator<Product>{
    private int id;
    private String productName;
    private double price;

    public Product(){}

    public Product(int id){
        this.id=id;
    }
    public Product(int id, String productName, double price){
        this.id=id;
        this.productName=productName;
        this.price=price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }

    /**
     *Phương thức so sánh sắp xếp tăng dần theo giá
     */
//    @Override
//    public int compare(Product o1, Product o2) {
//        if(o1.getPrice() > o2.getPrice()){
//            return 1;
//        }else if(o1.getPrice() == o2.getPrice()){
//            return 0;
//        }else{
//            return -1;
//        }
//    }

    /**
     *Phương thức so sánh sắp xếp giảm dần theo giá
     */
    public int compare(Product o1, Product o2){
        if(o1.getPrice() > o2.getPrice()){
            return -1;
        } else if (o1.getPrice() == o2.getPrice()) {
            return 0;
        } else {
            return 1;
        }
    }
}
