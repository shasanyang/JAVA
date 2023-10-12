package kms;

public class threesixnine {
	public static void main(String[] args) { // 출력 아직 안됨
		
		for (int i = 1; i <= 99; i++) {
			int ten = i / 10 % 10;
				if (i % 3 == 0 && ten % 3 == 0) {
				System.out.println(i + " 박수짝짝");
				if (i % 3 == 0 || ten % 3 == 0) {
					System.out.println(i + " 박수짝");
				}
			}
			else {
				System.out.println(i);
			}
		}
	}
}
