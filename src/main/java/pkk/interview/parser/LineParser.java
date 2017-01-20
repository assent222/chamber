package pkk.interview.parser;

import pkk.interview.model.Model;
import pkk.interview.parser.validation.InputStringValidation;
import pkk.interview.parser.validation.ModelValidation;
import pkk.interview.parser.validation.ValidationException;

public class LineParser {

    private InputStringValidation inputStringValidation = new InputStringValidation();
    private ModelValidation modelValidation = new ModelValidation();

    public Model parse(String str) throws ValidationException {
        if (!inputStringValidation.validate(str)) {
            throw new ValidationException("Invalid input string=" + str);
        }

        int comaIndex = str.indexOf(',');
        String line = str.substring(1, comaIndex - 1);
        int speed = Integer.parseInt(str.substring(comaIndex + 2));
        Model model = new Model(line,speed);

        if (!modelValidation.validate(model)) {
            throw new ValidationException("Invalid input string=" + str);
        }
        return model;
    }
}
