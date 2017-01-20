package pkk.interview.service;

import pkk.interview.model.Model;

import java.util.*;

public class Animation {
    private List<Deque<LineElement>> state = new ArrayList<>();
    private int stateCountElements;

    public Model animate(Model model) {
        List<String> res = new ArrayList<>();
        initState(model.getLine());
        res.add(animateState());
        while (stateCountElements > 0) {
            updateState(model.getSpeed());
            res.add(animateState());
        }
        model.setLineAnime(res);
        return model;
    }

    //realize to be compatible with TZ
    public String[] animate(int speed, String init) {
        Model model = new Model();
        model.setLine(init);
        model.setSpeed(speed);
        return animate(model).getLineAnime().toArray(new String[0]);
    }

    private void updateState(int speed) {
        for (int i = 0; i < state.size(); i++) {
            Deque<LineElement> deque;
            deque = state.get(i);
            for (Iterator<LineElement> iterator = deque.iterator(); iterator.hasNext(); ) {
                LineElement lineElement = iterator.next();
                if (lineElement == LineElement.LEFT) {
                    iterator.remove();
                    if (i - speed >= 0) {
                        state.get(i - speed).push(LineElement.LEFT);
                    } else {
                        stateCountElements--;
                    }
                }
            }
        }
        for (int i = state.size() - 1; i >= 0; i--) {
            Deque<LineElement> deque;
            deque = state.get(i);
            for (Iterator<LineElement> iterator = deque.iterator(); iterator.hasNext(); ) {
                LineElement lineElement = iterator.next();
                if (lineElement == LineElement.RIGHT) {
                    iterator.remove();
                    if (i + speed < state.size()) {
                        state.get(i + speed).push(LineElement.RIGHT);
                    } else {
                        stateCountElements--;
                    }
                }
            }
        }
    }

    private void initState(String str) {
        state.clear();
        stateCountElements = 0;
        for (char c : str.toCharArray()) {
            ArrayDeque<LineElement> deque = new ArrayDeque<>();
            switch (c) {
                case 'R':
                    deque.add(LineElement.RIGHT);
                    stateCountElements++;
                    break;
                case 'L':
                    deque.add(LineElement.LEFT);
                    stateCountElements++;
                    break;
                case '.':
                    //NOP
                    break;
                default:
                    throw new IllegalArgumentException();
            }
            state.add(deque);
        }
    }

    private String animateState() {
        StringBuilder builder = new StringBuilder();
        for (Deque<LineElement> deque : state) {
            if (deque.isEmpty()) {
                builder.append(".");
            } else {
                builder.append("X");
            }
        }
        return builder.toString();
    }

    private enum LineElement {
        RIGHT, LEFT
    }
}