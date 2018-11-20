package kermis;
import java.util.Scanner;

interface MedischeAandoening {
	
	default boolean healthWarning(String s, Scanner scanner, String i) {
		System.out.println("!!!  Pas op, "+s+" is niet veilig voor mensen met een "+i+".  !!!");
		System.out.println("Toets 111 om de disclaimer te tekenen dat wij niet verantwoordelijk zijn voor eventueel opgelopen letsel \nOf toets ieder ander getal om terug te keren naar het hoofdmenu");
		int input=scanner.nextInt();
		return(input==111);
	}
}
