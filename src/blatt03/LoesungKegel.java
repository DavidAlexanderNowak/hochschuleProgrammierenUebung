package blatt03;

import java.awt.*;
import javax.swing.JFrame;

/**
 * Klasse, um ein Raster zu malen
 */
public class LoesungKegel extends JFrame {

	private static final int NUM_LINES = 40;

	/** Konstruktor. Nichts zu ändern hier */
	public LoesungKegel() {
		super();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(610, 417);
		this.setTitle("Lösung in der Klasse " + this.getClass().getName());
		this.setVisible(true);
	}

	/** Main-Methode. Nichts zu ändern hier. */
	public static void main(String[] args) {
		new LoesungKegel();
	}

	/**
	 * Paint-Methode. Nichts zu ändern hier. Diese Methode wird beim Öffnen des
	 * Fensters automatisch aufgerufen. Die Methode wird auch aufgerufen, wenn die
	 * Größe des Fensters verändert wird.
	 * 
	 * @param g Grafik, auf die gezeichnet wird.
	 */
	public void paint(Graphics g) {
		/* Löschen des Fensterinhalts (wichtig bei erneutem Zeichnen): */
		g.clearRect(0, 0, this.getWidth(), this.getHeight());

		this.meinKegel(g); // Aufruf der selbst programmierten Methode
	}

	/**
	 * Hier bitte die Lösung, um den Kegel zu zeichnen
	 * 
	 */
	public void meinKegel(Graphics g) {
		g.setColor(Color.BLACK);

		int minHeight = (int) (this.getHeight() * 0.25);
		int maxHeight = (int) (this.getHeight() * 0.75);
		int minWidth = (int) (this.getWidth() * 0.25);
		int maxWidth = (int) (this.getWidth() * 0.75);
		double xStep = (this.getWidth() * 0.5) / (NUM_LINES - 1);
		double xTop;
		double xBottom;

		g.drawLine(minWidth, minHeight, maxWidth, minHeight);
		g.drawLine(minWidth, maxHeight, maxWidth, maxHeight);
		g.drawLine(minWidth, minHeight, maxWidth, maxHeight);
		g.drawLine(maxWidth, minHeight, minWidth, maxHeight);
		
		g.setColor(Color.LIGHT_GRAY);
		for (int i = 1; i < NUM_LINES-1; i++) {
			xTop = minWidth + i*xStep;
			xBottom = maxWidth - i*xStep;
			
			g.drawLine((int)xTop, minHeight, (int)xBottom, maxHeight);
			
		}

	}
}