package Ex5;

import org.w3c.dom.ls.LSOutput;

public class convertToFahrenheit extends ConvertTemperature {
    @Override
    public double calculate(double temp) {
        return temp * 9 / 5 + 32;
    }
    @Override
    public String convert(double temp) {
        return super.convert(temp) + " in Fahrenheit";
    }
}
