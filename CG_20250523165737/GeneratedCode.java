// Disclaimer: This output contains AI-generated content; user is advised to review it before consumption.
//*Start of AI Generated Content*

java
// AdditionProgram.java

// Imports
import java.util.InputMismatchException;
import java.util.Scanner;

// Constants
public class AdditionProgram {
    private static final String PROGRAM_NAME = "Simple Addition Program";
    private static final String PROMPT_NUM1 = "Enter the first number: ";
    private static final String PROMPT_NUM2 = "Enter the second number: ";
    private static final String RESULT_MESSAGE = "The sum is: ";
    private static final String ERROR_MESSAGE = "An error occurred. Please try again.";

    // Main Function
    public static void main(String[] args) {
        try {
            AdditionProgram program = new AdditionProgram();
            program.runProgram();
        } catch (Exception e) {
            System.err.println(ERROR_MESSAGE);
            System.err.println("Error Details: " + e.getMessage());
        }
    }

    // Run Program
    private void runProgram() throws Exception {
        Scanner scanner = new Scanner(System.in);
        double num1 = getNumberInput(scanner, PROMPT_NUM1);
        double num2 = getNumberInput(scanner, PROMPT_NUM2);
        double result = addNumbers(num1, num2);
        displayResult(result, RESULT_MESSAGE);
    }

    // Get Number Input
    /**
     * Retrieves a numeric input from the user.
     * 
     * @param scanner Scanner object for input
     * @param prompt  Message to display for input
     * @return User's numeric input
     * @throws InputMismatchException if input is not a number
     */
    private double getNumberInput(Scanner scanner, String prompt) throws InputMismatchException {
        while (true) {
            try {
                System.out.print(prompt);
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.err.println("Invalid input. Please enter a number.");
                scanner.next(); // Clear invalid input
            }
        }
    }

    // Add Numbers
    /**
     * Calculates the sum of two numbers.
     * 
     * @param num1 First number
     * @param num2 Second number
     * @return Sum of num1 and num2
     */
    private double addNumbers(double num1, double num2) {
        return num1 + num2;
    }

    // Display Result
    /**
     * Prints the result of the addition.
     * 
     * @param result    Sum of the two numbers
     * @param message   Message to display before the result
     */
    private void displayResult(double result, String message) {
        System.out.println(message + result);
    }
}


//*End of AI Generated Content*