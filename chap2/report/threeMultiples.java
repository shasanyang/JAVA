package kms;

import java.util.Scanner;

public class threeMultiples {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("양의 정수 10개 입력 : ");
		int[] numbers = new int[10];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = in.nextInt();
		}

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 3 == 0) {
				System.out.println(numbers[i]);
			}
		}
	}
}