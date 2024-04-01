package e115javamethodstest;

import org.example.e115.E115JavaMethods;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;

public class E115JavaMethodsTest {

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
    public void testToUpperCaseOutput() {
        E115JavaMethods.main(new String[]{}); // No arguments are passed as it's not needed
        String expectedOutput = "TEST"+System.lineSeparator();; // Expect the output to include a newline character
        assertEquals(expectedOutput, outContent.toString());
    }
}

