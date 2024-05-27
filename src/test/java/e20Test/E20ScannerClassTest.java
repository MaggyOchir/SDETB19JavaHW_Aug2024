package e20Test;

import org.example.e21.E21SumOfTwoNumbers;
import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.*;

class E21SumOfTwoNumbersTester {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final InputStream originalIn = System.in;

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
        System.setIn(originalIn);
    }

    @Test
    void testSumOfTwoNumbers() {
        String simulatedInput = "10\n5\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E21SumOfTwoNumbers.main(new String[]{});
        String expectedOutput = "Please Enter the First Number" + System.lineSeparator() +
                "Please Enter the Second Number" + System.lineSeparator() +
                "The sum is: 15" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values.\n" +
                "Please ensure that your program captures the two numbers correctly and prints the sum as specified.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
