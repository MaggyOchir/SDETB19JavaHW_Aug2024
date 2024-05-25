package e173abstractclasstest;

import org.example.e173.E173AbstractClass;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E173AbstractClassTest {
    @Test
    public void testLemonChaiTea() {
        // Redirect System.out to capture the output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        E173AbstractClass.main(new String[]{});
        // Call the method
        //Tea lemon = new LemonTea("Lemon Tea");
       // lemon.addSugar();

        // Restore original System.out and get the captured output
        System.setOut(System.out);
        String expectedOutput = "For Lemon Tea we need 2 spoons of sugar\n" +
                "For Chai Tea we need 1 spoon of sugar\n";
        assertEquals(expectedOutput, outputStream.toString().replace("\r\n", "\n"));
    }


}
