
public class Exercise_1_1_11 {

	public static void main(String[] args) {
		int	n = StdIn.readInt(),
			m = StdIn.readInt();
		
		boolean[][] arr = new boolean [n][m];
		
		for(int i = 0; i < n; i++)
			for(int j = 0; j < m; j++)
				arr[i][j] = StdRandom.bernoulli();
			
		
		StdOut.print("\t");
		for(int j = 0; j < m; j++)
			StdOut.print((j + 1) + "\t");
		for(int i = 0; i < n; i++) {
			StdOut.print("\n" + (i + 1) + "\t");			
			for(int j = 0; j < m; j++)
				StdOut.print((arr[i][j] ? "*" : " ") + "\t");
		}

	}

}
