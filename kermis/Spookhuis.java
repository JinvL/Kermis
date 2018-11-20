package kermis;
import java.util.Scanner;

class Spookhuis extends Attracties implements GevaarlijkBijHartaandoening{
	private final static String naam="het spookhuis";
	private int verkopen;
	private double omzet;
	private final static double prijs=3.20;
	
	void verkoop(Scanner scanner) {
		if(healthWarningHart(naam, scanner)) {
			verkopen++;
			omzet=Double.sum(omzet, prijs);
			super.omzetErbij(prijs);
			System.out.println("De attractie spookhuis draait. ");
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
