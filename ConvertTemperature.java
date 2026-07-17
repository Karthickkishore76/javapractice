public class ConvertTemperature {
    public static double[] convertTemperature(double celsius) {
        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 1.80 + 32.00;
        return new double[]{kelvin, fahrenheit};
    }
    public static void main(String[] args) {
        double[] result = convertTemperature(36.5);
        System.out.println("Kelvin: " + result[0] + ", Fahrenheit: " + result[1]);
    }
}
