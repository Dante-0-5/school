package downloadTimeCalc;

import java.util.Scanner;
import java.lang.Math;

public class DownloadTimeCalc {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter total file size in MB:");
		float fileSizeTotal = scan.nextFloat();
		
		System.out.println("Enter current download progress in MB: (Enter 0 if not started)");
		float progress = scan.nextFloat();
		
		System.out.println("Enter average download speed in MB/s:");
		float speed = scan.nextFloat();
		
		int timeRemaining =  Math.round((fileSizeTotal - progress) / speed);
		
		int seconds = timeRemaining % 60;
		int minutes1 = timeRemaining / 60;
		int minutes2 = minutes1 % 60;
		int hours = minutes1 / 60;
		
		System.out.println("Time remaining: (HR:MN:S)\n" + hours + ":" + minutes2 + ":" + seconds);
	}

}
