public class CtoFTester {
  public static void main (String [] args) {
    System.out.println(celsiusToFahrenheit(100));
    System.out.println(fahrenheitToCelsius(212));
  }
  public static double celsiusToFahrenheit(double celsius) {
    return (celsius * 9/5 + 32);
  }
  public static double fahrenheitToCelsius(double fahrenheit) {
    return ((fahrenheit - 32) * 5/9);
  }
}
