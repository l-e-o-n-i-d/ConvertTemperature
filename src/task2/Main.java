package task2;

public class Main {
    public static void main(String[] args) {
        ConverterTemperature converterTemperature = new ConverterCelsiusToKelvin();
        System.out.println(converterTemperature.convert(5));
        converterTemperature = new ConverterCelsiusToFahrenheit();
        System.out.println(converterTemperature.convert(12));
    }
}
