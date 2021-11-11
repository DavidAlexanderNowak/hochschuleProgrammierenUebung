package blatt05;

public class Huhn {
	private boolean hungry;
	private String name;
	private static int numChicken;


	public Huhn(String name) {
		this.name = name;
		hungry = true;
		numChicken++;
	}

	public void setHungry(boolean hungry) {
		this.hungry = hungry;
	}

	public String getName() {
		return name;
	}

	public static int getNumChicken() {
		return numChicken;
	}

	public boolean isHungry() {
		return hungry;
	}

	public static void setNumChicken(int numChicken) {
		Huhn.numChicken = numChicken;
	}
}
