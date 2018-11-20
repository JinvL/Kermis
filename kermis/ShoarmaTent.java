package kermis;
import java.util.Scanner;

class ShoarmaTent extends VoedselKraampjes implements GevaarlijkBijHartaandoening {
	private final static String naam="de shoarmatent";
	private int verkopen;
	private double omzet;
	private final static double prijs=5.15;
	
	void verkoop(Scanner scanner) {
		if(healthWarningHart(naam, scanner)) {
			verkopen++;
			omzet=Double.sum(omzet, prijs);
			super.omzetErbij(prijs);
			System.out.println("Je hebt een potie shoarma gekocht. ");
		}	
	}
	
	void toonCijfers() {
		super.toonVerkochtePorties(this);
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
