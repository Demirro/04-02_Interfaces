package de.uk.java.Human;

public class Female extends Human {
	/**
	 * Constructor for a Human Female. These 4 things should always be given when a
	 * male is created The parameters are forwarded to the superclass Human
	 * 
	 * @param name
	 * @param age
	 * @param height
	 * @param alive
	 */
	public Female(String name, int age, int height, boolean alive) {
		super(name, age, height, alive);
	}

	/**
	 * Method to create a new Human Male. The new human needs a name, height and it
	 * is necessary to know if the human is alive The age is automatically set to 0
	 * as the new human was just born
	 * 
	 * @param name
	 * @param height
	 * @param alive
	 * @return Male object with the given attributes
	 */
	public Male giveBirthToMale(String name, int height, boolean alive) {
		return new Male(name, 0, height, alive);
	}

	/**
	 * Method to create a new Human Female. The new human needs a name, height and
	 * it is necessary to know if the human is alive The age is automatically set to
	 * 0 as the new human was just born
	 * 
	 * @param name
	 * @param height
	 * @param alive
	 * @return Female object with the given attributes
	 */
	public Female giveBirthToFemale(String name, int height, boolean alive) {
		return new Female(name, 0, height, alive);
	}

	@Override
	public void intercourse() {
		// TODO Auto-generated method stub

	}
}
