package k02_simpleprg;

public class Rechteck {

	public static void main(String[] args) {

		// geg.: Rechteck mit Länge = 7m, Breite = 3m
		// ges.: -Variablendefinitionen
		// -Initialisierung
		// -Berechnung von Umfang und Inhalt des
		// Rechtecks in entsprechenden Variablen

		double length = 7.0;
		double width = 3.0;

		double area;
		double circumference;

		area = length * width;
		circumference = length * 2 + width * 2;

		System.out.println("Ergebnis:\n");
		System.out.println("Daten des Rechtecks: " + length + "x" + width);
		System.out.println("Fläche: " + area);
		System.out.println("Umfang: " + circumference);
	}
}