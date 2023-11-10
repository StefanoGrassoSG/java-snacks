package org.lessons.java;

import java.util.Scanner;

public class snack5 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Inserisci una parola: ");
		String strValue = in.nextLine();
		
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
		if(strValue.equals("0")) {
			System.out.println("termina programma");
		}
		else {
			System.out.println("Caratteri alfabetici: " + alphabetCount);
	        System.out.println("Numeri: " + digitCount);
	        System.out.println("Simboli non alfanumerici: " + symbolCount);
	        System.out.println("continua");
		}
	}
}
