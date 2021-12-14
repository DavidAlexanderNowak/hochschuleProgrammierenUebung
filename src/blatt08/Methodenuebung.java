package blatt08;

public class Methodenuebung {

	public static void main(String[] args) {
		prt1234(4);
		System.out.println();
		prtSqr1234(4);
		System.out.println();
		prt2468(5);
		System.out.println();
		xxx(5);
		System.out.println();
		xxxIterative(5);
	}

	public static double absoluteValue(double number) {
		return Math.abs(number);
	}

	public static int roundUp(double number) {
		return ((int) number) + 1;
	}

	public static int roundDown(double number) {
		return (int) number;
	}

	public static boolean canDivide(double numberToDivide, double numberToDivideBy) {
		return numberToDivide % numberToDivideBy == 0;
	}

	public static double euclideanDistance(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow((y1 - y2), 2) + Math.pow((x1 - x2), 2));
	}

	public static double smallestNumber(double number1, double number2, double number3) {
		return Math.min(Math.min(number1, number2), number3);
	}

	public static int farbenWert(KartenFarbe kartenFarbe) {
		int farbenWert;
		switch (kartenFarbe) {
		case KARO:
			farbenWert = 9;
			break;
//			return 9;
		case HERZ:
			farbenWert = 10;
			break;
//			return 10;
		case PIK:
			farbenWert = 11;
			break;
//			return 11;
		default:
			farbenWert = 12;
//			return 12;
		}
		return farbenWert;
	}

	public static void prt1234(long n) {
		if (n > 1) {
			prt1234(n - 1);
		}
		System.out.print(n + ", ");
	}

	public static void prtSqr1234(long n) {
		if (n > 1) {
			prtSqr1234(n - 1);
		}
		System.out.print(n * n + ", ");
		// Rekursionstiefe ist n-1
	}

	public static void prt2468(long n) {
		if (n % 2 != 0) {
			prt2468(n - 1);
		} else {
			if (n > 2) {
				// Could check for even number here and then print (no need for so many ifs)
				prt2468(n - 2);
			}
			System.out.print(n + ", ");
		}
	}

	public static void xxx(long n) {
		if (n > 0L) {// Rekursionsbasis
			System.out.println(n);
			xxx(n - 1);
		} else {// Rekursionsfortsetzung
		}
	}

	public static void xxxIterative(long n) {
		for (; n > 0L; n--) {
			System.out.println(n);
		}
	}
}
