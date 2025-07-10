package farm;

import java.lang.Math;

public class Hen extends Chicken {
	Hen(double weight, Feather[] plumage) {
		this.weight = weight;
		this.plumage = plumage;
	}
	
	public int layEgg() {
		return (int) (Math.random() * 5) + 1;
	}

}
