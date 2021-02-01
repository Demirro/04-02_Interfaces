package de.uk.java.animals;

public class Cat extends DomesticAnimal{

	public Cat(String name) {
		super(name);
	}

	@Override
	public void makeSound() {
		System.out.println("Meow");	
	}

}
