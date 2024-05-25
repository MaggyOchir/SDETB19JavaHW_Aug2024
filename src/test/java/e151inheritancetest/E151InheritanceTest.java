package e151inheritancetest;
import org.example.e151.E151Inheritance;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E151InheritanceTest {

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
    public void testAvgElementsThroughMainOutput() {
        E151Inheritance.main(new String[]{}); // Calls main, which hypothetically prints the average
        assertEquals("The output from the main method does not match the expected output.", "45", outContent.toString().trim());
    }
}