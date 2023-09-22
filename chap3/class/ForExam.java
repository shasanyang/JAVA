package repeat;

public class ForExam {
	public static void main(String[] args) {
		int i, sum, oddSum=0, evenSum=0;
		
		for(i=1, sum =0; i <= 100; ++i) {
			sum += i;	// sum = sum + i;
		}
		System.out.println(sum);
		
		for(i=1; i <= 100; ++i) {
			if(i%2 == 1)
				oddSum += i;
			else
				evenSum += i;
		}
		System.out.println("홀수들의 합 = " + oddSum);
		System.out.println("짝수들의 합 = " + evenSum);
		
		for(i=1, sum =0; i <= 100; i += 2) {
			sum += i;	// sum = sum + i;
		}
		System.out.println("홀수들의 합 = " + sum);
	}
}
