package temperaturumrechner_v2;

public class ConvertTemp {
	public static double celsius(double value, String unit) {
		if (unit.equalsIgnoreCase("F")) {
			return (value - 32) * (5/9);
		} else if (unit.equalsIgnoreCase("K")) {
			return (value - 273.15);
		}
		return 0.0;
	}
	
	public static double fahrenheit(double value, String unit) {
		if (unit.equalsIgnoreCase("C")) {
			return value * 1.8 + 32;
		} else if (unit.equalsIgnoreCase("K")) {
			return 1.8 * (value - 273.15) + 32;
		}
		return 0.0;
	}
	
	public static double kelvin(double value, String unit) {
		if (unit.equalsIgnoreCase("C")) {
			return value + 273.15;
		} else if (unit.equalsIgnoreCase("F")) {
			return (value - 32) * (5/9) + 273.15;
		}
		return 0.0;
	}

}
