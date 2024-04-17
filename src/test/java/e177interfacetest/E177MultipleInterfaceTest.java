package e177interfacetest;

import org.example.e177.E177MultipleInterface;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E177MultipleInterfaceTest {

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
    public void testMainMethodOutput() {
        E177MultipleInterface.main(new String[]{});
        String expectedOutput = "Result is ::: 120.0" + System.lineSeparator() +
                "Result is ::: 80.0" + System.lineSeparator() +
                "Result is ::: 2000.0" + System.lineSeparator() +
                "Result is ::: 5.0" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }
}