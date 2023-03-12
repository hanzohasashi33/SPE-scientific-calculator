import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class OperationsTest {
    // create a new operations object for testing
    Operations operations = new Operations();
    private static final double DELTA = 1e-15;

    @Test
    public void additionTruePositive() {
        assertEquals("Testing for addition", 30.0, operations.addition(10.0, 20.0), DELTA);
        assertEquals("Testing for addition", 50.5, operations.addition(25.5, 25.0), DELTA);
    }

    @Test
    public void additionFalsePositive() {
        assertNotEquals("Testing for false positive addition", 30.0, operations.addition(1.0, 1.0), DELTA);
    }

    @Test
    public void subtractionTruePositive() {
        assertEquals("Testing for subtraction", 10.0, operations.subtraction(20.0, 10.0), DELTA);
        assertEquals("Testing for subtraction", 0.5, operations.subtraction(25.5, 25.0), DELTA);
        assertEquals("Testing for subtraction", -1, operations.subtraction(3,4), DELTA);
    }


    @Test
    public void subtractionFalsePositive() {
        assertNotEquals("Testing for false positive subtraction", 10.0, operations.subtraction(2, 1), DELTA);
    }

    @Test
    public void multiplicationTruePositive() {
        assertEquals("Testing for Multiplication", 200.0, operations.multiplication(20.0, 10.0), DELTA);
        assertEquals("Testing for Multiplication", 637.5, operations.multiplication(25.5, 25.0), DELTA);
        assertEquals("Testing for Multiplication", -12, operations.multiplication(-3,4), DELTA);
        assertEquals("Testing for Multiplication", 12, operations.multiplication(-3,-4), DELTA);
        assertEquals("Testing for Multiplication", -12, operations.multiplication(3,-4), DELTA);
    }

    @Test
    public void divisionTruePositive() {
        assertEquals("Testing for Division", 2, operations.division(20.0, 10.0), DELTA);
        assertEquals("Testing for Division", -2, operations.division(-20.0, 10.0), DELTA);
        assertEquals("Testing for Division", -2, operations.division(20.0, -10.0), DELTA);
        assertEquals("Testing for Division", 2.02, operations.division(20.2, 10.0), DELTA);
    }

    @Test(expected = ArithmeticException.class)
    public void divisionByZero() {
        operations.division(10, 0);
    }

    @Test
    public void squareRootTruePositive() {
        assertEquals("Testing for square root", 10.0, operations.squareRoot(100.0), DELTA);
        assertEquals("Testing for square root", 7.3484692283495345, operations.squareRoot(54.0), DELTA);
        assertEquals("Testing for square root of zero", 0, operations.squareRoot(0), DELTA);
    }

    @Test(expected =  ArithmeticException.class)
    public void negativeNumSquareRoot() {
        operations.squareRoot(-10.0);
    }


    @Test
    public void factorialTruePositive() {
        assertEquals("Testing for factorial", 120, operations.factorial(5), DELTA);
        assertEquals("Testing for factorial", 2, operations.factorial(2), DELTA);
        assertEquals("Testing for factorial", 1, operations.factorial(1), DELTA);
        assertEquals("Testing for factorial", 1, operations.factorial(0), DELTA);
    }

    @Test
    public void factorialFalsePositive() {
        assertNotEquals("Finding factorial of a number for False Positive", 25, operations.factorial(5), DELTA);
        assertNotEquals("Finding factorial of a number for False Positive", 122, operations.factorial(6), DELTA);
    }

    @Test(expected = ArithmeticException.class)
    public void negativeNumFactorial() {
        operations.factorial(-5);
    }


    @Test
    public void naturalLogTruePositive() {
        assertEquals("Testing natural log for True Positive", 2.302585092994046, operations.naturalLog(10), DELTA);
        assertEquals("Testing natural log for True Positive", 0, operations.naturalLog(1), DELTA);
    }

    @Test
    public void NaturalLogFalsePositive(){
        assertNotEquals("Testing natural log for False Positive", 2, operations.naturalLog(15), DELTA);
        assertNotEquals("Testing natural log for False Positive", 4, operations.naturalLog(12.3), DELTA);
    }

    @Test(expected = ArithmeticException.class)
    public void negativeNumNaturalLog() {
        operations.naturalLog(-34);
    }


    @Test(expected = ArithmeticException.class)
    public void zeroNaturalLog() {
        operations.naturalLog(0);
    }


    @Test
    public void logTenTruePositive() {
        assertEquals("Testing log base 10 for True Positive", 1, operations.logBaseTen(10), DELTA);
        assertEquals("Testing log base 10 for True Positive", 0, operations.logBaseTen(1), DELTA);
    }

    @Test
    public void logTenFalsePositive(){
        assertNotEquals("Testing log base 10 for False Positive", 2, operations.logBaseTen(15), DELTA);
        assertNotEquals("Testing log base 10 for False Positive", 4, operations.logBaseTen(12.3), DELTA);
    }

    @Test(expected = ArithmeticException.class)
    public void negativeNumLogTen() {
        operations.logBaseTen(-34);
    }


    @Test(expected = ArithmeticException.class)
    public void zeroLogTen() {
        operations.logBaseTen(0);
    }

    @Test
    public void powerTruePositive(){
        assertEquals("Testing power for True Positive", 32, operations.power(2, 5), DELTA);
        assertEquals("Testing power for True Positive", -91.125, operations.power(-4.5, 3), DELTA);
    }

    @Test
    public void powerFalsePositive(){
        assertNotEquals("Finding power for False Positive", 100, operations.power(2, 3), DELTA);
        assertNotEquals("Finding power for False Positive", 9, operations.power(-3, 4), DELTA);
    }

}
