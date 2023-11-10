package org.lessons.java;

import java.util.Scanner;

public class snack7 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("inserisci quanti secondi vuoi convertire: ");
		String value = in.nextLine();
		int number = Integer.valueOf(value);
		
		int minute = number / 60;
		double hour = number / 3600;
		int seconds = number;
		
		System.out.println("in ore: " + hour);
		System.out.println("in minuti: " + minute);
		System.out.println("in secondi: " + seconds);
	}
}
