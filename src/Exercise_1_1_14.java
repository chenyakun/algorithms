
public class Exercise_1_1_14 {

	static int lg(int N) {
		int pow = -1;
		int product = 1;
		
		while(product <= N) {
			product *= 2;
			pow++;
		}
		return pow;
	}
	
	public static void main(String[] args) {
		StdOut.println(lg(1));
		StdOut.println(lg(2));
		StdOut.println(lg(3));
		StdOut.println(lg(4));
		StdOut.println(lg(5));
		StdOut.println(lg(128));
		StdOut.println(lg(129));

	}

}
