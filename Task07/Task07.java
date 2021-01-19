public class Task07 {
    public static void main (String[] args) {
       System.out.println(celsiusToFahrenheit(31.00));
       System.out.println(fahrenheitToCelsius(90.00));
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
