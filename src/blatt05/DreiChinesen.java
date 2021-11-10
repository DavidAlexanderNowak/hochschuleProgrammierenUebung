package blatt05;

public class DreiChinesen {

	private static String kontrabassLiedStrophe = "Drei Chinesen mit dem Kontrabass\nsaﬂen auf der Straﬂe und erz‰hlten sich was.\nDa kam ein Mann: Ja was ist denn das?\nDrei Chinesen mit dem Kontrabass.";

	public static void main(String[] args) {
		
		printCentered(changeVowels(kontrabassLiedStrophe,"i"));
	}

	private static void printCentered(String textToPrint) {
		String separator = "\n";
		String[] textPart = textToPrint.split(separator);
		int longestLineLength = 0;
		for (int i = 0; i < textPart.length; i++) {
			if (longestLineLength < textPart[i].length()) {
				longestLineLength = textPart[i].length();
			}
		}
		for (int i = 0; i < textPart.length; i++) {
			for (int j = 0; j < longestLineLength - textPart[i].length(); j++) {
				textPart[i] = " " + textPart[i];
			}
			System.out.println(textPart[i]);
		}
	}
	
	private static String changeVowels(String textToChange, String newVowel) {
		return textToChange.replaceAll("[aeiou]", newVowel);
	}
}
