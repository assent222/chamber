package pkk.interview.parser.validation;

import java.util.regex.Pattern;

public class InputStringValidation {
    private final Pattern pattern = Pattern.compile("^\"[R,L,\\.]+\", \\d+$");

    public boolean validate(String str) {
        return pattern.matcher(str).matches();
    }
}