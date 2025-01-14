package e37Test;

import org.example.e37.E37LogicalOperators;
import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.*;

class E37ThirstyOrSleepyTester {

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
    void testThirstyNotSleepy() {
        String simulatedInput = "true\nfalse\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E37LogicalOperators.main(new String[]{});
        String expectedOutput = "Are you thirsty? (true/false)" + System.lineSeparator() +
                                "true" + System.lineSeparator() +
                                "Are you sleepy? (true/false)" + System.lineSeparator() +
                                "false" + System.lineSeparator() +
                                "Looks like you need to drink water" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for thirsty and not sleepy.\n" +
                "Please ensure that your program captures the input correctly and suggests the right drink.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testThirstyAndSleepy() {
        String simulatedInput = "true\ntrue\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E37LogicalOperators.main(new String[]{});
        String expectedOutput = "Are you thirsty? (true/false)" + System.lineSeparator() +
                                "true" + System.lineSeparator() +
                                "Are you sleepy? (true/false)" + System.lineSeparator() +
                                "true" + System.lineSeparator() +
                                "Looks like you need to drink coffee" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for thirsty and sleepy.\n" +
                "Please ensure that your program captures the input correctly and suggests the right drink.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testNotThirstyButSleepy() {
        String simulatedInput = "false\ntrue\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E37LogicalOperators.main(new String[]{});
        String expectedOutput = "Are you thirsty? (true/false)" + System.lineSeparator() +
                                "false" + System.lineSeparator() +
                                "Are you sleepy? (true/false)" + System.lineSeparator() +
                                "true" + System.lineSeparator() +
                                "Looks like you need to drink tea" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for not thirsty but sleepy.\n" +
                "Please ensure that your program captures the input correctly and suggests the right drink.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testNotThirstyNotSleepy() {
        String simulatedInput = "false\nfalse\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E37LogicalOperators.main(new String[]{});
        String expectedOutput = "Are you thirsty? (true/false)" + System.lineSeparator() +
                                "false" + System.lineSeparator() +
                                "Are you sleepy? (true/false)" + System.lineSeparator() +
                                "false" + System.lineSeparator() +
                                "Looks like you need to drink nothing" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for not thirsty and not sleepy.\n" +
                "Please ensure that your program captures the input correctly and suggests the right drink.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
