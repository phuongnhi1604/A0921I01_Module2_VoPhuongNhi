package ss12_java_collection_framework.thuc_hanh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainCompare {
    public static void main(String[] args) {
        StudentComparable student=new StudentComparable("Kien",30,"HN");
        StudentComparable student1=new StudentComparable("Nam",26,"HN");
        StudentComparable student2=new StudentComparable("Anh",38,"HT");
        StudentComparable student3=new StudentComparable("Tung",38,"HT");

        List<StudentComparable> lists = new ArrayList<StudentComparable>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        Collections.sort(lists);
        for (StudentComparable st : lists){
            System.out.println(st.toString());
        }


    }
}
