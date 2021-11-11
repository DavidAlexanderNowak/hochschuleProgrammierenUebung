package blatt05;

public class Bauer {
	private String name;
	private int numFedChicken;

	public Bauer(String name) {
		this.name = name;
	}
	
	public void feed(Huhn huhn) {
		if(huhn.isHungry()) {
			huhn.setHungry(false);
			numFedChicken++;
		}
	}
	
	public void callChicken(Huhn huhn) {
		System.out.println(huhn.getName());
	}
	
	public int calculateNumberOfHungryChickens() {
		return Huhn.getNumChicken()-numFedChicken;
	}
}
