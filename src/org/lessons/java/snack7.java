package org.lessons.java;

import java.util.Scanner;

public class snack7 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("inserisci quanti secondi vuoi convertire: ");
		String value = in.nextLine();
		int number = Integer.valueOf(value);
		
		int days = number / (24 * 3600);
        int remainingSeconds = number % (24 * 3600);
        int hours = remainingSeconds / 3600;
        int remainingMinutes = (remainingSeconds % 3600) / 60;
        int seconds = remainingSeconds % 60;
		
        System.out.println(days + " giorni " + hours + ":" + remainingMinutes + ":" + seconds);
        
        in.close();
	}
}
