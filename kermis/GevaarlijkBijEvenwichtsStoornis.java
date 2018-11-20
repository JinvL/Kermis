package kermis;

import java.util.Scanner;

interface GevaarlijkBijEvenwichtsStoornis extends MedischeAandoening {
	String aandoening="evenwichtsstoornis";
	
	default boolean healthWarningEvenwicht(String s, Scanner scanner) {
		return (healthWarning(s,scanner,aandoening));
	}
}
