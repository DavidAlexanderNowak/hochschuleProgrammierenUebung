package blatt05;

public class Control {

	public static void main(String[] args) {
		Bauer bauer = new Bauer("Walter");
		Huhn[] huhn = { new Huhn("Heidrun"), new Huhn("Heike"), new Huhn("Hannelore") };
		
		for(int i = 0; i<huhn.length;i++) {
			bauer.callChicken(huhn[i]);
			bauer.feed(huhn[i]);
		}
		System.out.println(bauer.calculateNumberOfHungryChickens());
	}
}
