package repeat;

import java.util.Scanner;

public class ArrayExam {
	public static void main(String[] args) {
		int i;
		int[] intArray = new int[5];  // intArray[0], intArray[1], intArray[2], ..., intArray[4]
		Scanner scn = new Scanner(System.in);
		
		//값을 입력받아 배열에 할당
		for(i=0; i<5; ++i) {
			System.out.print("intArray[" + i + "] = ");
			intArray[i] = scn.nextInt();
		}
		//배열의 값을 출력
		for(i=0; i<5; ++i) 
			System.out.println("intArray[" + i + "] = " + intArray[i]);
	
		scn.close();
	}
}
