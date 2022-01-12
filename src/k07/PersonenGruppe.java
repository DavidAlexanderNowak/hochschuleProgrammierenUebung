package k07;

import k04_types.Person;

public class PersonenGruppe {
	String name;
	Person[] persons;

	public static void main(String[] args) {
		Person s1 = new Person("Lea", "Mai");
		Person s2 = new Person("Tin", "Hug");
		Person s3 = new Person("Ben", "Bär");

		PersonenGruppe infGrp = new PersonenGruppe("Inf1Lab", s1);
		PersonenGruppe tiGrp = new PersonenGruppe("TI_LABOR", s1, s3, s2);

		infGrp.print();
		tiGrp.print();
	}

	public PersonenGruppe(String name, Person... persons) {
		this.name = name;
		this.persons = persons;
	}

	public void print() {
		System.out.println("Gruppe: " + this.name);
		for (Person s : this.persons) {
			s.print();
		}
		System.out.println();
	}

}
