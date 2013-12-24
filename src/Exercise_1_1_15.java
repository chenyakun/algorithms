
public class Exercise_1_1_15 {

	static int[] histogram(int[] a, int M) {
		int[] res = new int [M];
		
		for(int i = 0; i < a.length; i++)
			if(a[i] < M)
				res[a[i]]++;
		return res;
	}
	
	public static void main(String[] args) {
		int n = StdIn.readInt();
		int M = 100;
		int[] rawData = new int[n];
		
		for(int i = 0; i < n; i++)
			rawData[i] = StdRandom.uniform(0, M);
		
		int[] frequency = histogram(rawData, M);
		
		for(int i = 0; i < M; i++) {
			for(int j = 0; j < frequency[i]; j++)
				StdOut.print("*");
			StdOut.println();
		}
		
		

	}

}
