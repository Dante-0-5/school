package oop;

public class TrafficLight {
	private String color;
	private float duration;
	
	TrafficLight() {
		this.color = "red";
		this.duration = 10;
	}
	
	public void changeColor(String color, float duration) {
		this.color = color;
		this.duration = duration;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public float getDuration() {
		return this.duration;
	}
	
	public static void main(String[] args) {
		TrafficLight trafficlight = new TrafficLight();
		
		trafficlight.changeColor("yellow", 40);
		
		System.out.println(trafficlight.getColor() + "\n" + trafficlight.getDuration());
	}

}
