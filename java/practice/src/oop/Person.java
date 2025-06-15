package oop;

public class Person {
	private String name;
	private int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	private String getName() {
		return this.name;
	}
	
	private int getAge() {
		return this.age;
	}
	
	public static void main(String[] args) {
		Person dude = new Person("Jack", 22);
		Person dudette = new Person("Jill", 23);
		
		System.out.printf("This is %s. He is %d years old.%n", dude.getName(), dude.getAge());
		System.out.printf("This is %s. She is %d years old.", dudette.getName(), dudette.getAge());

		
	}

}
