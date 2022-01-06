import calculator.Calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class CalculatorTest {

    private Calculator mockCalculator() {
        Scanner mockScanner = mock(Scanner.class);

        when(mockScanner.nextInt()).thenReturn(5, 4);

        return new Calculator(mockScanner);
    }

    @Test
    @DisplayName("Addition Test")
    void addNumbers() {

        Calculator calculator = mockCalculator();

        Assertions.assertEquals(9, calculator.addNumbers());
    }

    @Test
    @DisplayName("Subtraction Test")
    void subtractNumbers() {

        Calculator calculator = mockCalculator();

        Assertions.assertEquals(1, calculator.subtractNumbers());
    }

    @Test
    @DisplayName("Multiplication Test")
    void multiplyNumbers() {

        Calculator calculator = mockCalculator();

        Assertions.assertEquals(20, calculator.multiplyNumbers());
    }

    @Test
    @DisplayName("Division Test")
    void divideNumbers() {

        Calculator calculator = mockCalculator();

        Assertions.assertEquals(1, calculator.divideNumbers());
    }

}
