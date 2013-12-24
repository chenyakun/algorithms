
public class Exercise_1_1_19 {

	static int[] Fib = new int [100];

	
	public static long F(int N)
	{
		if (N == 0) {
			Fib[0] = 0;
			return Fib[0];
		}
		
		if (N == 1) {
			Fib[1] = 1;
			return Fib[1];
		}
		
		Fib[N] = Fib[N-1] + Fib[N-2];	
		
		return Fib[N];
	}
	
	public static void main(String[] args)
	{
		
		
		for (int N = 0; N < 100; N++) {
			StdOut.println(N + " " + F(N));
		}
	}
	

}
