package repeat;

import java.util.Scanner;

public class WhileSample {
	public static void main(String[] args) {
		int i, count=0, sum=0, number;
		Scanner scn = new Scanner(System.in);
		
		System.out.print("정수 입력(종료 : -1) : ");
		number = scn.nextInt();
		while(number != -1) {
			sum += number;
			++count;
			number = scn.nextInt();
		}
		if(count == 0)
			System.out.println("입력된 정수가 없습니다.");
		else {
			System.out.println("입력된 정수의 개수는 " + count + "개 입니다.");
			System.out.println("정수의 평균 = " + (double)sum/count + " 입니다");
		}
		scn.close();
	}
}
