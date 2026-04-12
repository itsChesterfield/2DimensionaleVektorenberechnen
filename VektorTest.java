package mathematik;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import trigonometrie.Winkel;

public class VektorTest {
	public static Winkel winkel = new Winkel(231.32);
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
		Vektor karli = new Vektor(32123.4214, 8219.392);
		System.out.println(karli.toString());
	}

	/**
	 * Überprüft ob ein Objekt zwei mal mit 0 Initialisiert werden kann.
	 * Erwartet: Nein.
	 */
	@Test
	public void konstruktorFirstSadFall0(){
		Vektor karli = new Vektor(0, 0);
		System.out.println(karli.toString());
	}
	/**
	 * Überprüft ob der Konstruktor mit Länge und Winkel, die gewünschten Werte annehmen tut und ein Objekt erstellt.
	 * Erwartet: Ja.
	 */
	@Test
	public void konstruktorSecondNormalFall(){
		Vektor karli = new Vektor(4321.21, winkel);
		System.out.println(karli.toString());
	}

	/**
	 * Überprüft ob man ein Winkel null übergeben kann
	 * Erwartet: Nein.
	 */
	@Test
	public void konstruktorSecondSadFallNull(){
		Winkel karli2 = null;
		Vektor karli3 = new Vektor(4321.21, karli2);
		System.out.println(karli3.toString());
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