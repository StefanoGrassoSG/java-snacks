package org.lessons.java;

import java.util.Scanner;

public class snack8 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("inserisci una parola: ");
		String word = in.nextLine();
		
		char a = 'a';
		char o = 'o';
		for(int x=0;x<word.length();x++) {
			char c = word.charAt(x);
			if(c == a) {
				c = 'o';
			}
			else if(c == o) {
				c = 'a';
			}
			System.out.println(c);
		}
		in.close();
	}
}
