package k02_simpleprg;

public class Zinstabelle {

	public static void main(String[] args) {
		// geg.: Vermögen, Zinssatz in %, Anzah Jahre
		// ges.: Tabelle mit Vermögen bei jährlicher Verzinsung

		double balance = 1000;
		double interest = 5;
		int numberOfYears = 5;

		for (int i = 0; i <= numberOfYears; i++) {
			System.out.println("Vermögen nach " + i + " Jahren: " + balance);
			balance = balance*(1.0+interest*0.01);
		}
	}
}
