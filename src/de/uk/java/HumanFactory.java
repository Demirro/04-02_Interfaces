package de.uk.java;

import de.uk.java.Human.*;
import de.uk.java.plants.*;

public class HumanFactory {

	public static void main(String[] args) {
		/* zwei neue Instanzen.
		 * Ein Männlein und ein Weiblein
		 * Beide sind Instanzen vom jeweiligen Geschlecht
		 * aber auch von der Klasse Human
		 */
		Male adam = new Male("Adam", 23, 175, false);
		Female eve = new Female("Eve", 23, 170, false);
	
		/* sleep und think sind Methoden der Human-Klasse
		 * auf welche aber Adam als Male dennoch zugreifen kann
		 * denn Male ist eine Subklasse von Human und erbt alle ihre Eigenschaften und Methoden
		 * Entsprechend können sowohl Adam als auch Eva diese Methoden ausführen
		 */
		adam.sleep(5);
		System.out.println(adam.think());
		eve.walk();
	
		/* Hier rufen wir eine für die Klasse Female spezifische Methode auf
		 * Frauen können neue Menschen auf die Welt bringen
		 * Diese müssen auch einem Objekt (bsp. Male max) zugewiesen werden
		 * Adam (bzw. die Klasse Male) besitzt diese Methode nicht
		 */
		Male adam2 = eve.giveBirthToMale("Adam", 51, true);
		Female anna = eve.giveBirthToFemale("Anna", 50, true);
		
		// Hier wird eine Methode aufgerufen, die nur in der Klasse Male existiert
		adam.peeStandingUp();
		System.out.println(adam.toString());
		
		
		// Test der überschriebenen equals-Methode
		adam2.setAge(23); // Ist diese Zeile aktiv, sind Adam und Adam 2 als gleich eingestuft
		// Unsere Equals-Methode nutzt nämlich den Namen und das Alter um zu überprüfen ob zwei Menschen gleich sind
		if (adam.equals(adam2)) {
			System.out.println("They are the same");
		} else {
			System.out.println("These are two different humans");
		}
		
		
		// Testen der Eat-Methode
		anna.eat(new Apple("red", "big"));
	}
}
