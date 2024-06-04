package e27test;

import org.example.e27.E27PersonalizedDiscountCalculator;
import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.*;

class E27PersonalizedDiscountCalculatorTester {

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
    void testHighDiscount() {
        String simulatedInput = "Alice\n150\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E27PersonalizedDiscountCalculator.main(new String[]{});
        String expectedOutput = "Please enter your name" + System.lineSeparator() +
                "Please enter the amount you spent" + System.lineSeparator() +
                "Hello Alice, you spent 150. Your discount is 15.0." + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for an amount spent greater than 100.\n" +
                "Please ensure that your program captures the input correctly and applies a 10% discount.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testLowDiscount() {
        String simulatedInput = "Bob\n50\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E27PersonalizedDiscountCalculator.main(new String[]{});
        String expectedOutput = "Please enter your name" + System.lineSeparator() +
                "Please enter the amount you spent" + System.lineSeparator() +
                "Hello Bob, you spent 50. Your discount is 2.5." + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for an amount spent less than or equal to 100.\n" +
                "Please ensure that your program captures the input correctly and applies a 5% discount.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
