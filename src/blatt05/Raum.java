package blatt05;

/** "Normale" Klasse für Räume, mit Konstruktoren, Settern und Gettern */
public class Raum {
	private String kuerzel;
	private int anzahlPlaetze; // wie viele Personen passen rein?
	private boolean hatAudio;

	public Raum(String kuerzel, int anzahlPlaetze) {
		this.setKuerzel(kuerzel);
		this.setAnzahlPlaetze(anzahlPlaetze);
	}

	public Raum(String kuerzel, int anzahlPlaetze, boolean hatAudio) {
		this(kuerzel, anzahlPlaetze);
		this.hatAudio = hatAudio;
	}

	/**
	 * Kürzel aus Kürzel für Gebäudenamen und Raumnummer
	 * bauen
	 * 
	 * @param gebaeudeKuerzel Kürzel des Gebäudes, z.B. "E", "F", "SH", "LI"
	 * @param anzahlPlaetze   Anzahl der Plätze in diesem Raum
	 */
	Raum(String gebaeudeKuerzel, int raumnummer, int anzahlPlaetze) {
		this.setKuerzel(gebaeudeKuerzel + " " + raumnummer);
		this.setAnzahlPlaetze(anzahlPlaetze);
	}

	/** Einen Raum am Bildschirm ausgeben */
	public void print() {
		System.out.print("Kürzel: " + this.getKuerzel());
		System.out.print(", Plätze: " + this.getAnzahlPlaetze());
		System.out.print(", Plätze bei Klausur: " + this.getAnzahlPlaetzeBeiKlausur());
		if (this.hatAudio) {
			System.out.print(", mit Audio");
		} else {
			System.out.print(", ohne Audio");
		}
	}

	/** Anzahl der Plätze setzen */
	public void setAnzahlPlaetze(int plaetze) {
		final int MINIMUM = 1;
		int maximum = 100;//TODO Was ist das maximum? 100 als Platzhalter erstmal
		if (plaetze < MINIMUM) {
			System.err.println("Die Anzahl der Plätze muss größer als " + (MINIMUM - 1) + " sein.");
		}/*TODO Prüfung gegen Maximum*/else if (plaetze > maximum) {
			System.err.println("Die Anzahl der Plätze darf nicht größer als " + maximum + " sein.");
		} else {
			this.anzahlPlaetze = plaetze;
		}
	}

	/** Anzahl der Plätze zurückgeben */
	public int getAnzahlPlaetze() {
		return this.anzahlPlaetze;
	}

	/** Anzahl der Plätze bei Klausuren zurückgeben */
	public int getAnzahlPlaetzeBeiKlausur() {
		int freiePlaetzeJePruefling = 2;
		return this.getAnzahlPlaetze() / (1 + freiePlaetzeJePruefling);
	}

	/** Kürzel setzen */
	public void setKuerzel(String kuerzel) {
		final int MINIMALE_ANZAHL_ZEICHEN = 2;
		if (null == kuerzel) {
			System.err.println("Das Kürzel darf nicht null sein!");
		} else if (kuerzel.length() < MINIMALE_ANZAHL_ZEICHEN) {
			System.err.println("Das Kürzel muss mindestens " + MINIMALE_ANZAHL_ZEICHEN + " Zeichen haben!");
		} else {
			this.kuerzel = kuerzel;
		}

	}

	/**
	 * Konvention: Kürzel nur in Großbuchstaben
	 */
	public String getKuerzel() {
		return this.kuerzel.toUpperCase();
	}

	public void setHatAudio(boolean hatAudio) {
		this.hatAudio = hatAudio;
	}

	public boolean getHatAudio() {
		return this.hatAudio;
	}

	public static void main(String[] a) {
		Raum raum = new Raum("LI", 136, 21);
		raum.setHatAudio(true);
		raum.print();
	}

}