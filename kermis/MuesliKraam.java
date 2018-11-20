package kermis;
import java.util.Scanner;

class MuesliKraam extends VoedselKraampjes implements GevaarlijkBijGlutenAllergie {
	private final static String naam="de mueslikraam";
	private int verkopen;
	private double omzet;
	private final static double prijs=9.00;
	
	void verkoop(Scanner scanner) {
		if(healthWarningGluten(naam, scanner)) {
			verkopen++;
			omzet=Double.sum(omzet, prijs);
			super.omzetErbij(prijs);
			System.out.println("Je hebt een portie muesli gekocht. ");
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
