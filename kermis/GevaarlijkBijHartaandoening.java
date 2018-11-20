package kermis;
import java.util.Scanner;

interface GevaarlijkBijHartaandoening extends MedischeAandoening{
	String aandoening="hartaandoening";
	
	default boolean healthWarningHart(String s, Scanner scanner) {
		return (healthWarning(s,scanner,aandoening));
	}
}
