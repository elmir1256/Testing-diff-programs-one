import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactorialCalculatorTest {
    FactorialCalculator factorialCalculator = new FactorialCalculator();

    @Test
    public void factorialNormalNumberTest(){
        int result = factorialCalculator.factorial(7);
        Assertions.assertEquals(5040, result);
    }

    @Test
    public void factorialLessThanZeroNumberTest(){
        Assertions.assertThrows(IllegalArgumentException.class, ()-> factorialCalculator.factorial(-4));
    }
}
