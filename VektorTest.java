package mathematik;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VektorTest {
	public static Vektor vik = new Vektor(84.21, 21.53);
	public static Vektor vik2 = new Vektor(32.21, 321.32);

	@Test
	public void ausgabe() {
		System.out.println(vik.toString());
		System.out.println(vik2.toString());
	}

	/**
	 * Überprüft ob ein Konstruktor mit den akzeptierten Werten richtig ein Objekt erstellt.
	 */
	@Test
	public void konstruktorFirstNormalFall(){

	}

	/**
	 * Überprüft ob ein Objekt mit null erstellt werden kann.
	 * Erwartet: Nein.
	 */
	@Test
	public void konstruktorFirstSadFallNull(){

	}

	/**
	 * Überprüft ob bestimmte Werte nicht eingesetzt werden können
	 * Erwartet: Nein.
	 */
	@Test
	public void konstruktorFirstSadFallIllegal(){

	}

	/**
	 * Überprüft ob der Konstruktor mit Länge und Winkel, die gewünschten Werte annehmen tut und ein Objekt erstellt.
	 * Erwartet: Ja.
	 */
	@Test
	public void konstruktorSecondNormalFall(){

	}

	/**
	 * Überprüft ob man mit null ein Objekt erstellen kann (Beide Werte)
	 * Erwartet: Nein.
	 */
	@Test
	public void konstruktorSecondSadFallNull(){

	}
	/**
	 * Überprüft ob man mit null Länge festlegen kann.
	 * Erwartet: Nein.
	 */
	@Test
	public void konstruktorSecondSadFallNullLaenge(){

	}
	/**
	 * Überprüft ob man mit null Winkel initialisieren kann
	 * Erwartet: Nein.
	 */
	@Test
	public void konstruktorSecondSadFallNullWinkel(){

	}

	/**
	 * Überprüft ob man einen falschen DT verwenden kann.
	 * Erwartet: Nein.
	 */
	@Test
	public void konstruktorSecondSadFallIllegalDT(){

	}
	/**
	 * Überprüft ob man falsche Werte annehmen tut..
	 * Erwartet: Nein.
	 */
	@Test
	public void konstruktorSecondSadFallIllegal(){

	}

	/**
	 * Überprüft Ob Man Objekte ganz normal addieren kann und die richtigen Werte rauskommen
	 * Erwartet: JA.
	 */
	@Test
	public void additionNormallFall() {
		System.out.println(vik.addieren(vik2));
	}
	/**
	 * Überprüft Ob das aufrufende Objekt null sein kann.
	 * Erwartet: Nein.
	 */
	@Test
	public void additionSadFallNull() {

	}
	/**
	 * Überprüft Ob das param Objekt null sein kann.
	 * Erwartet: Nein.
	 */
	@Test
	public void additionSadFallIllegalNull2() {

	}
	/**
	 * Überprüft ob ein richtig funktionierender Vektor den richtig Skalar Wert zurückgibt.
	 * Erwartet: Ja.
	 */
	@Test
	public void skalarNormalFall() {
		System.out.println(vik.skalarprodukt(vik2));
	}
	/**
	 * Überprüft ob ein Objekt mit null übergeben werden kann.
	 * Erwartet: Nein.
	 */
	@Test
	public void skalarSadFallNull() {

	}
	@Test
	public void skalarSadFallIllegal() {

	}

	@Test
	public void orthogonalEinheitsvektorNormallFall() {
		System.out.println(vik.orthogonalerEinheitsvektor());
	}
	@Test
	public void orthogonalEinheitsvektorSadFallNull() {

	}
	@Test
	public void orthogonalEinheitsvektorSadFallIllegal() {

	}
}