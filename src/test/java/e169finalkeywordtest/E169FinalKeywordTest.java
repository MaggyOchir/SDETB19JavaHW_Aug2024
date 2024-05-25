package e169finalkeywordtest;

import org.example.e169.E169FinalKeyword;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E169FinalKeywordTest {

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
    public void testMainOutput() {
        // Assuming the main method is the only place avgElements is called and its result is printed
        E169FinalKeyword.main(new String[]{});
        String expectedOutput = "4.8"; // Ensure this matches exactly what main prints out, including newline characters
        assertEquals("The output from the main method did not match the expected output.", expectedOutput, outContent.toString().trim());
    }
}