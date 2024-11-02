import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CalculatorTest {
    Calculator calculator = new Calculator();
    @Test
    public void testAdd(){
        int result = calculator.add(3, 5);
        Assertions.assertEquals(8, result);
    }

    @Test
    public void testSubtract(){
        int result = calculator.subtract(10, 4);
        Assertions.assertEquals(6, result);
    }

    @Test
    public void testMultiply(){
        int result = calculator.multiply(20, 3);
        Assertions.assertEquals(60, result);
    }

    @Test
    public void testDivide(){
        double result = calculator.divide(6, 3);
        Assertions.assertEquals(2, result);
    }

    @Test
    public void testDivideZero(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.divide(3, 0));
    }
}
