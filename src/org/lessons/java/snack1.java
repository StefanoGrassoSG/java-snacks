package org.lessons.java;

import java.util.Scanner;

public class snack1 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Inserisci un numero: ");
		String strValue1 = in.nextLine();
		int value1 = Integer.valueOf(strValue1);
		
		System.out.println((value1 % 2 == 0) ? value1 + " è pari" : (value1 + 1) + " è il successivo");

		in.close();
	}
}
