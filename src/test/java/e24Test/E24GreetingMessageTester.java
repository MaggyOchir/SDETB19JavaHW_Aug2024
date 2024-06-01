package e24Test;


import org.example.e24.E24GreetingMessage;
import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.*;

class E24GreetingMessageTester {

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
    void testGreetingMessage() {
        String simulatedInput = "Alice\nBlue\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E24GreetingMessage.main(new String[]{});
        String expectedOutput = "What is your name?" + System.lineSeparator() +
                                "What is your favorite color?" + System.lineSeparator() +
                                "Hello Alice! It's great to know that your favorite color is Blue!" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values.\n" +
                "Please ensure that your program captures the name and favorite color correctly and prints them as specified.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
