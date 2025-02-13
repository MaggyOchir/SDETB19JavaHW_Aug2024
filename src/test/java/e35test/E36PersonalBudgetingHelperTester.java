package e35test;

import org.example.e36.E36LogicalOperators;
import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.*;

class E36PersonalBudgetingHelperTester {

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
    void testPrioritizingEssentials() {
        String simulatedInput = "1200\n600\n300\n200\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E36LogicalOperators.main(new String[]{});
        String expectedOutput = "Please enter your monthly rent expense" + System.lineSeparator() +
                                "Please enter your monthly food expense" + System.lineSeparator() +
                                "Please enter your monthly transportation expense" + System.lineSeparator() +
                                "Please enter your monthly entertainment expense" + System.lineSeparator() +
                                "You are prioritizing essentials well." + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for prioritizing essentials.\n" +
                "Please ensure that your program captures the input correctly and analyzes the expenses.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testOnTheRightTrack() {
        String simulatedInput = "1200\n800\n300\n400\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E36LogicalOperators.main(new String[]{});
        String expectedOutput = "Please enter your monthly rent expense" + System.lineSeparator() +
                                "Please enter your monthly food expense" + System.lineSeparator() +
                                "Please enter your monthly transportation expense" + System.lineSeparator() +
                                "Please enter your monthly entertainment expense" + System.lineSeparator() +
                                "You are on the right track, but could improve." + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for being on the right track.\n" +
                "Please ensure that your program captures the input correctly and analyzes the expenses.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testRethinkSpendingPriorities() {
        String simulatedInput = "1000\n1200\n200\n300\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E36LogicalOperators.main(new String[]{});
        String expectedOutput = "Please enter your monthly rent expense" + System.lineSeparator() +
                                "Please enter your monthly food expense" + System.lineSeparator() +
                                "Please enter your monthly transportation expense" + System.lineSeparator() +
                                "Please enter your monthly entertainment expense" + System.lineSeparator() +
                                "You need to rethink your spending priorities." + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for needing to rethink spending priorities.\n" +
                "Please ensure that your program captures the input correctly and analyzes the expenses.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
