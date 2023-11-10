package org.lessons.java;

public class snack3 {

	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		
		int sum = 0;
		for(int x=0;x<numbers.length;x+=2)sum += numbers[x];
		
		System.out.println(sum);
	}
}
