package ss19_string_and_regex.bai_tap;

public class ClassNameTest {
    private static ClassName className;
    public static final String[] validClassName = new String[]{"C0318G", "A0235I", "P1243L"};
    public static final String[] invalidClassName = new String[]{"M0318G", "P0323A", "E0235M"};

    public static void main(String[] args) {
        className = new ClassName();
        for (String name : validClassName) {
            boolean isvalid = className.validate(name);
            System.out.println("ClassName is " + name + " is valid: " + isvalid);
        }
        for (String name : invalidClassName) {
            boolean isvalid = className.validate(name);
            System.out.println("ClassName is " + name + " is valid: " + isvalid);
        }
    }
}
