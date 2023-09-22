package repeat;

public class SevenHapWhile {
	public static void main(String[] args) {
		int i, sevenSum = 0, sum = 0;
		
		i = 1;
		while(i<=100) {
			if(i%7==0) {
				sevenSum += i;
				++i;
				continue;
			}
			sum += i;
			++i;
		}
		System.out.println("7의 배수들의 합 = " +sevenSum);
		System.out.println("7의 배수들을 뺀 수들의 합 = " +sum);
	}
}
