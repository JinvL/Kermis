package kermis;

abstract class Attracties extends KermisKramen {
	private static int verkopen;
	private static double omzet;
	
	void omzetErbij(double omzet) {
		super.omzetErbij(omzet);
		this.omzet=Double.sum(omzet, this.omzet);
		verkopen++;
	}
	
	void toonCijfersAttracties() {
		if(verkopen==1) {
			System.out.println("Van alle attracties is totaal "+verkopen+" kaartje verkocht. ");
		} else {
			System.out.println("Van alle attracties zijn er totaal "+verkopen+" kaartjes verkocht. ");
		}
		System.out.printf("Er is €%.2f omzet gedraaid.\n", omzet);
	}
	
	void toonVerkochteKaartjes(Attracties attractie) {
		if(verkopen==1) {
			System.out.println("Bij "+attractie.getNaam()+" attractie is "+attractie.getVerkopen()+" kaartje verkocht. ");
		} else {
			System.out.println("Bij "+attractie.getNaam()+" attractie zijn "+attractie.getVerkopen()+" kaartjes verkocht. ");
		}
		System.out.printf("\nEr is €%.2f omzet gedraaid.\n",attractie.getOmzet());
	}
}
