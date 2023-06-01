package task2;

public class ConverterCelsiusToKelvin extends ConverterTemperature {
    public final double K_VALUE = 273.15;

    @Override
    public double convert(double celsius) {
        return celsius + K_VALUE;
    }
}
