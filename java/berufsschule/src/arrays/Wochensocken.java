package arrays;

public class Wochensocken {
	public static void main (String [] args) {
		String[] schrank = new String[7];
		
		schrank[0] = "rote Socken";
		schrank[1] = "grüne Socken";
		schrank[2] = "blaue Socken";
		schrank[3] = "graue Socken";
		schrank[4] = "pinke Socken";
		schrank[5] = "schwarze Socken";
		schrank[6] = "weiße Socken";
		
		System.out.println("Am Montag werden " + schrank[0] + " getragen.");
		System.out.println("Am Dienstag werden " + schrank[1] + " getragen.");
		System.out.println("Am Mittwoch werden " + schrank[2] + " getragen.");
		System.out.println("Am Donnerstag werden " + schrank[3] + " getragen.");
		System.out.println("Am Freitag werden " + schrank[4] + " getragen.");
		System.out.println("Am Samstag werden " + schrank[5] + " getragen.");
		System.out.println("Am Sonntag werden " + schrank[6] + " getragen.");
	}

}
