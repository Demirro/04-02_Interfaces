package de.uk.java.Human;

import de.uk.java.plants.IEdible;

public abstract class Human {

	/*
	 * Instanzvariablen Eigenschaften die jeder Mensch hat
	 */
	private int age;
	private int height;
	private int weight;
	private boolean alive;
	private String name;

	/**
	 * Constructor für die Klasse Human. Diese Eigenschaft müssen immer da sein,
	 * wenn ein Mensch instanziiert wird
	 * 
	 * @param name
	 * @param age
	 * @param height
	 * @param alive
	 */
	public Human(String name, int age, int height, boolean alive) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.alive = alive;
	}

	/**
	 * Humans can eat with this method. Though they can only eat things that are
	 * classified as edible Edible things have to implement the interface IEdible
	 * Gives out a message about what has just been eaten with the use of an
	 * interface method ----- Menschen können mit dieser Methode essen Sie können
	 * allerdings nur Sachen essen, die auch als essbar eingestuft werden Essbar
	 * sind nur Sachen, die das Interface IEdible implementieren Gibt eine Nachricht
	 * über das aus, was gerade gegessen wurde
	 * 
	 * @param edible Object that implements the interface IEdible
	 */
	public void eat(IEdible edible) {
		System.out.println(getName() + " eats a " + edible.getEaten());
	}

	public abstract void intercourse();

	/*
	 * Ab hier werden die Methoden (Fähigkeiten) erstellt, die jeder Mensch haben
	 * soll
	 */

	/**
	 * Empty method. Should generate a random sentence to be returned or output
	 * 
	 * @return a sentence as a String
	 */
	public String talk() {
		return null;
	}

	/**
	 * Walking Method. Simply outputs a sentences containing the name of the
	 * currently walking human in the console
	 */
	public void walk() {
		System.out.println(name + " walked a few steps.");
	}

	/**
	 * Makes a human sleep for the give amount of hours. Only outputs a sentence in
	 * the console
	 * 
	 * @param hours Integer. Number of hours to be slept
	 */
	public void sleep(int hours) {
		System.out.println(name + " slept for " + hours + " hours.");
	}

	/**
	 * Makes a human think. Currently only returns one sentence ("cognito ergo
	 * sum"). Should work like talk = return a sentence chosen/generated randomly
	 * 
	 * @return thought sentence as a String
	 */
	public String think() {
		return "cognito ergo sum";
	}

	@Override
	public String toString() {
		return ("This Human is called " + getName() + " and is " + getAge() + " years old.");
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Human) {
			Human humanObj = (Human) obj;
			if (humanObj.getName().equals(this.getName()) && humanObj.getAge() == this.getAge()) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	/*
	 * Getter and Setter
	 */

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
