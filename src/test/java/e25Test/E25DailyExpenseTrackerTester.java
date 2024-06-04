package e25Test;

import org.example.e25.E25DailyExpenseTracker;
import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.*;

class E25DailyExpenseTrackerTester {

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
    void testWithinBudget() {
        String simulatedInput = "20.50\n30.75\n25.00\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E25DailyExpenseTracker.main(new String[]{});
        String expectedOutput = "Please enter your morning expense" + System.lineSeparator() +
                "Please enter your afternoon expense" + System.lineSeparator() +
                "Please enter your evening expense" + System.lineSeparator() +
                "Your total daily expense is: 76.25" + System.lineSeparator() +
                "You are within the budget." + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for expenses within the budget.\n" +
                "Please ensure that your program captures the expenses correctly and prints the results as specified.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testOverBudget() {
        String simulatedInput = "50.00\n40.00\n30.00\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E25DailyExpenseTracker.main(new String[]{});
        String expectedOutput = "Please enter your morning expense" + System.lineSeparator() +
                "Please enter your afternoon expense" + System.lineSeparator() +
                "Please enter your evening expense" + System.lineSeparator() +
                "Your total daily expense is: 120.00" + System.lineSeparator() +
                "You are over the budget." + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for expenses over the budget.\n" +
                "Please ensure that your program captures the expenses correctly and prints the results as specified.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
