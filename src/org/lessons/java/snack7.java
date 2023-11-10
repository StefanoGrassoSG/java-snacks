package org.lessons.java;

import java.util.Scanner;

public class snack7 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("inserisci quanti secondi vuoi convertire: ");
		String value = in.nextLine();
		int number = Integer.valueOf(value);
		
		int hours = number /(3600);
        int minutes = (number % (3600))/60;
        int seconds = number % 60;
		
		System.out.println(hours + ":" + minutes + ":" + seconds);
	}
}
