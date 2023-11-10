package org.lessons.java;

import java.util.Scanner;

public class snack5 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		while(true) {
		System.out.println("Inserisci una parola: ");
		String strValue = in.nextLine();
		
		if(strValue.equals("0")) {
			System.out.println("programma terminato");
			break;
		}
		
		int alphabetCount = 0; 
        int digitCount = 0;
        int symbolCount = 0;
        
        for (int x=0;x<strValue.length();x++) {
        	char currentChar = strValue.charAt(x);
            if (Character.isLetter(currentChar)) {
                alphabetCount++;
            } else if (Character.isDigit(currentChar)) {
                digitCount++;
            } else {
                symbolCount++;
            }
        }
		
			System.out.println("Caratteri alfabetici: " + alphabetCount);
	        System.out.println("Numeri: " + digitCount);
	        System.out.println("Simboli non alfanumerici: " + symbolCount);
		}
	}
}
