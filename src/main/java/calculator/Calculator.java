package calculator;

import java.util.Scanner;

public class Calculator {

    public static final String ANSWER_STRING = "Your Answer Is : ";
    private static final String FIRST_NUMBER = "Enter First Number";
    private static final String SECOND_NUMBER = "Enter Second Number";

    private final Scanner scanner;

    public Calculator() {

        this(new Scanner(System.in));
    }

    public Calculator(Scanner scanner) {

        this.scanner  = scanner;
    }

    public static void main(String[] args) {

        Calculator calculator =  new Calculator();

        calculator.outputString("Hello, which operation do you want to perform?");
        System.out.println();

        calculator.outputString("1. Addition");
        calculator.outputString("2. subtraction");
        calculator.outputString("3. Multiplication");
        calculator.outputString("4. Division");

        System.out.println();

        int choice = calculator.getInputtedNumber("Enter choice e.g 1, 2 3, or 4");

        if (choice == 1) {

            int result = calculator.addNumbers();
            calculator.outputString(ANSWER_STRING + result);

        } else if (choice == 2) {

            int result = calculator.subtractNumbers();
            calculator.outputString(ANSWER_STRING+ result);

        } else if (choice == 3) {

            int result = calculator.multiplyNumbers();
            calculator.outputString(ANSWER_STRING+ result);

        } else {

            int result = calculator.divideNumbers();
            calculator.outputString(ANSWER_STRING + result);
        }

    }

    public int addNumbers() {
        int a = getInputtedNumber(FIRST_NUMBER);
        int b = getInputtedNumber(SECOND_NUMBER);

        return a + b;
    }

    public int subtractNumbers() {
        int a = getInputtedNumber(FIRST_NUMBER);
        int b = getInputtedNumber(SECOND_NUMBER);

        return a - b;
    }

    public int multiplyNumbers() {
        int a = getInputtedNumber(FIRST_NUMBER);
        int b = getInputtedNumber(SECOND_NUMBER);

        return a * b;
    }

    public int divideNumbers() {
        int a = getInputtedNumber(FIRST_NUMBER);
        int b = getInputtedNumber(SECOND_NUMBER);

        if (b == 0) {
            outputString("Enter a denominator greater than zero");
            return 0;
        }

        return a / b;
    }

    private int getInputtedNumber(String input) {
        outputString(input);
        return scanner.nextInt();
    }

    private void outputString(String value) {
        System.out.println(value);
    }

}
