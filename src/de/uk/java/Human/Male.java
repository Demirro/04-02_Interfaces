package de.uk.java.Human;

public class Male extends Human {

	/**
	 * Constructor for a Human Male. These 4 things should always be given when a
	 * male is created The parameters are forwarded to the superclass Human
	 * 
	 * @param name
	 * @param age
	 * @param height
	 * @param alive
	 */
	public Male(String name, int age, int height, boolean alive) {
		super(name, age, height, alive);
	}

	/**
	 * A Male is capable of peeing while being in an upright/standing position
	 * simply outputs a sentence in the console
	 */
	public void peeStandingUp() {
		System.out.println(this.getName() + " is peeing whilst standing. Cool stuff.");
	}

	@Override
	public String toString() {

		return (super.toString() + " This is a male human");
	}

	@Override
	public void intercourse() {
		// TODO Auto-generated method stub

	}
}
