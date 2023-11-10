package org.lessons.java;

import java.util.Random;

public class snack2 {
	
	public static void main(String[] args) {
		
		String[] nomi = {"Mario", "Luigi", "Giovanna", "Anna", "Carlo", "Maria", "Luca", "Giuseppe", "Elena", "Francesca"};
		String[] cognomi = {"Rossi", "Bianchi", "Verdi", "Russo", "Ferrari", "Esposito", "Romano", "Gallo", "Conti", "Marino"};
		
		for(int x=0;x<nomi.length;x++) {
			
			Random random = new Random();
			int randomNumber = random.nextInt(0, nomi.length);
			String casualName = nomi[randomNumber];
			String casualLastName = cognomi[randomNumber];
			System.out.println("Invitato: " + casualName + " " + casualLastName);
		}
		
	}
}
