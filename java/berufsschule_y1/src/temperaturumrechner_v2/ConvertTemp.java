package temperaturumrechner_v2;

public class ConvertTemp {
	public static double celsius(double value, String unit) {
		if (unit.equalsIgnoreCase("F")) {
			return (value - 32) / 1.8;
		} else if (unit.equalsIgnoreCase("K")) {
			return (value - 273.15);
		} else {
			return 0.0;
		}
	}
	
	public static double fahrenheit(double value, String unit) {
		if (unit.equalsIgnoreCase("C")) {
			return value * 1.8 + 32;
		} else if (unit.equalsIgnoreCase("K")) {
			return 1.8 * (value - 273.15) + 32;
		} else {
			return 0.0;
		}
	}
	
	public static double kelvin(double value, String unit) {
		if (unit.equalsIgnoreCase("C")) {
			return value + 273.15;
		} else if (unit.equalsIgnoreCase("F")) {
			return (value - 32) / 1.8 + 273.15;
		} else {
			return 0.0;
		}
	}

}
