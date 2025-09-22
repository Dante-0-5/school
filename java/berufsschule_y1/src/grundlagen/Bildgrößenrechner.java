package grundlagen;

import java.util.Scanner;

public class Bildgrößenrechner {
	public static void main (String [] args) {
		 Scanner scan = new Scanner (System.in);
		 
		 System.out.println("Enter image height:");
		 int height = scan.nextInt();
		 System.out.println("Enter image width:");
		 int width = scan.nextInt();
		 
		 double fileSize = (((height*width) * 24.0 + 432.0)/8)/1024;
		 
		 System.out.println("Image file size: " + fileSize);
	}

}
