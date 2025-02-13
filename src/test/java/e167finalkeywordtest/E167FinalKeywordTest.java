package e167finalkeywordtest;

import org.example.e167.E167FinalKeyword;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E167FinalKeywordTest {

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
    public void testPrintURL() {
        E167FinalKeyword.main(new String[]{});
        String expectedOutput = "[https://syntaxtechs.com](https://syntaxtechs.com/)"; // Ensure newline is included if the main method prints with println or adjust accordingly
        assertEquals(expectedOutput, outContent.toString());
    }

}