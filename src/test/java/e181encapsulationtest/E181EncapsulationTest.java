package e181encapsulationtest;

import org.example.e181.E181Encapsulation;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E181EncapsulationTest {

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
    public void testAccountOutput() {
        String[] args = {}; // Normally you would pass parameters through args if needed
        E181Encapsulation.main(args);
        String expectedOutput = "7560504000 Sumair sumair@syntax.com 50000.0";
        assertEquals(expectedOutput.trim(), outContent.toString().trim());
    }
}