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
	 * betrag entspricht wie lang ein Vektor ist.
	 */
	private double betrag;
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
	public Vektor(double x, double y)throws IllegalArgumentException{ // Hier muss ich mir einen anderen Weg ausdenken.
		if(x == 0 && y == 0){
			throw new IllegalArgumentException("x und y dürfen nicht gleichzeitig beide 0 sein!");
		}
		this.x = x;
		this.y = y;
		setBetrag(Math.sqrt(x * x + y * y));
		setWinkel(Math.toDegrees(Math.atan2(y, x)));
	}

	/**
	 * Überladener Konstruktor die Länge des Vektors entgegen nimmt, x und y berechnet und ein neues Winkel Objekt erstellt.
	 * @param betrag
	 * @param winkel
	 */
	public Vektor(double betrag , Winkel winkel)throws NullPointerException{
		if(winkel == null){
			throw new NullPointerException("Winkel Objekt kann nicht null sein!");
		}
		this.winkel = winkel;
		this.x = betrag * Math.cos(winkel.getWinkelImBogenmass());
		this.y = betrag * Math.sin(winkel.getWinkelImBogenmass());
		this.betrag = betrag;
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public void setBetrag(double betrag) {
		this.betrag = betrag;
	}

	public void setWinkel(double winkelInGrad) {
		this.winkel = new Winkel(winkelInGrad);
	}
	public void setWinkel(Winkel winkle) { // Hier muss ich nochmal kontrollieren, ob es ein guter Programmierstil ist.
		this.winkel = winkel;
	}

	public double getX(){
		return x;
	}

	public double getY() {
		return y;
	}

	public double getBetrag() {
		return betrag;
	}

	public Winkel getWinkel() {
		return winkel;
	}

	public Vektor addieren(Vektor v)throws NullPointerException{
		if(v == null){
			throw new NullPointerException("Der Vektor in den Parametern darf nicht null sein!");
		}
		Vektor vektor2 = new Vektor(this.x + v.x, this.y + v.y);
		vektor2.setBetrag(Math.sqrt(vektor2.x * vektor2.x + vektor2.y * vektor2.y));
		vektor2.setWinkel(winkel.addieren(v.getWinkel()));
		return vektor2;
	}

	public double skalarprodukt(Vektor v){
		return (this.x * v.x) + (this.y * v.y);
	}
	public Vektor orthogonalerEinheitsvektor(){
		double x_orthogonal = this.y / this.betrag;
		double y_orthogonal = -(this.x / this.betrag);

		Vektor orthogonal = new Vektor(x_orthogonal, y_orthogonal);
		orthogonal.setBetrag(Math.sqrt(x_orthogonal * x_orthogonal + y_orthogonal * y_orthogonal));

		Winkel orthogonalWinkel = new Winkel(Math.toDegrees(Math.atan2(y_orthogonal, x_orthogonal)));
		orthogonal.setWinkel(orthogonalWinkel);

		return orthogonal;
	}
	public String toString(){
		return "/////////////////////" + "\n x: " + this.x + "\n y: " + y + "\n Betrag: " + this.betrag + "\n Winkel: " + this.winkel;
	}
}
