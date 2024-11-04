public class TemperatureConverter {
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public double fahrenheitToCelsius(double fahrenheit) {
        return  Math.floor(((fahrenheit - 32) * 5/9) * 100) / 100;
    }
}
