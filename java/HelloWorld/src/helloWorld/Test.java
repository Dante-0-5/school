package helloWorld;

public class Test {
	public static void main (String [] args) {
		int[] values = {6000, 3000, 2000, 1000, 7000, 4000, 5000, 9000, 8000, 10000};
		
		int y1 = 0;
		int y2 = 0;
		int y3 = 0;
		int y4 = 0;
		int y5 = 0;
		int y6 = 0;
		int y7 = 0;
		int y8 = 0;
		int y9 = 0;
		int y10 = 0;
		
		int latest = values[9];
		int latest2 = values[9];
		int latest3 = values[9];
		int latest4 = values[9];
		int latest5 = values[9];
		int latest6 = values[9];
		int latest7 = values[9];
		int latest8 = values[9];
		int latest9 = values[9];
		int latest10 = values[9];
		
		int latest_index = 9;
		int latest_index2 = 9;
		int latest_index3 = 9;
		int latest_index4 = 9;
		int latest_index5 = 9;
		int latest_index6 = 9;
		int latest_index7 = 9;
		int latest_index8 = 9;
		int latest_index9 = 9;
		int latest_index10 = 9;
		

		for (int i = 0; i < 10; i++) {
			if (values[y1] > latest) {
				latest = values[y1];
				latest_index = y1;
			}
			y1++;
		}
		
		for (int i = 0; i < 10; i++) {
			if (y2 == latest_index) {
				
			} else if (values[y2] > latest2 && values[y2] < latest) {
				latest2 = values[y2];
				latest_index2 = y2;
			}
			
			y2++;
		}
		
		for (int i = 0; i < 10; i++) {
			if (values[y3] > latest3 && values[y3] < latest2) {
				latest3 = values[y3];
				latest_index3 = y3;
			}
			
			y3++;
		}
		
		
		System.out.println(latest);
		System.out.println(latest_index);
		
		System.out.println(latest2);
		System.out.println(latest_index2);
		
		System.out.println(latest3);
		System.out.println(latest_index3);
		
	}
}
