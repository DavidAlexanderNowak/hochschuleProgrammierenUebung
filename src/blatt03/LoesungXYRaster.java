package blatt03;

import java.awt.*;
import javax.swing.JFrame;

/**
 * Klasse, um ein Raster zu malen
 */
public class LoesungXYRaster extends JFrame {

	private static final int NUM_LINES = 11;

	/** Konstruktor. Nichts zu �ndern hier */
	public LoesungXYRaster() {
		super();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(604, 417);
		this.setTitle("L�sung in der Klasse " + this.getClass().getName());
		this.setVisible(true);
	}

	/** Main-Methode. Nichts zu �ndern hier. */
	public static void main(String[] args) {
		new LoesungXYRaster();
	}

	/**
	 * Paint-Methode. Nichts zu �ndern hier. Diese Methode wird beim �ffnen des
	 * Fensters automatisch aufgerufen. Die Methode wird auch aufgerufen, wenn die
	 * Gr��e des Fensters ver�ndert wird.
	 * 
	 * @param g Grafik, auf die gezeichnet wird.
	 */
	public void paint(Graphics g) {
		/* L�schen des Fensterinhalts (wichtig bei erneutem Zeichnen): */
		g.clearRect(0, 0, this.getWidth(), this.getHeight());

		this.meinRaster(g); // Aufruf der selbst programmierten Methode
	}

	/**
	 * Hier bitte die L�sung, um das Raster zu zeichnen
	 * 
	 */
	public void meinRaster(Graphics g) {
		double x = 0;
		double y = 0;

		double minHeight = this.getHeight() * 0.25;
		double maxHeight = this.getHeight() * 0.75;
		double minWidth = this.getWidth() * 0.25;
		double maxWidth = this.getWidth() * 0.75;
		double xStep = (this.getWidth() * 0.5) / (NUM_LINES - 1);
		double yStep = (this.getHeight() * 0.5) / (NUM_LINES - 1);

		for (int i = 0; i < NUM_LINES; i++) {
			if (i % 2 == 0) {
				g.setColor(Color.BLACK);
			} else {
				g.setColor(Color.GRAY);
			}
			x = minWidth + xStep * i;
			g.drawLine((int) x, (int) minHeight, (int) x, (int) maxHeight);
			y = minHeight + yStep * i;
			g.drawLine((int) minWidth, (int) y, (int) maxWidth, (int) y);
		}
	}
}
