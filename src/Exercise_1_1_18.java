
public class Exercise_1_1_18 {

	public static int mystery(int a, int b)
	{
	if (b == 0) return 1;
	if (b % 2 == 0) return mystery(a*a, b/2);
	return mystery(a*a, b/2) * a;
	}
	
	public static void main(String[] args) {
	
		StdOut.println(mystery(3,4));
		StdOut.println(mystery(2,5));
	}

}
