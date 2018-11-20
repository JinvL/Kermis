package kermis;
import java.util.Scanner;

class Botsautos extends Attracties implements GevaarlijkBijHartaandoening{
	private final static String naam = "de botsauto";
	private int verkopen;
	private double omzet;
	private final static double prijs=2.50;
	
	void verkoop(Scanner scanner) {
		if(healthWarningHart(naam, scanner)) {
			verkopen++;
			omzet=Double.sum(omzet, prijs);
			super.omzetErbij(prijs);
			System.out.println("De attractie botsauto's draait. ");
		}
	}
	
	void toonCijfers() {
		super.toonVerkochteKaartjes(this);
	}
	
	String getNaam() {
		return naam;
	}
	
	public int getVerkopen() {
		return verkopen;
	}
	
	public double getOmzet() {
		return omzet;
	}
}
