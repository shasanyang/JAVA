package kms;

import java.util.Scanner;
import java.util.Random;

public class integer {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("정수?(1~100) : ");
		int number = in.nextInt();
		
		if (number >= 100) {
			System.out.println("100 초과");
			return;
		}
		
		int i, j, sum = 0;
		int[] numbers = new int[number];
		Random random = new Random();
		
		System.out.print("랜덤한 정수 : ");
		for (i = 0; i < numbers.length; i++) {
			numbers[i] = random.nextInt(100) + 1; // +1 의미?
		for (j = 0; j < i; j++) {
			if (numbers[i] == numbers[j]) {
				numbers[i] = random.nextInt(100) + 1;
				j = -1;
				}
			}
		System.out.print(numbers[i] + " ");
		}
	}
}