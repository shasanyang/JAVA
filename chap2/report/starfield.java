package kms;

import java.util.Scanner;

public class starfield {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.print("정수를 입력 : ");
	int number = in.nextInt();
	int i, j = 0;
	for (i = number; i >= 1; i--) {
		for (j = 0; j < i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}