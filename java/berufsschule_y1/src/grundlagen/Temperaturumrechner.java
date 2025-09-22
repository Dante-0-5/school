package grundlagen;

import java.util.Scanner;
import java.lang.Math;

public class Temperaturumrechner {
	public static void main (String [] args) {
		
		Scanner scanString = new Scanner(System.in);
		Scanner scanDouble = new Scanner(System.in);
		
		System.out.println("Temperature unit converter v.1.0. Input the unit of your value (C/F/K). Enter any other letter to exit.");
		String unit = scanString.next();
		
		System.out.println("Enter your value:");
		double value = scanDouble.nextDouble();
		
		if (unit.equalsIgnoreCase("C")) {
			double valueFahrenheit = value * 1.8 + 32;
			double valueKelvin = value + 273.15;
			
			System.out.println("Your value: "+ value + "°C");
			System.out.println("Value in °F: " + valueFahrenheit + "°F");
			System.out.println("Value in K: " + valueKelvin + "K");
			
		} else if (unit.equalsIgnoreCase("F")) {
			double valueCelsius = (value - 32) / 1.8;
			double valueKelvin = valueCelsius + 273.15;
			
			System.out.println("Your value: " + value + "°F");
			System.out.println("Value in °C: " + valueCelsius + "°C");
			System.out.println("Value in Kelvin: " + valueKelvin + "K");
			
		} else if (unit.equalsIgnoreCase("K")) {
			double valueCelsius = value - 273.15;
			double valueFahrenheit = valueCelsius * 1.8 + 32;
			
			System.out.println("Your value: " + value + "K");
			System.out.println("Value in °C: " + valueCelsius + "°C");
			System.out.println("Value in °F: " + valueFahrenheit + "°F");
			
		} else {
			
		}
	}

}
