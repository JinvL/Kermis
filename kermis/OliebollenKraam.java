package kermis;
import java.util.Scanner;

class OliebollenKraam extends VoedselKraampjes implements GevaarlijkBijHartaandoening, GevaarlijkBijGlutenAllergie{
	private final static String naam = "de oliebollenkraam";
	private int verkopen;
	private double omzet;
	private final static double prijs=4.00;
	
	void verkoop(Scanner scanner) {
		if(healthWarningHart(naam, scanner) && healthWarningGluten(naam, scanner)) {
			verkopen++;
			omzet=Double.sum(omzet, prijs);
			super.omzetErbij(prijs);
			System.out.println("Je hebt een oliebol gekocht. ");
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
