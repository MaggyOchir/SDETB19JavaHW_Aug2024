package e26test;

import org.example.e26.E26GreetingBasedOnTime;
import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.*;

class E26GreetingBasedOnTimeTester {

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
    void testMorningGreeting() {
        String simulatedInput = "morning\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E26GreetingBasedOnTime.main(new String[]{});
        String expectedOutput = "What time of day is it (morning, afternoon, evening)?" + System.lineSeparator() +
                "Good morning!" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for the input 'morning'.\n" +
                "Please ensure that your program captures the time of day correctly and prints the corresponding greeting.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testAfternoonGreeting() {
        String simulatedInput = "afternoon\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E26GreetingBasedOnTime.main(new String[]{});
        String expectedOutput = "What time of day is it (morning, afternoon, evening)?" + System.lineSeparator() +
                "Good afternoon!" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for the input 'afternoon'.\n" +
                "Please ensure that your program captures the time of day correctly and prints the corresponding greeting.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testEveningGreeting() {
        String simulatedInput = "evening\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E26GreetingBasedOnTime.main(new String[]{});
        String expectedOutput = "What time of day is it (morning, afternoon, evening)?" + System.lineSeparator() +
                "Good evening!" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for the input 'evening'.\n" +
                "Please ensure that your program captures the time of day correctly and prints the corresponding greeting.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testDefaultGreeting() {
        String simulatedInput = "night\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E26GreetingBasedOnTime.main(new String[]{});
        String expectedOutput = "What time of day is it (morning, afternoon, evening)?" + System.lineSeparator() +
                "Hello!" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for an unrecognized input.\n" +
                "Please ensure that your program captures the time of day correctly and prints the default greeting for unrecognized inputs.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
