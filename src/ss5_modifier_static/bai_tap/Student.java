package ss5_modifier_static.bai_tap;

public class Student {
    private String name = "John";
    private String classes = "C02";

    Student() {
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setClasses(String classes) {
        this.classes = classes;
    }

    public String toString() {
        return "Name: " + this.name + "\nClasses: " + this.classes;
    }
}
