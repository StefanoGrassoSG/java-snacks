package org.lessons.java;

import java.util.Scanner;

public class snack1 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Inserisci un numero: ");
		String strValue1 = in.nextLine();
		int value1 = Integer.valueOf(strValue1);
		
		if(value1 % 2 == 0) {
			System.out.println(value1 + " " + "è pari");
		}
		else {
			System.out.println(value1 + " " + "è dispari");
		}
	}
}
