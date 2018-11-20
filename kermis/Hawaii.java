package kermis;
import java.util.Scanner;

public class Hawaii extends Attracties implements GevaarlijkBijHartaandoening, GevaarlijkBijEvenwichtsStoornis{
	private final String naam="Hawai";
	private int verkopen;
	private double omzet;
	private final static double prijs=2.90;
	
	void verkoop(Scanner scanner) {
		if(healthWarningHart(naam, scanner) && healthWarningEvenwicht(naam,scanner)) {
			verkopen++;
			omzet=Double.sum(omzet, prijs);
			super.omzetErbij(prijs);
			System.out.println("De attractie hawaii draait. ");
		}	
	}
	
	void toonCijfers() {
		super.toonVerkochteKaartjes(this);
	}
	
	String getNaam() {
		return naam;
	}
	
	int getVerkopen() {
		return verkopen;
	}
	
	double getOmzet() {
		return omzet;
	}
}