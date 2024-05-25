package e168finalkeywordtest;

import org.example.e168.E168FinalKeyword;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E168FinalKeywordTest {

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
    public void testReverseMyString() {
        E168FinalKeyword.main(new String[]{});
        String expectedOutput = "olleh"+System.lineSeparator(); // Ensure newline is included if the main method prints with println or adjust accordingly
        assertEquals(expectedOutput, outContent.toString());
    }
}
