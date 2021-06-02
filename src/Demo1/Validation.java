package Demo1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
    private static Pattern pattern;
    private static final String NAME_REGEX = "^[a-zA-z]*$";
    private static final String PHONE_NUM_REGEX = "^[0]{1}[0-9]{9}$";
    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    public Validation() {
        pattern = Pattern.compile(EMAIL_REGEX);
    }

    public boolean validates(String regex) {
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }


}
