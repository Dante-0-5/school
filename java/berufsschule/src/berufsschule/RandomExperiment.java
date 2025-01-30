package berufsschule;

import java.util.Random;

public class RandomExperiment {
	public static void main(String[] args) {
		Random random = new Random();
		
		//Outputs a number between 1 and 100
		int test = random.nextInt(100) + 1;
	}

}
