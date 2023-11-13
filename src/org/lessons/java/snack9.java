package org.lessons.java;

public class snack9 {
	
	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 3, 4, 5};
		int [] evens = new int[10];
		int [] odd = new int[10];
		
		for(int x=0;x<numbers.length;x++) {
			int	single = numbers[x];
			if(single % 2 == 0) {
				evens[x] = single;
				System.out.println(evens[x] + "pari");
			}
			else {
				odd[x] = single;
				System.out.println(odd[x] + "dispari");
			}
		}
	}
}
