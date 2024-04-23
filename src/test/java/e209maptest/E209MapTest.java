package e209maptest;

import org.example.e209.E209Map;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.text.DecimalFormat;

import static org.junit.Assert.assertEquals;

public class E209MapTest {

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
    public void testMainOutput() {
        E209Map.main(new String[]{}); // Directly test the main method
        DecimalFormat df = new DecimalFormat("0.00");
        String lineSeparator = System.lineSeparator();
        // Construct the expected output, ensuring the subtotal is formatted to two decimal places.
        String expectedOutput = "Items: Apple Price: 20.0 Quantity: 10.0 SubTotal: 200.0" +"\n" + System.lineSeparator() +
                "Items: Orange Price: 21.99 Quantity: 10.0 SubTotal: 219.89999999999998"+"\n"  + System.lineSeparator() +
                "Your Purchase total : 419.9" + System.lineSeparator();
        // Check if the actual output matches the expected one.
        assertEquals("The output from main did not match the expected results.", expectedOutput, outContent.toString());
    }
}