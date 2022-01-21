package ss17_io_binary_file_and_serialization.thuc_hanh;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MainStudent {
    public static void writeToFile(String path, List<Student> students) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Vũ Kiều Anh", "Hà Nội"));
        students.add(new Student(2, "Nguyễn Minh Quân", "Hà Nội"));
        students.add(new Student(3, "Đặng Huy Hoà", "Đà Nẵng"));
        students.add(new Student(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        students.add(new Student(5, "Nguyễn Khắc Nhật", "Hà Nội"));
        writeToFile("src\\ss17_io_binary_file_and_serialization\\student.txt",students);
        List<Student> studentDataFromFile=readDataFromFile("src\\ss17_io_binary_file_and_serialization\\student.txt");
        for (Student student : studentDataFromFile){
            System.out.println(student);
        }
    }

    public static List<Student> readDataFromFile(String path){
        List<Student> students=new ArrayList<>();
        try {
            FileInputStream fis=new FileInputStream(path);
            ObjectInputStream ois=new ObjectInputStream(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return students;
    }
}
