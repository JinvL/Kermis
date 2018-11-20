package kermis;
import java.util.Scanner;

abstract class KermisKramen {
	private static int verkopen;
	private static double omzet;
	
	abstract void verkoop(Scanner scanner);
	abstract void toonCijfers();
	abstract String getNaam();
	abstract int getVerkopen();
	abstract double getOmzet();
	
	void omzetErbij(double omzet) {
		this.omzet=Double.sum(omzet, this.omzet);
		verkopen++;
	}
	
	void toonCijfersKermisKramen() {
		if(verkopen==1) {
			System.out.printf("Op de kermis is totaal "+verkopen+" verkoop gedaan.");
		} else {
			System.out.printf("Op de kermis zijn totaal "+verkopen+" verkopen gedaan.");
		}
		System.out.printf("\nEr is totaal €%.2f omzet gedraaid.\n",omzet);
	}
}
