package pkk.interview;

import pkk.interview.controller.AnimationController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {
        System.out.println("START APP");
        AnimationController animationController = new AnimationController();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("ENTER LINE (example: \"..R....\", 2)");
            String line = br.readLine();
            if (line == null) {
                continue;
            }
            if ("exit".equalsIgnoreCase(line)) {
                break;
            }
            animationController.doAnimation(line);
        }
        System.out.println("STOP APP");
    }

}
