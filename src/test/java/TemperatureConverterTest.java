import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TemperatureConverterTest {
    TemperatureConverter temperatureConverter = new TemperatureConverter();

    @Test
    public void convertFahrenheitToCalcium(){
        double result = temperatureConverter.fahrenheitToCelsius(89);
        Assertions.assertEquals(31.66, result);
    }

    @Test
    public void convertCalciumToFahrenheit(){
        double result = temperatureConverter.celsiusToFahrenheit(22);
        Assertions.assertEquals(71.6, result);
    }
}
