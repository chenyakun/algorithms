
public class DrawTest {
	public static void main(String[] args) {
		double[][] coords = new double[2][10];
		
		for(int i = 0; i < 1; i++) {
			coords[0][i] = i * i * i / 10 - i * i + 3;
			coords[1][i] = coords[0][i] * i / 5;
		}
			
		
		StdDraw.filledPolygon(coords[0], coords[1]);
	}
}
