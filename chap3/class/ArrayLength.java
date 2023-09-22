package repeat;

public class ArrayLength {
	public static void main(String[] args) {
		int sum = 0;
		int[]intArr = {1,2,5,4,5};
		
		for (int j = 0; j < intArr.length; j++) {
			sum += intArr[j];
		}
		System.out.println((double)sum/intArr.length);
	}
}
