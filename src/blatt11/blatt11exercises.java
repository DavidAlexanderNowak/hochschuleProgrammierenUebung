package blatt11;

import java.io.IOException;

public class blatt11exercises {

	public static void main(String args[]) {
		test11_2();
	}

	private static void test11_2() {
		System.out.println(div(4, 0));
	}

	/**
	 * Zwei Werte dividieren
	 * 
	 * @param z, Zahl die dividiert wird (Zähler)
	 * @param n, Zahl durch die dividiert wird (Nenner)
	 * @return z / n
	 */
	public static int div(int z, int n) {
		try {
			return z / n;
		} catch (ArithmeticException e) {
			System.err.println("Fehlergrund: \"" + e.getLocalizedMessage() + "\"");
			e.printStackTrace();
			return Integer.MAX_VALUE;
		}
	}
}
