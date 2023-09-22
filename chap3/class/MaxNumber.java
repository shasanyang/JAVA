package repeat;

import java.util.Scanner;

public class MaxNumber {
	public static void main(String[] args) {
		int i, max = -2147483648, min = 2147483647;
		int[] intArray = new int[5];  // intArray[0], intArray[1], intArray[2], ..., intArray[4]
		Scanner scn = new Scanner(System.in);
		
		//값을 입력받아 배열에 할당
		for(i=0; i<5; ++i) {
			System.out.print("intArray[" + i + "] = ");
			intArray[i] = scn.nextInt();
			if(max < intArray[i])
				max = intArray[i];
			if(min > intArray[i])
				min = intArray[i];
		}
		System.out.println("입력한 값 중에 최대값 = " + max + " 입니다.");
		System.out.println("입력한 값 중에 최소값 = " + min + " 입니다.");
		scn.close();
	}
}
