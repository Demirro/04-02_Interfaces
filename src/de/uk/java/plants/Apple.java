package de.uk.java.plants;

public class Apple extends Plant implements IEdible {
	private String color;
	private String size;
	
	public Apple(String color, String size) {
		this.color = color;
		this.size = size;
	}
	
	@Override
	public String getEaten() {
		return size + " " + color + " " + this;
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}
}
