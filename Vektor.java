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
	private int x;
	/**
	 * y entspricht den Wert der Vertikalen Ebene
	 */
	private int y;
	/**
	 * laenge entspricht wie lang ein Vektor ist.
	 */
	private double laenge;
	/**
	 * winkel entspricht in welche Richtung der Vektor geht.
	 */
	private double winkel;
	/**
	 * NULLPUNKT entspricht den Konstanten Ursprung.
	 */
	public static final float NULLPUNKT = 0.0f;

	/**
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
	public Vektor(int x, int y, double winkel)throws IllegalArgumentException{
		this(x, y);
		if(){

		}
		laenge = Math.sqrt(x * x + y * y);

	}
}
