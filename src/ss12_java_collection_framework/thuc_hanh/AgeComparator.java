package ss12_java_collection_framework.thuc_hanh;

import java.util.Comparator;

public class AgeComparator implements Comparator<StudentComparable> {

    @Override
    public int compare(StudentComparable o1, StudentComparable o2) {
        if (o1.getAge() > o2.getAge()){
            return 1;
        }else if (o1.getAge() == o2.getAge()){
            return 0;
        }else {
            return -1;
        }
    }
}
