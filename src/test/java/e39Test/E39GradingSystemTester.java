package e39Test;

import org.example.e39.E39LogicalOperators;
import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.*;

class E39GradingSystemTester {

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
    void testGradeA() {
        String simulatedInput = "85\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E39LogicalOperators.main(new String[]{});
        String expectedOutput = "Please enter your mark" + System.lineSeparator() +
                                "85" + System.lineSeparator() +
                                "Your grade is A" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for grade A.\n" +
                "Please ensure that your program captures the input correctly and determines the grade.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testInvalidMark() {
        String simulatedInput = "-5\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E39LogicalOperators.main(new String[]{});
        String expectedOutput = "Please enter your mark" + System.lineSeparator() +
                                "-5" + System.lineSeparator() +
                                "Please enter valid mark" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for an invalid mark.\n" +
                "Please ensure that your program captures the input correctly and handles invalid marks.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testGradeB() {
        String simulatedInput = "75\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E39LogicalOperators.main(new String[]{});
        String expectedOutput = "Please enter your mark" + System.lineSeparator() +
                                "75" + System.lineSeparator() +
                                "Your grade is B" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for grade B.\n" +
                "Please ensure that your program captures the input correctly and determines the grade.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testGradeC() {
        String simulatedInput = "55\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E39LogicalOperators.main(new String[]{});
        String expectedOutput = "Please enter your mark" + System.lineSeparator() +
                                "55" + System.lineSeparator() +
                                "Your grade is C" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for grade C.\n" +
                "Please ensure that your program captures the input correctly and determines the grade.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testGradeD() {
        String simulatedInput = "50\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E39LogicalOperators.main(new String[]{});
        String expectedOutput = "Please enter your mark" + System.lineSeparator() +
                                "50" + System.lineSeparator() +
                                "Your grade is D" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for grade D.\n" +
                "Please ensure that your program captures the input correctly and determines the grade.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testGradeE() {
        String simulatedInput = "30\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E39LogicalOperators.main(new String[]{});
        String expectedOutput = "Please enter your mark" + System.lineSeparator() +
                                "30" + System.lineSeparator() +
                                "Your grade is E" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for grade E.\n" +
                "Please ensure that your program captures the input correctly and determines the grade.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testGradeF() {
        String simulatedInput = "20\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E39LogicalOperators.main(new String[]{});
        String expectedOutput = "Please enter your mark" + System.lineSeparator() +
                                "20" + System.lineSeparator() +
                                "Your grade is F" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for grade F.\n" +
                "Please ensure that your program captures the input correctly and determines the grade.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
