package kms;

import java.util.Random;

public class randomaverage {
	public static void main(String[] args) {
		Random random = new Random();
		int[] numbers = new int[10];
		int i, sum = 0;
		for (i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * 10 + 1);
		}
		System.out.print("랜덤한 정수 : ");
		for (i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		for (i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		double average = sum / numbers.length;
		System.out.println("평균 : " + average);
	}
}