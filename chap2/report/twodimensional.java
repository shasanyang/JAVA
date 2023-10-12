package kms;

public class twodimensional { // 2차원?
	public static void main(String[] args) {
	int n[][] = {{1}, {1,2,3}, {1}, {1,2,3,4}, {1,2}};

	int row = n.length;
	int col = n[0].length;

	for (int i = 0; i < row; i++) {
		for (int j = 0; j < col; j++) {
			System.out.println(n[i][j] + " ");
		} 
		System.out.println();
		}
	}
}