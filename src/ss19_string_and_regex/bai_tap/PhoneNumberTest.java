package ss19_string_and_regex.bai_tap;

public class PhoneNumberTest {
    private static PhoneNumber phoneNumber;
    public static final String[] validPhoneNumber = new String[]{"84-0978489648", "49-0449529501", "84-0332949532"};
    public static final String[] invalidPhoneNumber = new String[]{"a8-22222222", "a.-35202123", "@2-4234234324"};

    public static void main(String args[]) {
        phoneNumber = new PhoneNumber();
        for (String number : validPhoneNumber) {
            boolean isvalid = phoneNumber.validate(number);
            System.out.println("PhoneNumber is " + number + " is valid: " + isvalid);
        }
        for (String number : invalidPhoneNumber) {
            boolean isvalid = phoneNumber.validate(number);
            System.out.println("PhoneNumber is " + number + " is valid: " + isvalid);
        }
    }
}
