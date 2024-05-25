package e206maptest;

import org.example.e206.E206Map;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class E206MapTest {
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
    public void testMapModifications() {
        E206Map.main(new String[]{});
        String output = outContent.toString();
        // Break output into segments based on the dashed line separator
        String[] parts = output.split("------------------\\r?\\n");
        assertTrue("There should be two parts separated by dashes.", parts.length == 2);

        // Extract and clean the two parts of the output
        String beforeRemoval = parts[0].trim();
        String afterRemoval = parts[1].trim();

        // Expected outputs before and after removal
        String expectedBefore =
                "HashMap Before Remove :" + System.lineSeparator() +
                        "FIVE : EEE" + System.lineSeparator() +
                        "ONE : AAA" + System.lineSeparator() +
                        "FOUR : DDD" + System.lineSeparator() +
                        "TWO : BBB" + System.lineSeparator() +
                        "THREE : CCC";

        String expectedAfter =
                "HashMap After Remove :" + System.lineSeparator() +
                        "FIVE : EEE" + System.lineSeparator() +
                        "TWO : BBB" + System.lineSeparator() +
                        "THREE : CCC";

        // Sort both the actual and expected to ensure the comparison is valid regardless of HashMap's order
        assertTrue("Output before removal does not match expected.", compareOutput(beforeRemoval, expectedBefore));
        assertTrue("Output after removal does not match expected.", compareOutput(afterRemoval, expectedAfter));
    }

    private boolean compareOutput(String actual, String expected) {
        String[] actualLines = actual.split(System.lineSeparator());
        String[] expectedLines = expected.split(System.lineSeparator());
        Arrays.sort(actualLines);
        Arrays.sort(expectedLines);
        return Arrays.equals(actualLines, expectedLines);
    }
}