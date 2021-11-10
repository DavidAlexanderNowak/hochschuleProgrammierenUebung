package blatt04;

import java.awt.*;
import javax.swing.JFrame;

/**
 * Klasse für das Zeichnen eines Sterns
 */
public class LoesungStern extends JFrame {

	private static final int NUM_RANDOM_STARS = 60;
	private static final int NUM_LINES = 40;
	private static final int NUM_SPIRAL_STARS = 15;
	private static int MID_X;
	private static int MID_Y;

	/** Konstruktor. Nichts zu ändern hier */
	public LoesungStern() {
		super();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(600, 400);
		this.setTitle("Lösung in der Klasse " + this.getClass().getName());
		this.setVisible(true);
		MID_X = (int) (this.getWidth() / 2.0);
		MID_Y = (int) (this.getHeight() / 2.0);
	}

	/** Main-Methode. Nichts zu ändern hier. */
	public static void main(String[] args) {
		new LoesungStern();
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

		this.meinStern(g); // Aufruf der selbst programmierten Methode
	}

	/**
	 * Hier bitte die Lösung, um den Stern zu zeichnen
	 * 
	 */
	private void meinStern(Graphics g) {
		spiralenSterne(g);

//		meineZufallsSterne(g);

//		int radius = (int) (this.getHeight() / 4.0);
//		int xMid = (int) (this.getWidth() / 2.0);
//		int yMid = (int) (this.getHeight() / 2.0);
//
//		zeichneEinenStern(g, xMid, yMid, radius);

//		for (int i = 0; i < NUM_LINES; i++) {
//			double phi = i * 2 * Math.PI / NUM_LINES;
//			if (i % 2 == 0) {
//				g.setColor(Color.BLUE);
//				radius = (int) (this.getHeight() / 4.0);
//			} else {
//				g.setColor(Color.RED);
//				radius = (int) (this.getHeight() / 8.0);
//			}
//			int x = xMid + (int) (radius * Math.cos(phi));
//			int y = yMid + (int) (radius * Math.sin(phi));
//			g.drawLine(xMid, yMid, x, y);
//		}
	}

	private void zeichneEinenStern(Graphics g, int midX, int midY, int radius) {

		int y;
		int x;

		int adjustedRadius = 0;

		for (int i = 0; i < NUM_LINES; i++) {
			double phi = i * 2 * Math.PI / NUM_LINES;
			if (i % 2 == 0) {
				g.setColor(Color.BLUE);
				adjustedRadius = radius;
			} else {
				g.setColor(Color.RED);
				adjustedRadius = (int) (radius / 2.0);
			}
			x = midX + (int) (adjustedRadius * Math.cos(phi));
			y = midY + (int) (adjustedRadius * Math.sin(phi));
			g.drawLine(midX, midY, x, y);
		}

	}

	private void meineZufallsSterne(Graphics g) {
		for (int i = 0; i < NUM_RANDOM_STARS; i++) {
			int x = (int) (Math.random() * this.getWidth());
			int y = (int) (Math.random() * this.getHeight());
			int radius = (int) (Math.random() * (this.getHeight() / 4.0));
			zeichneEinenStern(g, x, y, radius);
		}
	}

	private void spiralenSterne(Graphics g) {
		int x;
		int y;
		int radius = (int) (this.getHeight() / 4.0);
		int spiralRadius = (int) (this.getHeight() / 2.0);
		int radiusShrinkStep = (int) (this.getHeight()/4.0/NUM_SPIRAL_STARS);
		for (int i = 1; i <= NUM_SPIRAL_STARS; i++) {
			double phi = i * 2 * Math.PI / NUM_SPIRAL_STARS;
			x = (int) (MID_X + spiralRadius/phi * Math.cos(phi));
			y = (int) (MID_Y + spiralRadius/phi * Math.sin(phi));
			radius = (int) (radius - radiusShrinkStep);
			zeichneEinenStern(g, x, y, radius);
		}
	}

}