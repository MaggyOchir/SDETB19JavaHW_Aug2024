package e112javamethodstest;

import org.example.e112.E112JavaMethods;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;

public class E112JavaMethodsTest {

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
    public void testPrintNumbers() {
        String[] args = {}; // No arguments needed for this test
        E112JavaMethods.main(args);
        String expectedOutput = "1" + System.lineSeparator() +
                "2" + System.lineSeparator() +
                "3" + System.lineSeparator() +
                "4" + System.lineSeparator() +
                "5" + System.lineSeparator() +
                "6" + System.lineSeparator() +
                "7" + System.lineSeparator() +
                "8" + System.lineSeparator() +
                "9" + System.lineSeparator() +
                "10" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }
}

