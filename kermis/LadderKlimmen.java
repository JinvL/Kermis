package kermis;
import java.util.Scanner;

class LadderKlimmen extends Attracties implements GevaarlijkBijEvenwichtsStoornis{
	private final static String naam="het ladderklimmen";
	private int verkopen;
	private double omzet;
	private final static double prijs=5.00;
	
	void verkoop(Scanner scanner) {
		if(healthWarningEvenwicht(naam, scanner)) {
			verkopen++;
			omzet=Double.sum(omzet, prijs);
			super.omzetErbij(prijs);
			System.out.println("De attractie ladderklimmen draait. ");
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
