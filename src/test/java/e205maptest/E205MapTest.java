package e205maptest;

import org.example.e205.E205Map;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Locale;

import static org.junit.Assert.assertTrue;

public class E205MapTest {
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
    public void testMapOutputUpperCase() {
        E205Map.main(new String[]{});
        String output = outContent.toString().toUpperCase(Locale.ROOT);
        String[] outputLines = output.split(System.lineSeparator());
        Arrays.sort(outputLines);
        String[] expectedLines = {
                "265",
                "22180",
                "PATRICK ST",
                "UNITED STATE",
                "VIENNA"
        };
        Arrays.sort(expectedLines);
        assertTrue("Expected lines do not match actual output.",
                Arrays.equals(expectedLines, outputLines));
    }
}