package ss17_io_binary_file_and_serialization.bai_tap;

import ss17_io_binary_file_and_serialization.thuc_hanh.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products=new ArrayList<>();
        products.add(new Product(1,"Tủ lạnh","LG",1000000));
        products.add(new Product(2,"Tivi","Samsung",500000));
        writeToFile("src\\ss17_io_binary_file_and_serialization\\product.txt",products);
        List<Product> productDataFromFile=readFile("src\\ss17_io_binary_file_and_serialization\\product.txt");
        for (Product product:productDataFromFile){
            System.out.println(product);
        }
    }

    public static List<Product> readFile(String path){
        List<Product> products=new ArrayList<>();
        try {
            FileInputStream fis=new FileInputStream(path);
            ObjectInputStream ois=new ObjectInputStream(fis);
            fis.close();
            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return products;
    }

    public static void writeToFile(String path, List<Product> products) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
