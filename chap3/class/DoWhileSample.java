package repeat;

public class DoWhileSample {
	public static void main(String[] args) {
		char ch1 = 'A';
		char ch2 = 'a';
		
		do {
			System.out.print(ch1);
			ch1 = (char)(ch1 + 1);
		}while(ch1<='Z');
		
		System.out.println();
		do {
			System.out.print(ch2);
			ch2 = (char)(ch2 + 1);
		}while(ch2<='z');
	}
}
