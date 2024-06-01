package e22test;

import org.example.e22.E22UserInformationCapture;
import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.*;

class E22UserInformationCaptureTester {

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
    void testUserInformationCapture() {
        String simulatedInput = "Weqas\n123-456-7890\n45\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E22UserInformationCapture.main(new String[]{});
        String expectedOutput = "Enter your name" + System.lineSeparator() +
                "Enter your mobile number" + System.lineSeparator() +
                "Enter your age" + System.lineSeparator() +
                "Your name is Weqas, your age is 45, and your mobile number is 123-456-7890" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values.\n" +
                "Please ensure that your program captures the name, mobile number, and age correctly and prints them as specified.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
