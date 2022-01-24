package ss19_string_and_regex.bai_tap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassName {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String CLASS_REGEX = "^[CAP]{1}[0-9]{4}[GHIKLM]{1}$";

    public ClassName() {
        pattern = Pattern.compile(CLASS_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
