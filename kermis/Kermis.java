package kermis;

import java.util.Scanner;
import java.util.HashMap;

public class Kermis {
	
	static Attracties auto=new Botsautos();
	static Attracties spin=new Spin();
	static Attracties spiegel=new SpiegelPaleis();
	static Attracties spook=new Spookhuis();
	static Attracties hawaii=new Hawaii();
	static Attracties ladder=new LadderKlimmen();
	static VoedselKraampjes oliebol=new OliebollenKraam();
	static VoedselKraampjes friet = new FrietKraam();
	static VoedselKraampjes muesli=new MuesliKraam();
	static VoedselKraampjes shoarma=new ShoarmaTent();
	static int stop=0;
	
	static HashMap<Integer, KermisKramen> kermiskramen = new HashMap<>();
	
	public static void main(String[] args) {
		putHashMap();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Welkom op de Kermis!");
		
		do {
			kiesProgramma(scanner);
		} while (stop==0);
		System.out.println("Bedankt en tot ziens!");
		scanner.close();
	}
	
	static void putHashMap() {
		kermiskramen.put(1, auto);
		kermiskramen.put(2, spin);
		kermiskramen.put(3, spiegel);
		kermiskramen.put(4, spook);
		kermiskramen.put(5, hawaii);
		kermiskramen.put(6, ladder);
		kermiskramen.put(11, oliebol);
		kermiskramen.put(22, friet);
		kermiskramen.put(33, muesli);
		kermiskramen.put(44, shoarma);
	}
	
	static void kiesProgramma(Scanner scanner) {
		System.out.println("\n\t### HOOFDMENU ###\nKies met de volgende toetsen wat je wil doen:\n- Toets K als je een van de kermiskramen wil bezoeken\n- Toets O als je benieuwd bent naar verkoop- en omzetcijfers van (een deel van) de kermis\n- Toets S als je wil stoppen");
		String invoer = scanner.next();
		invoer = invoer.toUpperCase();
		switch (invoer) {
			case "K":
				naarKermis(scanner);
				break;
			case "O":
				naarCijfers(scanner);
				break;
			case "S":
				stop++;
				break;
			default:
				System.out.println("Dis is geen geldige invoer. ");
				kiesProgramma(scanner);
		}
	}
	
	static void naarKermis(Scanner scanner) {
		System.out.println("\nKies hier welke attractie of voedselkraam je wil bezoeken: ");
		for(int i=1;i<45;i++) {
			if(kermiskramen.containsKey(i)) {
				System.out.println("- Toets "+i+" voor "+kermiskramen.get(i).getNaam());
			}
		}
		System.out.println("Of toets ieder ander getal om terug te keren naar het hoofdmenu. ");
		int input = scanner.nextInt();
			if(kermiskramen.containsKey(input)) {
				kermiskramen.get(input).verkoop(scanner);
			} else {
				System.out.println("Dit is geen geldige invoer.");
				naarKermis(scanner);
			}
		kiesProgramma(scanner);
	}
	
	static void naarCijfers(Scanner scanner) {
		System.out.println("\nGeef met de volgende toetsen aan waar je de verkoop- en omzetcijfers van wil zien: ");
		for(int i=1;i<45;i++) {
			if(kermiskramen.containsKey(i)) {
				System.out.println("- Toets "+i+" voor de cijfers van "+kermiskramen.get(i).getNaam());
			}
		}
		System.out.println("- 50 voor de omzet van alle voedselkraampjes\n- 51 voor de omzet van alle attracties\n- 52 voor de omzet van de hele kermis\nOf toets ieder ander getal om terug te gaan naar het hoofdmenu. ");
		int invoer = scanner.nextInt();
		switch(invoer) {
		case 50:
//ik had hier ook kunnen casten en zo de KermisKramen fields kunnen bereiken ipv het via de methode te doen, 
//maar op deze manier kon ik meer encapsulation toepassen en de fields van de abstract superclasses (Kermiskramen, Attracties, VoedselKraampjes) private houden
			oliebol.toonCijfersVoedselKraampjes();
			break;
		case 51:
			auto.toonCijfersAttracties();
			break;
		case 52:
			auto.toonCijfersKermisKramen();
			break;
		default:
			if(kermiskramen.containsKey(invoer)) {
				kermiskramen.get(invoer).toonCijfers();
			} else {
				kiesProgramma(scanner);
			}
		}
	}
}
