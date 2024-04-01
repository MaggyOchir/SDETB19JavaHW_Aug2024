package e111javamethodstest;

import org.example.e111.E111JavaMethods;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;

public class E111JavaMethodsTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testSyntaxMethodsOutput() {
        String[] args = {}; // No arguments needed for this test
        E111JavaMethods.main(args);
        String expectedOutput = "Welcome to Syntax Technologies!" + System.lineSeparator() +
                "Welcome Syntax Students!" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }
}

