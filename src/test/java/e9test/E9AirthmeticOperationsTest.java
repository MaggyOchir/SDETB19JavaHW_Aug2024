package e9test;

import org.example.e9.E9AirthmeticOperations;
import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class E9AirthmeticOperationsTester {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void testArithmeticOperations() {
        E9AirthmeticOperations.main(new String[]{});
        String expectedOutput = "The multiplication of 8.2 with itself is equal to 67.24" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values.\n" +
                "Please ensure that your program creates a float variable with the value 8.2, multiplies it by itself, and prints the result.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
