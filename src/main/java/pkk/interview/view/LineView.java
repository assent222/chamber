package pkk.interview.view;

import pkk.interview.model.Model;

import java.util.StringJoiner;

public class LineView {
    public void view(Model model) {
        System.out.print("Returns: {\"");
        StringJoiner joiner = new StringJoiner("\",\n");

        for (int i = 0; i < model.getLineAnime().size(); i++) {
            String line = model.getLineAnime().get(i);
            if (i == 0) {
                joiner.add(line);
            } else {
                joiner.add("          \"" + line);
            }
        }
        System.out.print(joiner);
        System.out.print("\" }");
        System.out.println();
    }

    private void viewLine(Model model){
        System.out.print("Returns: { \"");
        StringJoiner joiner = new StringJoiner("\",\"");

        for (String line : model.getLineAnime()) {
            joiner.add(line);
        }
        System.out.print(joiner);
        System.out.print("\" }");
        System.out.println();
    }

    private void viewTable(Model model){
        System.out.print("Returns: {\"");
        StringJoiner joiner = new StringJoiner("\",\n");

        for (int i = 0; i < model.getLineAnime().size(); i++) {
            String line = model.getLineAnime().get(i);
            if (i == 0) {
                joiner.add(line);
            } else {
                joiner.add("          \"" + line);
            }
        }
        System.out.print(joiner);
        System.out.print("\" }");
        System.out.println();
    }
}
