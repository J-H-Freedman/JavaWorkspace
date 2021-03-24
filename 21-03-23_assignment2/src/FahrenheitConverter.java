import java.text.DecimalFormat;
import java.util.Scanner;
import java.text.DateFormat;

/**
 * Convert from fahrenheit to celsius and Kelvin
 */
public class FahrenheitConverter {
    double fahrenheit;
    static DecimalFormat TWO_PLACES = new DecimalFormat("##0.##");

    /**
     * access Fahrenheit
     * @return the current fahrenheit value
     */
    public double getFahrenheit() {
        return fahrenheit;
    }

    /**
     * mutate fahrenheit to a new value
     * @param fahrenheit the new fahrenheit temperature
     */
    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    /**
     * Constructor for temperature in Fahrenheit
     * @param initialTemp the temperature in fahrenheit you wish to convert
     */
    public FahrenheitConverter(double initialTemp) {
        setFahrenheit(initialTemp);
    }
    /**
     * Default value for Fahrenheit is 0
     */
    public FahrenheitConverter() {
        setFahrenheit(0);
    }

    /**
     * Convert from the fahrenheit value to celsius
     * @return returns the celsius value
     */
    public double celsius() {
        return ((5.0/9.0) * (getFahrenheit() - 32) );
    }

    /**
     * Convert from the fahrenheit value to kelvin
     * @return returns the kelvin value
     */
    public double kelvin() {
        return (celsius() + 273);
    }


    private static void testMethods() {
        //test if constructor works
        FahrenheitConverter test100 = new FahrenheitConverter(100);
        FahrenheitConverter testDefault = new FahrenheitConverter();
        System.out.println(testDefault.getFahrenheit() + "=0 and " + test100.getFahrenheit() + "=100");

        //test if celsius and kelvin work
        System.out.println("0f is " + TWO_PLACES.format(testDefault.celsius()) + "C and " +
                TWO_PLACES.format(testDefault.kelvin()) + "K");
        System.out.println("100F is " + TWO_PLACES.format(test100.celsius()) + "C and " +
                TWO_PLACES.format(test100.kelvin()) + "K");
    }

    public static void main(String[] args) {
        // test functionality
        // //testMethods();

        Scanner keyboard = new Scanner(System.in);

        // acquire input for your city
        System.out.println("Enter the temperature in fahrenheit for your city:");
        FahrenheitConverter cityTemperature = new FahrenheitConverter(keyboard.nextDouble());
        // calculate
        System.out.println(TWO_PLACES.format(cityTemperature.getFahrenheit()) + " Fahrenheit is equal to " +
                TWO_PLACES.format(cityTemperature.celsius())+ " Celsius.");
        System.out.println(TWO_PLACES.format(cityTemperature.getFahrenheit()) + " Fahrenheit is equal to " +
                TWO_PLACES.format(cityTemperature.kelvin())+ " Kelvin.");

        // acquire input for destination
        System.out.println("\nEnter the temperature in fahrenheit for the city you will go:");
        FahrenheitConverter destinationTemperature = new FahrenheitConverter(keyboard.nextDouble());
        // calculate
        System.out.println(TWO_PLACES.format(destinationTemperature.getFahrenheit()) + " Fahrenheit is equal to " +
                TWO_PLACES.format(destinationTemperature.celsius())+ " Celsius.");
        System.out.println(TWO_PLACES.format(destinationTemperature.getFahrenheit()) + " Fahrenheit is equal to " +
                TWO_PLACES.format(destinationTemperature.kelvin())+ " Kelvin.");
        //terminate
        System.out.println("\nProgram is finished! Thank you!");


    }
}
