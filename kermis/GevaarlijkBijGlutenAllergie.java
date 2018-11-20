package kermis;
import java.util.Scanner;

interface GevaarlijkBijGlutenAllergie extends MedischeAandoening {
	String aandoening="glutenallergie";
	
	default boolean healthWarningGluten(String s, Scanner scanner) {
		return (healthWarning(s,scanner,aandoening));
	}
}
