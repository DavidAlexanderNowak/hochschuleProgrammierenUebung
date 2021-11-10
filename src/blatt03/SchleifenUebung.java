package blatt03;

public class SchleifenUebung {
	private static final double STEP = 0.5;
	private static final int ENDING_VALUE = 4;
	private static final int STARTING_VALUE = -4;

	public static void main(String args[]) {

		for (double i = STARTING_VALUE; i <= ENDING_VALUE; i = i + STEP) {
			System.out.println("x, x^2: " + i + ", " + (i * i));
		}
		for (double i = STARTING_VALUE; i <= ENDING_VALUE; i = i + STEP) {
			System.out.println("x, sin(x), cos(x): " + i + ", " + Math.sin(i) + ", " + Math.cos(i));
		}

	}
}
