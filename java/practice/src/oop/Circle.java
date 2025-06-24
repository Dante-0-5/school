package oop;

import java.lang.Math;

public class Circle {
	private double radius;
	
	public Circle() {
		this.radius = 0;
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double calcArea() {
		return (radius * radius * Math.PI);
	}
	
	public double calcCircumference() {
		return (2 * radius * Math.PI);
	}
	
	public static void main(String[] args) {
		Circle circle = new Circle(43);
		
		System.out.println("Area: " + circle.calcArea());
		System.out.println("Circumference: " + circle.calcCircumference());
	}
}
