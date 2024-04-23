package e198settest;

import org.example.e198.E198Set;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E198SetTest {

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
    public void testTreeSetOutput() {
        // Execute the main method to produce the output
        E198Set.main(new String[]{});
        // Build the expected output string
        String expectedOutput = "[America, Australia, India, South Africa]";
        // Assert that the actual output matches the expected output
        assertEquals(expectedOutput, outContent.toString());
    }
}