package pkk.interview.model;

import java.util.List;

public class Model {
    private String line;
    private int speed;
    private List<String> lineAnime;

    public Model() {
    }

    public Model(String line, int speed) {
        this.line = line;
        this.speed = speed;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public List<String> getLineAnime() {
        return lineAnime;
    }

    public void setLineAnime(List<String> lineAnime) {
        this.lineAnime = lineAnime;
    }

    @Override
    public String toString() {
        return "model{" +
                "line='" + line + '\'' +
                ", speed=" + speed +
                ", lineAnime=" + lineAnime +
                '}';
    }
}
