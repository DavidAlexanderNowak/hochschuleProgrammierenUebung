	
	// Datei Fahrenheit4.java
	package blatt02;
	
	public class Fahrenheit4 {
		private static final int NUM_PER_ROW = 5;

		/**
		 * Geg.: Temperaturbereich in °F <br/>
		 * Ges.: Temperaturliste in °C
		 * 
		 * @param args
		 *            unused
		 */
		public static void main(String[] args) {
	
			final int UPPER = 250; // obere Grenze
			final int LOWER =   0; // untere Grenze
			final int STEP  =  25; // Schrittweite
	
			for (int fahrenheit = LOWER; fahrenheit <= UPPER; fahrenheit = fahrenheit + STEP )
				//    Initialisierung  ; Bedingung          ; Fortsetzung: Schleifenvariable erhoehen			
			{
				if(fahrenheit%(STEP*NUM_PER_ROW) == 0) {
					System.out.println();
				}
				int celsius = 5 * (fahrenheit - 32) / 9;
				System.out.print(fahrenheit + "°F = " + celsius + "°C" + "   ");
			}
		}
	}

	