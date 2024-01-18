package SD;
import java.util.Scanner;

public class task_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the temperature value:");
        double temperature = scanner.nextDouble();

        System.out.println("Enter the unit of measurement (Celsius, Fahrenheit, or Kelvin):");
        String originalUnit = scanner.next().toLowerCase();

        switch (originalUnit) {
            case "celsius":
                convertCelsius(temperature);
                break;
            case "fahrenheit":
                convertFahrenheit(temperature);
                break;
            case "kelvin":
                convertKelvin(temperature);
                break;
            default:
                System.out.println("Invalid unit of measurement. Please enter Celsius, Fahrenheit, or Kelvin.");
        }
        scanner.close();
    }

    public static void convertCelsius(double celsius) {
        double fahrenheit = celsius * 9 / 5 + 32;
        double kelvin = celsius + 273.15;

        System.out.println(celsius + " Celsius = " + fahrenheit + " Fahrenheit");
        System.out.println(celsius + " Celsius = " + kelvin + " Kelvin");
    }
    public static void convertFahrenheit(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        double kelvin = (fahrenheit + 459.67) * 5 / 9;

        System.out.println(fahrenheit + " Fahrenheit = " + celsius + " Celsius");
        System.out.println(fahrenheit + " Fahrenheit = " + kelvin + " Kelvin");
    }
    public static void convertKelvin(double kelvin) {
        double celsius = kelvin - 273.15;
        double fahrenheit = kelvin * 9 / 5 - 459.67;

        System.out.println(kelvin + " Kelvin = " + celsius + " Celsius");
        System.out.println(kelvin + " Kelvin = " + fahrenheit + " Fahrenheit");
    }
}
