
public class Exercise_1_1_13 {

	static int[][] Transposite(int[][] matrix) {
		int n = matrix.length;
		int m = matrix[0].length;
		
		int[][] transpMatrix = new int [m][n];
		
		for(int i = 0; i < m; i++)
			for(int j = 0; j < n; j++)
				transpMatrix[i][j] = matrix[j][i];
		
		return transpMatrix;
	}
	
	public static void main(String[] args) {
		int[][] matrix = new int [3][5];
		
		for(int i = 0; i < 3; i++)
			for(int j = 0; j < 5; j++)
				matrix[i][j] = i*i + j;
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 5; j++)
				StdOut.print(matrix[i][j] + "\t");
			StdOut.println();
		}
		
		matrix = Transposite(matrix);
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 3; j++)
				StdOut.print(matrix[i][j] + "\t");
			StdOut.println();
		}
		
		
	}

}
