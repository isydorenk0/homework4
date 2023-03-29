package Ex5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        convertToFahrenheit fahrenheit = new convertToFahrenheit();
        ConvertToKelvin kelvin = new ConvertToKelvin();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature in Celsius: ");
        Double temperature = 0.0;
        try {
            temperature = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Wrong value");
        }
        System.out.println(fahrenheit.convert(temperature));
        System.out.println(kelvin.convert(temperature));
    }
}
