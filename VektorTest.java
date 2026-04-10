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
	@Test
	public void konstruktorFirstNormalFall(){

	}
	@Test
	public void konstruktorFirstSadFallNull(){

	}
	@Test
	public void konstruktorFirstSadFallIllegal(){

	}
	@Test
	public void konstruktorSecondNormalFall(){

	}
	public void konstruktorSecondSadFallNull(){

	}
	public void konstruktorSecondSadFallIllegal(){

	}
	@Test
	public void additionNormallFall() {
		System.out.println(vik.addieren(vik2));
	}
	@Test
	public void additionSadFallNull() {

	}
	@Test
	public void additionSadFallIllegal() {

	}
	@Test
	public void additionSadFallIllegal2() {
	}
	@Test
	public void additionSadFallIllegal3() {

	}
	@Test
	public void skalarNormalFall() {
		System.out.println(vik.skalarprodukt(vik2));
	}
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