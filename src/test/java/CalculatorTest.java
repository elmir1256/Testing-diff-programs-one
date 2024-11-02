import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CalculatorTest {
    @Test
    public void testAdd(){
        Calculator calculator = new Calculator();
        int result = calculator.add(3, 5);
        Assertions.assertEquals(8, result);
    }
}
