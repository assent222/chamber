package pkk.interview.parser.validation;

import pkk.interview.model.Model;

public class ModelValidation {
    public boolean validate(Model model) {
        if (model.getSpeed() >= 1 && model.getSpeed() <= 10) {
            if (!model.getLine().isEmpty() && model.getLine().length() <= 50) {
//                if (model.getLine().contains("R") || model.getLine().contains("L")) {
                    return true;
//                }
            }
        }
        return false;
    }
}