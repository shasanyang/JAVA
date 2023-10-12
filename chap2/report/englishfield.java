package kms;

import java.util.Scanner;

public class englishfield { // 출력 오류남
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.print("소문자 알파벳 입력 : ");
	String alphabet = in.next();
	char c = alphabet.charAt(0);

	for (int i = 0; i <= c; i++) {
		for (int j = 0; j <= i; j++) {
			System.out.print((char) ('a' + i));
			}
		System.out.println();
		}
	}
}