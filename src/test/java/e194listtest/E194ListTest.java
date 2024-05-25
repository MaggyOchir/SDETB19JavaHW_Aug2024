package e194listtest;

import org.example.e194.E194List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E194ListTest {

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
    public void testListModification() {
        // Execute the main method to produce the output
        E194List.main(new String[]{});
        // Build the expected output string
        String expectedOutput = "[USA, Kazakhstan, Pakistan, Russia]";
        // Assert that the actual output matches the expected output
        assertEquals(expectedOutput, outContent.toString().trim());
    }
}