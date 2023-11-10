package org.lessons.java;

import java.util.Random;

public class snack11 {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		int [] numbers = new int[101];
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int sum = 0;
		for(int x=0;x<=100;x++) {
			int randomNumber = random.nextInt(100);
			numbers[x] = randomNumber;
			System.out.println(numbers[x]);
			
			min = (numbers[x] < min) ? numbers[x] : min;
			max = (numbers[x] > max) ? numbers[x] : max;
			
			 sum += numbers[x];
		}
		
		int average = sum / 100;
		System.out.println("il numero più basso è: " + min);
		System.out.println("il numero più alto è: " + max);
		System.out.println("la media dei numeri è: " + average);
	}
}
