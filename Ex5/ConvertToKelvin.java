package Ex5;

public class ConvertToKelvin extends ConvertTemperature {
    public double calculate(double temp) {
        return temp + 273.15;
    }
    @Override
    public String convert(double temp) {
        return super.convert(temp) + " in Fahrenheit";
    }
}
