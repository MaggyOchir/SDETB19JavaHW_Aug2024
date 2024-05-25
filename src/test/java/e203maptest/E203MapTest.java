package e203maptest;

import org.example.e203.E203Map;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E203MapTest {
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
    public void testMapOutput() {
        E203Map.main(new String[]{});
        String[] lines = outContent.toString().split(System.lineSeparator());
        // Sort lines to ensure consistent order for testing, as HashMap does not guarantee order
        java.util.Arrays.sort(lines);
        String expectedOutput =
                "Key = apple and value = 30" + System.lineSeparator() +
                        "Key = mango and value = 40" + System.lineSeparator() +
                        "Key = orange and value = 20" + System.lineSeparator();
        // Build the actual output in the same order for comparison
        StringBuilder actualOutput = new StringBuilder();
        for (String line : lines) {
            actualOutput.append(line).append(System.lineSeparator());
        }
        assertEquals(expectedOutput, actualOutput.toString());
    }
}