package kms;

public class sum2 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		for (i = 0; i < 100; i = i + 2) {
			sum += i;
		}
		System.out.println(sum);
	}
}