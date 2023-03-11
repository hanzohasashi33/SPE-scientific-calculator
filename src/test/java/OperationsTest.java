import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OperationsTest {
    // create a new operations object for testing
    Operations operations = new Operations();
    private static final double DELTA = 1e-15;

    @Test
    public void testingAddition() {
        assertEquals("Testing for addition", 30.0, operations.addition(10.0, 20.0), DELTA);
        assertEquals("Testing for addition", 50.5, operations.addition(25.5, 25.0), DELTA);
    }

    @Test
    public void testingSubtraction() {
        assertEquals("Testing for subtraction", 10.0, operations.subtraction(20.0, 10.0), DELTA);
        assertEquals("Testing for subtraction", 0.5, operations.subtraction(25.5, 25.0), DELTA);
        assertEquals("Testing for subtraction", -1, operations.subtraction(3,4), DELTA);
    }

    @Test
    public void testingMultiplication() {
        assertEquals("Testing for Multiplication", 200.0, operations.multiplication(20.0, 10.0), DELTA);
        assertEquals("Testing for Multiplication", 637.5, operations.multiplication(25.5, 25.0), DELTA);
        assertEquals("Testing for Multiplication", -12, operations.multiplication(-3,4), DELTA);
        assertEquals("Testing for Multiplication", 12, operations.multiplication(-3,-4), DELTA);
        assertEquals("Testing for Multiplication", -12, operations.multiplication(3,-4), DELTA);
    }

    @Test
    public void testingDivision() {
        assertEquals("Testing for Division", 2, operations.division(20.0, 10.0), DELTA);
        assertEquals("Testing for Division", -2, operations.division(-20.0, 10.0), DELTA);
        assertEquals("Testing for Division", -2, operations.division(20.0, -10.0), DELTA);
        assertEquals("Testing for Division", 2.02, operations.division(20.2, 10.0), DELTA);
    }

    @Test(expected = ArithmeticException.class)
    public void testingDivisionByZero() {
        operations.division(10, 0);
    }

    @Test
    public void squareRootTesting() {
        assertEquals("Testing for square root", 10.0, operations.squareRoot(100.0), DELTA);
        assertEquals("Testing for square root", 7.3484, operations.squareRoot(54.0), DELTA);
    }

}
