package kms;

import java.util.Random;

public class randomint {
	public static void main(String[] args) {
		Random random = new Random();
		int[][] numbers = new int[4][4];
		int i, j = 0;
		for (i = 0; i < numbers.length; i++) {
			for (j = 0; j < numbers[i].length; j++) {
				numbers[i][j] = random.nextInt(10)+1;
			}
		}
		for (i = 0; i < numbers.length; i++) {
			for (j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}
	}
}
