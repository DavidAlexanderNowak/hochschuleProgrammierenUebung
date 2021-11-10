package k02_simpleprg;

public class Sporttabelle {

	public static void main(String[] args) {
		// geg.: Startjahr, Anzahl Jahre

		// ges.: Tabelle, ob Groﬂsportereignis ist.
		// Nutzen sie bitte den %-Operator, um festzustellen,
		// ob eine Jahreszahl gerade ist.

		int startYear = 2018;
		int numberOfYears = 10;

		for (int i = startYear; i <= startYear + numberOfYears; i++) {
			if (i % 4 == 0) {
				System.out.println(i + " gibt es eine Sommerolympiade");
			} else if (i % 4 == 2) {
				System.out.println(i + " gibt es eine Herren-Fuﬂballweltmeisterschaft");
			} else if (i % 4 == 3) {
				System.out.println(i + " gibt es eine Damen-Fuﬂballweltmeisterschaft");
			}
		}
	}
}
