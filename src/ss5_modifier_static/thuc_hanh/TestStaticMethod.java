package ss5_modifier_static.thuc_hanh;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();

        Student s1=new Student(111,"Hoang");
        Student s2=new Student(222,"Khanh");
        Student s3=new Student(333,"Nam");

        s1.disPlay();
        s2.disPlay();
        s3.disPlay();
    }
}
