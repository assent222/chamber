package pkk.interview.service;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimationTest {

    private Animation animation;

    @Before
    public void setUp() throws Exception {
        animation = new Animation();
    }

    @Test
    public void animate_0() throws Exception {
        String line = "..R....";
        int speed = 2;
        String[] res = animation.animate(speed, line);
        assertArrayEquals(new String[]{"..X....", "....X..", "......X", "......."}, res);
    }

    @Test
    public void animate_1() throws Exception {
        String line = "RR..LRL";
        int speed = 3;
        String[] res = animation.animate(speed, line);
        assertArrayEquals(new String[]{ "XX..XXX",  ".X.XX..",  "X.....X",  "......." }, res);
    }

    @Test
    public void animate_2() throws Exception {
        String line = "LRLR.LRLR";
        int speed = 2;
        String[] res = animation.animate(speed, line);
        assertArrayEquals(new String[]{ "XXXX.XXXX",  "X..X.X..X",  ".X.X.X.X.",  ".X.....X.",  "........." }, res);
    }

    @Test
    public void animate_3() throws Exception {
        String line = "RLRLRLRLRL";
        int speed = 10;
        String[] res = animation.animate(speed, line);
        assertArrayEquals(new String[]{ "XXXXXXXXXX",  ".........." }, res);
    }

    @Test
    public void animate_4() throws Exception {
        String line = "...";
        int speed = 1;
        String[] res = animation.animate(speed, line);
        assertArrayEquals(new String[]{ "..." }, res);
    }

    @Test
    public void animate_5() throws Exception {
        String line = "LRRL.LR.LRR.R.LRRL.";
        int speed = 1;
        String[] res = animation.animate(speed, line);
        assertArrayEquals(new String[]{
                "XXXX.XX.XXX.X.XXXX.",
                "..XXX..X..XX.X..XX.",
                ".X.XX.X.X..XX.XX.XX",
                "X.X.XX...X.XXXXX..X",
                ".X..XXX...X..XX.X..",
                "X..X..XX.X.XX.XX.X.",
                "..X....XX..XX..XX.X",
                ".X.....XXXX..X..XX.",
                "X.....X..XX...X..XX",
                ".....X..X.XX...X..X",
                "....X..X...XX...X..",
                "...X..X.....XX...X.",
                "..X..X.......XX...X",
                ".X..X.........XX...",
                "X..X...........XX..",
                "..X.............XX.",
                ".X...............XX",
                "X.................X",
                "..................."  }, res);
    }
}