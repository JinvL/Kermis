package kermis;

abstract class VoedselKraampjes extends KermisKramen {
	private static int verkopen;
	private static double omzet;
	
	void omzetErbij(double omzet) {
		super.omzetErbij(omzet);
		this.omzet=Double.sum(omzet, this.omzet);
		verkopen++;
	}
	
	void toonCijfersVoedselKraampjes() {
		if (verkopen==1) {
			System.out.println("Alle voedselkraampjes hebben totaal "+verkopen+" portie verkocht. ");
		} else {
			System.out.println("Alle voedselkraampjes hebben totaal "+verkopen+" porties verkocht. ");
		}
		System.out.printf("Er is €%.2f omzet gedraaid.\n",omzet);
	}
	
	void toonVerkochtePorties(VoedselKraampjes voedselkraampje) {
		if(verkopen==1) {
			System.out.println("Bij "+voedselkraampje.getNaam()+" is "+voedselkraampje.getVerkopen()+" portie verkocht. ");
		} else {
			System.out.println("Bij "+voedselkraampje.getNaam()+" zijn "+voedselkraampje.getVerkopen()+" porties verkocht. ");
		}
		System.out.printf("Er is €%.2f omzet gedraaid.\n",voedselkraampje.getOmzet());
	}
}
