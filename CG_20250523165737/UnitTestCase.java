// Disclaimer: This output contains AI-generated content; user is advised to review it before consumption.
//*Start of AI Generated Content*

java
// AdditionProgramTest.java

java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AdditionProgramTest {

    /**
     * Test case: Successful addition of two positive numbers.
     * 
     * @throws Exception if an error occurs during the test
     */
    @Test
    public void testAddNumbers_Success_PositiveNumbers() throws Exception {
        // Arrange
        String input = "10.5\n20.8";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setIn(in);
        System.setOut(new PrintStream(out));
        
        // Act
        AdditionProgram program = new AdditionProgram();
        program.runProgram();
        
        // Assert
        String[] outputLines = out.toString().split("\n");
        String resultLine = outputLines[outputLines.length - 1]; // Last line contains the result
        double expectedResult = 10.5 + 20.8;
        assertTrue(resultLine.contains(String.valueOf(expectedResult)));
    }

    /**
     * Test case: Successful addition of two negative numbers.
     * 
     * @throws Exception if an error occurs during the test
     */
    @Test
    public void testAddNumbers_Success_NegativeNumbers() throws Exception {
        // Arrange
        String input = "-10.5\n-20.8";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setIn(in);
        System.setOut(new PrintStream(out));
        
        // Act
        AdditionProgram program = new AdditionProgram();
        program.runProgram();
        
        // Assert
        String[] outputLines = out.toString().split("\n");
        String resultLine = outputLines[outputLines.length - 1]; // Last line contains the result
        double expectedResult = -10.5 + (-20.8);
        assertTrue(resultLine.contains(String.valueOf(expectedResult)));
    }

    /**
     * Test case: Successful addition of one positive and one negative number.
     * 
     * @throws Exception if an error occurs during the test
     */
    @Test
    public void testAddNumbers_Success_MixedSignNumbers() throws Exception {
        // Arrange
        String input = "10.5\n-20.8";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setIn(in);
        System.setOut(new PrintStream(out));
        
        // Act
        AdditionProgram program = new AdditionProgram();
        program.runProgram();
        
        // Assert
        String[] outputLines = out.toString().split("\n");
        String resultLine = outputLines[outputLines.length - 1]; // Last line contains the result
        double expectedResult = 10.5 + (-20.8);
        assertTrue(resultLine.contains(String.valueOf(expectedResult)));
    }

    /**
     * Test case: InputMismatchException handling for non-numeric input.
     * 
     * @throws Exception if an error occurs during the test
     */
    @Test
    public void testGetNumberInput_InputMismatchException_NonNumericInput() {
        // Arrange
        String input = "abc\n10.5";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        
        // Act and Assert
        try {
            AdditionProgram program = new AdditionProgram();
            program.getNumberInput(new Scanner(System.in), AdditionProgram.PROMPT_NUM1);
            fail("Expected InputMismatchException for non-numeric input");
        } catch (InputMismatchException e) {
            // Expected
        }
    }

    /**
     * Test case: Edge case - Addition of two zeros.
     * 
     * @throws Exception if an error occurs during the test
     */
    @Test
    public void testAddNumbers_EdgeCase_AdditionOfTwoZeros() throws Exception {
        // Arrange
        String input = "0\n0";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setIn(in);
        System.setOut(new PrintStream(out));
        
        // Act
        AdditionProgram program = new AdditionProgram();
        program.runProgram();
        
        // Assert
        String[] outputLines = out.toString().split("\n");
        String resultLine = outputLines[outputLines.length - 1]; // Last line contains the result
        double expectedResult = 0 + 0;
        assertTrue(resultLine.contains(String.valueOf(expectedResult)));
    }
}


//*End of AI Generated Content*