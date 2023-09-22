package repeat;

public class SevenHap {
	public static void main(String[] args) {
		int i, sevenSum = 0, sum = 0;
		
		for(i=0; i<=100; ++i) {
			if(i%7==0) {
				sevenSum += i;
				continue;
			}
			sum += i;
		}
		System.out.println("7의 배수들의 합 = " +sevenSum);
		System.out.println("7의 배수들을 뺀 수들의 합 = " +sum);
	}
}
