package Ex5;

public abstract class ConvertTemperature implements IConvertTemperature{

    public String convert(double temp) {
        return "Celsius " + temp + " is " + this.calculate(temp);
    }
    public abstract double calculate(double temp);
}
