package org.lessons.java;

import java.util.Scanner;

public class snack10 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("inserisci un numero: ");
		String value = in.nextLine();
		int digit1 = Integer.valueOf(value);
		
		System.out.print("inserisci un'altro numero: ");
		String value2 = in.nextLine();
		int digit2 = Integer.valueOf(value2);
		
		int max = (digit1 > digit2) ? digit1 : digit2;
		int min = (digit1 < digit2) ? digit1 : digit2;
		
		int sum = 0;
		for(int x = min;x<=max;x++) {
			sum += x;
		}
		
		
		System.out.println("la somma di tutti i numeri tra quelli che hai selezionato è: " + sum);
		in.close();
	}
}
