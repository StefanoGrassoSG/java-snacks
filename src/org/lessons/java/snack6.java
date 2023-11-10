package org.lessons.java;

import java.util.Scanner;

public class snack6 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("inserisci un numero: ");
		String value = in.nextLine();
		
		int result = 0;
		for(int x=0;x<value.length();x++) {
			
			char c = value.charAt(x);
			
			if(c >= '0' && c <= '9') {
				 int cInt = c - '0';
				 result = result * 10 + cInt;
			}
		}
		System.out.println(result);
	}
}
