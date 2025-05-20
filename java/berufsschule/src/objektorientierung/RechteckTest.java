package objektorientierung;

public class RechteckTest {
	public static void main (String [] args) {
		Rechteck rechteck1 = new Rechteck();
		
		rechteck1.laenge = 20;
		rechteck1.breite = 10;
		
		System.out.println(rechteck1.flaeche_berechnen());
	}

}
