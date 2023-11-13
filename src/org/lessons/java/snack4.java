package org.lessons.java;

import java.util.Scanner;

public class snack4 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Inserisci una parola: ");
		String strValue = in.nextLine();
		
		for(int x=0;x<strValue.length()/2;x++) {
	 		
			if(strValue.charAt(x) != strValue.charAt(strValue.length() - 1 - x)) {
				System.out.println("La parola " + strValue + " non è palindroma");
	            return;
			}
		}
		 System.out.println("La parola " + strValue + " è palindroma");
		 
		 in.close();
	}
}
