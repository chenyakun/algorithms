
public class Exercise_1_1_3 {

	public static void main(String[] args) {
		if(args.length < 3) {
			StdOut.println("Too little args");
		}
		else {
			if(args.length == 3) {
				if((Integer.parseInt(args[0]) == Integer.parseInt(args[1])) && (Integer.parseInt(args[1]) == Integer.parseInt(args[2]))) StdOut.print("equal");
				else StdOut.print("not equal");
			}
			else StdOut.println("Too many args");
		}

	}

}
