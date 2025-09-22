package temperaturumrechner_v2;

import java.util.Scanner;

public class ConverterV2 {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Temperature unit converter v.2. Enter unit to be converted from: (C/F/K)");
		String unit = scan.next();
		
		System.out.println("Enter value to be converted:");
		double value = scan.nextDouble();
		
		if (unit.equalsIgnoreCase("C")) {
			System.out.println(value + " °C in °F: " + ConvertTemp.fahrenheit(value, unit));
			System.out.println(value + " °C in K: " + ConvertTemp.kelvin(value, unit));
			
		} else if (unit.equalsIgnoreCase("F")) {
			System.out.println(value + " °F in °C: " + ConvertTemp.celsius(value, unit));
			System.out.println(value + " °F in K: " + ConvertTemp.kelvin(value, unit));
			
		} else if (unit.equalsIgnoreCase("K")) {
			System.out.println(value + " K in °C: " + ConvertTemp.celsius(value, unit));
			System.out.println(value + " K in °F: " + ConvertTemp.fahrenheit(value, unit));
			
		} else {
			System.out.println("No unit match! Enter C for °Celsius, F for °Fahrenheit, or K for Kelvin.");
		}
		
		scan.close();
	}

}
