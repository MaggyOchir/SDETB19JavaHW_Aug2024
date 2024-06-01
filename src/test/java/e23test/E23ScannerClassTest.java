package e23test;

import org.example.e23.E23TaskCompletionChecker;
import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.*;

class E23TaskCompletionCheckerTester {

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
    void testTaskCompletionCheckerTrueFalse() {
        String simulatedInput = "true\nfalse\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E23TaskCompletionChecker.main(new String[]{});
        String expectedOutput = "Have you completed your homework? (true/false)" + System.lineSeparator() +
                "Have you completed your chores? (true/false)" + System.lineSeparator() +
                "Homework completed: true" + System.lineSeparator() +
                "Chores completed: false" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for input 'true' and 'false'.\n" +
                "Please ensure that your program captures the boolean values correctly and prints them as specified.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testTaskCompletionCheckerFalseTrue() {
        String simulatedInput = "false\ntrue\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E23TaskCompletionChecker.main(new String[]{});
        String expectedOutput = "Have you completed your homework? (true/false)" + System.lineSeparator() +
                "Have you completed your chores? (true/false)" + System.lineSeparator() +
                "Homework completed: false" + System.lineSeparator() +
                "Chores completed: true" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for input 'false' and 'true'.\n" +
                "Please ensure that your program captures the boolean values correctly and prints them as specified.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
