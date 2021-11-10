package k02_simpleprg;

public class Fahrenheit1 {
    /**
     * Geg.:   Einige Temperaturen in °F <br/>
     * Ges.:   Temperaturen in °C
     * @param  args unused
     */
    public static void main(String[] args) {
     	
    	final int F100  = 100; // Fester Wert von Interesse
    	
    	int celsius = 5 * (F100 - 32) / 9;
    	System.out.println(celsius);

   }
}
