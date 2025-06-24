package oop;

public class Rectangle {
	private double width;
	private double length;
	
	Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}
	
	public double calcArea() {
		return (this.width * this.length);
	}
	
	public double calcCircumference() {
		return (2 * this.width + 2 * this.length);
	}
	
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(12, 22);
		
		System.out.println("Area: " + rectangle.calcArea());
		System.out.println("Circumference: " + rectangle.calcCircumference());
		
	}

}
