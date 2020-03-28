package otherHomework;

import java.util.Scanner;

public class TemperatureConversion {

    public static void main(String[] args) {

        //Initiation
        Scanner input = new Scanner(System.in);
        System.out.println("Is the input in Fahrienheit or Celsius");
        System.out.println("Type <Fahreinheit> or <Celsius>");
        String temperatureType = input.next();

        //Condition
        if(temperatureType.equals("Fahrienheit")) {
            System.out.println("Type your Fahreinheit Value: ");
            double fahreinheitValue = input.nextDouble();

            double finalValue = FahreinheitToCelsius(fahreinheitValue);
            System.out.println("Here is the Celsius Value");
            System.out.println(finalValue);

        } else if(temperatureType.equals("Celsius")) {
            System.out.println("Type your Celsius Value: ");
            double celsiusValue = input.nextDouble();

            double finalValue = CelsiusToFahreinheit(celsiusValue);
            System.out.println("Here is the Fahrienheit Value");
            System.out.println(finalValue);

        } else {
            System.out.println("Unknown Variable");
            System.out.println("Please rerun the value");
        }
    }

    //Celsius to Fahrienheit Conversion
    public static double CelsiusToFahreinheit(double celsiusValue) {
        double fahreinheitValue = 0.00;
        fahreinheitValue = celsiusValue*(5/9.00)+32;
        return fahreinheitValue;
    }

    //Fahrienheit to Celsius Conversion
    public static double FahreinheitToCelsius(double fahrienheitValue) {
        double celsiusValue = 0.00;
        celsiusValue = (fahrienheitValue-32)+(9.00/5);
        return celsiusValue;
    }
}
