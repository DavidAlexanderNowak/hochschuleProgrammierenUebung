package blatt05;

import java.util.Objects;

/** Beispiel f�r Referenzen: Klasse f�r Mitarbeiter-Raumzuordnung */
public class Raumzuordnung {
	private Raum raum;
	private Person nutzer;
	private String zuordnungsGrund;

	/** Konstruktor */
	public Raumzuordnung(Raum raum, Person nutzer) {
		Objects.requireNonNull(raum);
		Objects.requireNonNull(nutzer);
		this.raum = raum;
		this.nutzer = nutzer;
	}

	public Raumzuordnung(Raum raum, Person nutzer, String zuordnungsGrund) throws IllegalArgumentException {
		this(raum, nutzer);
		Objects.requireNonNull(zuordnungsGrund);
		if (zuordnungsGrund.length() >= 3) {
			this.zuordnungsGrund = zuordnungsGrund;
		} else {
			throw new IllegalArgumentException("Zuordnungsgrund muss mindestens drei Zeichen lang sein!");
		}
	}

	public void print() {
		this.getNutzer().print();
		System.out.print(" nutzt den Raum: ");
		this.getRaum().print();
		System.out.println(" als " + this.zuordnungsGrund);
	}

	Raum getRaum() {
		return this.raum;
	}

	Person getNutzer() {
		return this.nutzer;
	}

	public String getZuordnungsGrund() {
		return zuordnungsGrund;
	}

	public void setZuordnungsGrund(String zuordnungsGrund) throws Exception {
		try {
			if (zuordnungsGrund.length() >= 3) {
				this.zuordnungsGrund = zuordnungsGrund;
			} else {
				throw new Exception("Nutzungsgrund muss mindestens drei Zeichen lang sein!");
			}
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] a) throws Exception {
		// Br�ckl nutzt den Raum E 212a
		Person ub = new Person("Ulrich", "Br�ckl");
		Raum e212a = new Raum("e 212a", 2);
		Raumzuordnung ub2e212a = new Raumzuordnung(e212a, ub, "Büro");
		ub2e212a.print();

		// Br�ckl nutzt au�erdem den Raum E 201
		Raumzuordnung ub2e201 = new Raumzuordnung(new Raum("e 201", 77, true), // keine Zwischenvariable f�r e201
																				// n�tig...
				ub, "Büro");
		// Den Raum dieser Zuordnung ausgeben:
		System.out.print("\n     Au�erdem: ");
		ub2e201.getRaum().print();
		System.out.println("\n");

		// Vogelsang nutzt den Raum E 209
		Raumzuordnung hv2e209 = new Raumzuordnung(new Raum("e 209", 3), new Person("Holger", "Vogelsang"));
		hv2e209.print();

	}

}