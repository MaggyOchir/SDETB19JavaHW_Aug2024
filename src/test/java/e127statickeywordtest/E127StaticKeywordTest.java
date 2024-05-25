package e127statickeywordtest;

import org.example.e127.E127StaticKeyword;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;

public class E127StaticKeywordTest {

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
    public void testMethodExecution() {
        E127StaticKeyword.main(new String[]{}); // Execute the main method to capture its output
        // Construct the expected output string
        String expectedOutput = "Programming is amazing." + System.lineSeparator() +
                "Java is awesome." + System.lineSeparator();
        assertEquals("The output does not match the expected messages", expectedOutput, outContent.toString());
    }
}