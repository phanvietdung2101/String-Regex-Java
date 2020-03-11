import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassnameExample {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String CLASSNAME_REGEX = "^[CAP]\\d{4}[GHIKLM]$";

    public ClassnameExample() {
        pattern = Pattern.compile(CLASSNAME_REGEX);
    }

    public boolean validate(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
