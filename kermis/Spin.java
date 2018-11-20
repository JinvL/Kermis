package kermis;
import java.util.Scanner;

class Spin extends Attracties implements GevaarlijkBijEvenwichtsStoornis {
	private final static String naam="de spin";
	private int verkopen;
	private double omzet;
	private final static double prijs=2.25;
	
	void verkoop(Scanner scanner) {
		if(healthWarningEvenwicht(naam, scanner)) {
			verkopen++;
			omzet=Double.sum(omzet, prijs);
			super.omzetErbij(prijs);
			System.out.println("De attractie spin draait. ");
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
