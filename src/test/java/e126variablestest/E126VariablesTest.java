package e126variablestest;

import org.example.e126.E126Variables;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

import static org.junit.Assert.*;

public class E126VariablesTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() throws NoSuchFieldException, IllegalAccessException {
        System.setOut(new PrintStream(outContent));
        // Use reflection to reset count to 0 before each test
        resetCountUsingReflection();
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    private void resetCountUsingReflection() throws NoSuchFieldException, IllegalAccessException {
        Field countField = E126Variables.class.getDeclaredField("count");
        countField.setAccessible(true); // Bypass the access check
        countField.setInt(null, 0); // Set count to 0
        countField.setAccessible(false); // Revert the access check
    }

    @Test
    public void testInstanceCount() {
        E126Variables.main(new String[]{}); // Execute the main method to generate output
        String expectedOutput = "3" + System.lineSeparator();
        assertEquals("The output does not match the expected number of instances", expectedOutput, outContent.toString());
    }
}