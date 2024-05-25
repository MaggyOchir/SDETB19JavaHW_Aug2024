package e204maptest;

import org.example.e204.E204Map;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E204MapTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testMapOutputOrder() {
        E204Map.main(new String[]{});
        String expectedOutput =
                "Patrick ST" + System.lineSeparator() +
                        "265" + System.lineSeparator() +
                        "Vienna" + System.lineSeparator() +
                        "22180" + System.lineSeparator() +
                        "United State" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }
}