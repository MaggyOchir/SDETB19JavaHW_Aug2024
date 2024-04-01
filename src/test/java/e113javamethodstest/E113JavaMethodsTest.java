package e113javamethodstest;

import org.example.e113.E113JavaMethods;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;

public class E113JavaMethodsTest {

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
    public void testPrintTime() {
        E113JavaMethods.main(new String[]{}); // No arguments are passed as it's not needed
        String expectedOutput = "11:30"+System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }
}

