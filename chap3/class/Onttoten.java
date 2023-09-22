package repeat;

public class Onttoten {
	public static void main(String[] args) {
		final int MAX = 15;
		int i, sum = 0;
		
		for(i=1; i<=MAX; ++i) {
			sum += i;
			System.out.print(i);
			if(i<MAX)
				System.out.print("+");
			else
				System.out.print("=");
		}
		System.out.println(sum);
	}
}
