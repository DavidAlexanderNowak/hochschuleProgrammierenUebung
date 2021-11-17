package blatt05;

/** "Normale" Klasse f�r R�ume, mit Konstruktoren, Settern und Gettern */
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
	 * K�rzel aus K�rzel f�r Geb�udenamen und Raumnummer bauen
	 * 
	 * @param gebaeudeKuerzel K�rzel des Geb�udes, z.B. "E", "F", "SH", "LI"
	 * @param anzahlPlaetze   Anzahl der Pl�tze in diesem Raum
	 */
	Raum(String gebaeudeKuerzel, int raumnummer, int anzahlPlaetze) {
		this.setKuerzel(gebaeudeKuerzel + " " + raumnummer);
		this.setAnzahlPlaetze(anzahlPlaetze);
	}

	/** Einen Raum am Bildschirm ausgeben */
	public void print() {
		System.out.print("K�rzel: " + this.getKuerzel());
		System.out.print(", Pl�tze: " + this.getAnzahlPlaetze());
		System.out.print(", Pl�tze bei Klausur: " + this.getAnzahlPlaetzeBeiKlausur());
		if (this.hatAudio) {
			System.out.print(", mit Audio");
		} else {
			System.out.print(", ohne Audio");
		}
	}

	/** Anzahl der Pl�tze setzen */
	public void setAnzahlPlaetze(int plaetze) {
		final int MINIMUM = 1;
		final int MAXIMUM = 100;
		if (plaetze < MINIMUM) {
			System.err.println("Die Anzahl der Pl�tze muss gr��er als " + (MINIMUM - 1) + " sein.");
		} else if (plaetze > MAXIMUM) {
			System.err.println("Die Anzahl der Pl�tze darf nicht gr��er als " + MAXIMUM + " sein.");
		} else {
			this.anzahlPlaetze = plaetze;
		}
	}

	/** Anzahl der Pl�tze zur�ckgeben */
	public int getAnzahlPlaetze() {
		return this.anzahlPlaetze;
	}

	/** Anzahl der Pl�tze bei Klausuren zur�ckgeben */
	public int getAnzahlPlaetzeBeiKlausur() {
		int freiePlaetzeJePruefling = 2;
		return this.getAnzahlPlaetze() / (1 + freiePlaetzeJePruefling);
	}

	/** K�rzel setzen */
	public void setKuerzel(String kuerzel) {
		final int MINIMALE_ANZAHL_ZEICHEN = 2;
		if (null == kuerzel) {
			System.err.println("Das K�rzel darf nicht null sein!");
		} else if (kuerzel.length() < MINIMALE_ANZAHL_ZEICHEN) {
			System.err.println("Das K�rzel muss mindestens " + MINIMALE_ANZAHL_ZEICHEN + " Zeichen haben!");
		} else {
			this.kuerzel = kuerzel;
		}

	}

	/**
	 * Konvention: K�rzel nur in Gro�buchstaben
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