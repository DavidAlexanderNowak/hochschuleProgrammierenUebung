package blatt06;

import java.util.Arrays;

public class ArrayStatistik {

	private static final int[] zahlenListe = { 35, 7, 90, 26, 92, 54, 24, 65//
			, 2, 67, 43, 26, 80, 92, 7, 40, 67, 66, 31, 45, 7, 100, 96, 93, 12//
			, 20, 57, 22, 62, 51 };

	private static final double[][] versicherungsSchaden = { new double[] { 0.0, 74.4 }//
			, new double[] { 350.0, 18.2 }, new double[] { 1500.0, 6.1 }//
			, new double[] { 5000.0, 1.3 } };

	public static void main(String[] args) {

		// Arithmetischer Mittelwert
		System.out.println("Arithmetischer Mittelwert: " + arithmetischerMittelwert(zahlenListe));

		// Minimaler Wert, Maximaler Wert
		System.out.println("Minimalwert: " + minimalWert(zahlenListe) + ", Maximalwert: " + maximalWert(zahlenListe));

		// Median
		System.out.println("Median: " + median(zahlenListe));

		// Versicherungstabelle Erwartungswert
		System.out.println("Erwartungswert: " + erwartungswert(versicherungsSchaden));
	}

	private static double arithmetischerMittelwert(int[] zahl) {
		int summeAllerZahlen = 0;
		for (int i = 0; i < zahl.length; i++) {
			summeAllerZahlen += zahl[i];
		}
		return (double) summeAllerZahlen / zahl.length;
	}

	private static int minimalWert(int[] zahl) {
		int minimalWert = zahl[0];
		for (int i = 0; i < zahl.length; i++) {
			minimalWert = Math.min(minimalWert, zahl[i]);
		}
		return minimalWert;
	}

	private static int maximalWert(int[] zahl) {
		int maximalWert = zahl[0];
		for (int i = 0; i < zahl.length; i++) {
			maximalWert = Math.max(maximalWert, zahl[i]);
		}
		return maximalWert;
	}

	private static double median(int[] zahl) {
		Arrays.sort(zahl);
		if (zahl.length % 2 == 0) {
			int mittlereZahlen = zahl[zahl.length / 2 - 1] + zahl[zahl.length / 2];
			return (double) mittlereZahlen / 2;
		} else {
			return zahl[zahl.length / 2];
		}
	}

	private static double erwartungswert(double[][] zahlenPaar) {
		double erwartungswert = 0;
		for (int i = 0; i < zahlenPaar.length; i++) {
			erwartungswert += zahlenPaar[i][0] * 0.01 * zahlenPaar[i][1];
		}
		return erwartungswert;
	}
}
