package mathematik;

import trigonometrie.Winkel;

/**
 * Repräsentiert einen 2 Dimensionalen Vektor.
 * @Author Max Danigel.
 * @version 1.0
 */
public class Vektor {
	/**
	 * x entspricht den Wert der Horizontalen Ebene.
	 */
	private double x;
	/**
	 * y entspricht den Wert der Vertikalen Ebene
	 */
	private double y;
	/**
	 * laenge entspricht wie lang ein Vektor ist.
	 */
	private double laenge;
	/**
	 * winkel entspricht in welche Richtung der Vektor geht.
	 */
	private Winkel winkel;
	/**
	 * NULLPUNKT entspricht den Konstanten Ursprung.
	 */
	public static final float NULLPUNKT = 0.0f;

	/**
	 * Konstruktor der lediglich x und y initialisiert.
	 * @param x
	 * @param y
	 * @throws IllegalArgumentException damit x und y um zu verhindern das beide mit 0 belegt werden.
	 */
	public Vektor(int x, int y)throws IllegalArgumentException{
		if(x == 0 && y == 0){
			throw new IllegalArgumentException("x und y dürfen nicht beide 0 sein!");
		}
		this.x = x;
		this.y = y;
	}

	/**
	 * Überladener Konstruktor die Länge des Vektors entgegen nimmt, x und y berechnet und ein neues Winkel Objekt erstellt.
	 * @param laenge
	 * @param winkelGrad
	 * @param winkelGrad angegebener Grad wie der Winkel sein soll.
	 */
	public Vektor(double laenge ,double winkelGrad){
		this.x = laenge * Math.cos(winkel.getWinkelImBogenmass());
		this.y = laenge * Math.sin(winkel.getWinkelImBogenmass());
		this.laenge = laenge;
		this.winkel = new Winkel(winkelGrad);
	}
}
