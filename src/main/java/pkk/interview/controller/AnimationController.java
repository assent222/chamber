package pkk.interview.controller;

import pkk.interview.model.Model;
import pkk.interview.parser.LineParser;
import pkk.interview.parser.validation.ValidationException;
import pkk.interview.service.Animation;
import pkk.interview.view.LineView;

public class AnimationController {
        private LineParser parser = new LineParser();
        private LineView view = new LineView();
        private Animation animation = new Animation();
        
        public void doAnimation(String line){
            try {
                Model model = parser.parse(line);
                animation.animate(model);
                view.view(model);
            } catch (ValidationException e) {
                System.out.println("Invalid input string=" + e.getMessage());
            }
        }
    }