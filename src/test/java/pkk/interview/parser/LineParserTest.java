package pkk.interview.parser;

import org.junit.Before;
import org.junit.Test;
import pkk.interview.model.Model;
import pkk.interview.parser.validation.ValidationException;

import static org.junit.Assert.*;

public class LineParserTest {

    private LineParser parser;

    @Before
    public void setUp() throws Exception {
        parser = new LineParser();
    }

    @Test
    public void parse() throws Exception {
        String line = "\"R.....\", 2";
        Model model = parser.parse(line);

        assertEquals("R.....", model.getLine());
        assertEquals(2, model.getSpeed());
        assertNull(model.getLineAnime());
    }

    @Test(expected = ValidationException.class)
    public void parse_invalidInput_0() throws Exception {
        String line = "\"R.....\" 2";
        Model model = parser.parse(line);
    }

    @Test(expected = ValidationException.class)
    public void parse_invalidInput_1() throws Exception {
        String line = "...R..";
        Model model = parser.parse(line);
    }
}