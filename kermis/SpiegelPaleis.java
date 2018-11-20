package kermis;
import java.util.Scanner;

class SpiegelPaleis extends Attracties {
	private final static String naam="het spiegelpaleis";
	private int verkopen;
	private double omzet;
	private final static double prijs=2.75;
	
	void verkoop(Scanner scanner) {
		verkopen++;
		omzet=Double.sum(omzet, prijs);
		super.omzetErbij(prijs);
		System.out.println("De attractie spiegelpaleis draait. ");
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
