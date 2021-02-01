package de.uk.java.animals;

public abstract class DomesticAnimal extends Animal{

	private String name;
	
	public DomesticAnimal(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
