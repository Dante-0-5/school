package oop;

public class Dog {
	String name;
	String breed;
	
	Dog(String name, String breed) {
		this.name = name;
		this.breed = breed;
	}
	
	private void setName(String name) {
		this.name = name;
	}
	
	private void setBreed(String breed) {
		this.breed = breed;
	}
	
	private String getName() {
		return this.name;
	}
	
	private String getBreed() {
		return this.breed;
	}
	
	public static void main(String[] args) {
		Dog dog1 = new Dog("Harald", "Chihuahua");
		Dog dog2 = new Dog("Sherry", "Corgi");
		
		System.out.println(dog1.getName() + ", " + dog1.getBreed());
		System.out.println(dog2.getName() + ", " + dog2.getBreed());
		
		dog1.setName("Ludwig");
		dog1.setBreed("Dachshund");
		
		dog2.setName("Henrietta");
		dog2.setBreed("Greyhound");
		
		System.out.println(dog1.getName() + ", " + dog1.getBreed());
		System.out.println(dog2.getName() + ", " + dog2.getBreed());
	}


}
