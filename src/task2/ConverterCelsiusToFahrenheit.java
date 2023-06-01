package task2;

public class ConverterCelsiusToFahrenheit extends ConverterTemperature {
    public final double F_VALUE = 32;

    @Override
   public double convert(double celsius) {
        return ( celsius  * 9 / 5) + F_VALUE;
    }
}
