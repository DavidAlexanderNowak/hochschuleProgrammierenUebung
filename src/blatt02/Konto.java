package blatt02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Konto {
	private static double zins = 2.0;
	private static double guthaben = 0.0;
	private static double sparziel = 100_000.0;
	private static int jahreBisSparziel = 1;
	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static final double ERHOEHUNG_1000_EURO = 1000.0;
	private static String input;

	public static void main(String[] args) throws IOException {
		System.out.println("Bitte entscheiden Sie welche der folgenden Berechnungen Sie ausf�hren m�chten: ");
		System.out.println("1) Sparplan mit Zinseszins");
		System.out.println("2) Sparplan ohne Zinseszins");
		System.out.println("3) Erforderliche Dauer eines Sparziels mit Zinseszins");
		input = reader.readLine();
		
		switch (input) {
		case "1":
			tm1();
			break;
		case "2":
			tm2();
			break;
		case "3":
			tm3();
			break;
			default:
		}
	}
	private static void tm1() throws IOException {
		int jahre = 0;
		System.out.println("Geben sie ihr Startguthaben ein!");

		String input = reader.readLine();

		guthaben = Integer.parseInt(input);
		System.out.println("Ihr Startguthaben betr�gt nun " + guthaben + "�!");
		System.out.println("----------------------------------------------------------------");
		System.out.println("Geben sie ihren Zinssatz in % an!");

		input = reader.readLine();

		zins = Integer.parseInt(input);
		System.out.println("Ihr Jahreszinssatz betr�gt nun " + zins + "%");
		System.out.println("----------------------------------------------------------------");
		System.out.println("Geben sie ihre Laufzeit in Jahren an!");

		input = reader.readLine();

		jahre = Integer.parseInt(input);
		System.out.println("Ihre Laufzeit betr�gt nun " + jahre + "Jahre");
		System.out.println("----------------------------------------------------------------");
		System.out.println("Wollen sie ihr Guthaben in " + jahre + " Jahren mit einem \nZinssatz von " + zins
				+ "% und einem Startguthaben von " + guthaben + "� \nund einer j�hrlichen Extra-Einzahlung\nvon "
				+ ERHOEHUNG_1000_EURO + "� errechnen? Geben sie (y/n) ein!");

		input = reader.readLine();
		System.out.println("----------------------------------------------------------------");

		if (input.equals("n")) {
			System.out.println("Operation abgebrochen!");
			return;
		} else if (input.equals("y")) {
			for (int i = 1; i <= jahre; i++) {
				if (i == 1) {
					System.out.println("Ihr Guthaben in Jahr " + i + " betr�gt " + Math.round(guthaben) + "�"
							+ " Sie zahlen nun noch " + ERHOEHUNG_1000_EURO + "� ein.\n");
				} else {
					guthaben *= (1 + (0.01 * zins));
					guthaben += ERHOEHUNG_1000_EURO;
					System.out.println("Ihr Guthaben in Jahr " + i + " betr�gt " + Math.round(guthaben * 100.0) / 100.0
							+ "�" + " Sie haben noch " + ERHOEHUNG_1000_EURO + "� zus�tzlich eingezahlt!\n");
				}
			}
		}
	}

	private static void tm2() throws IOException {
		System.out.println("Startguthaben eingeben:");
		input = reader.readLine();
		guthaben = Double.parseDouble(input);

		System.out.println("Zinssatz eingeben:");
		input = reader.readLine();
		zins = Double.parseDouble(input);

		System.out.println("Laufzeit eingeben:");

		input = reader.readLine();
		double endeJahre = Double.parseDouble(input);
		double zinsErtrag;
		double gesamtZinsErtrag = 0;
		double jaehrlicherZusatz = 1000;

		System.out.println();

		for (int i = 1; i <= endeJahre; i++) {
			zinsErtrag = guthaben * (zins / 100);
			System.out.println("Guthaben mit Zins in Jahr " + i + " : " + (guthaben + gesamtZinsErtrag));
			guthaben += jaehrlicherZusatz;
			gesamtZinsErtrag += zinsErtrag;

		}
	}

	private static void tm3() throws IOException {
		System.out.print("Bitte geben Sie ihr Startguthaben ein: ");
		input = reader.readLine();
		guthaben = Double.parseDouble(input);

		System.out.print("Bitte geben Sie den Zinssatz (in %) ein: ");
		input = reader.readLine();
		zins = Double.parseDouble(input);

		System.out.print("Bitte geben Sie ihr Sparziel ein: ");
		input = reader.readLine();
		sparziel = Double.parseDouble(input);

		while (guthaben < sparziel) {
			guthaben *= (1.0 + (0.01 * zins));
			guthaben += ERHOEHUNG_1000_EURO;
			jahreBisSparziel++;
		}
		System.out.println("Guthaben nach dem " + jahreBisSparziel + ". Jahr: " + guthaben);
	}
}