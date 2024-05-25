package e114javamethodstest;

import org.example.e114.E114JavaMethods;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;

public class E114JavaMethodsTest {

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
    public void testArithmeticOperations() {
        E114JavaMethods.main(new String[]{}); // No arguments are passed as it's not needed
        String expectedOutput = "Addition 30 " + System.lineSeparator() +
                "Multiplication 30 " + System.lineSeparator() +
                "Subtraction 20 " + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }
}

