package kms;

import java.util.Scanner;
import java.util.Random;

public class rockscissorspaper {
	public static void main(String[] args) {
		String str[] = {"가위", "바위", "보"};
		Scanner in = new Scanner(System.in);
		
		while (true) {
            System.out.print("가위바위보 대결 : ");
            String user = in.nextLine();

            if (user.equals("종료")) {
                break;
            }
            
		int n = (int)(Math.random()*3);
		String computer = str[n];
		System.out.println("유저 : " + user + " / 컴퓨터 : " + computer);
		
		if (user.equals(str[n])) {
			System.out.println("비김");
		}
		else if (user.equals("가위") && computer.equals("보")) {
			System.out.println("유저 승리");
		}
		else if (user.equals("바위") && computer.equals("가위")) {
			System.out.println("유저 승리");
		}
		else if (user.equals("보") && computer.equals("바위")) {
			System.out.println("유저 승리");
		}
		else {
			System.out.println("내 승리");
		}
		}
		System.out.println("종료");
	}
}