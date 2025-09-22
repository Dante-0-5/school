package temperaturumrechner_v3;

public class ConverterV3 {
	public static void main (String [] args) {
		ConvertTemp Convert = new ConvertTemp();
		
		System.out.println(Convert.celsius(200.0, "F"));
	}

}
