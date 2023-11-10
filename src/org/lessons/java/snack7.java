package org.lessons.java;

import java.util.Scanner;

public class snack7 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("inserisci quanti secondi vuoi convertire: ");
		String value = in.nextLine();
		int number = Integer.valueOf(value);
		
		int minute = number / 60;
		int hour = number / 3600;
		int seconds = number;
		
		System.out.println(hour + ":" + minute + ":" + seconds);
	}
}
