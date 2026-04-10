package mathematik;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VektorTest {
	public static Vektor vik = new Vektor(84.21, 21.53);
	public static Vektor vik2 = new Vektor(32.21, 321.32);
	@Test
	public void ausgabe(){
		System.out.println(vik.toString());
		System.out.println(vik2.toString());
	}
	@Test
	public void addition(){
		System.out.println(vik.addieren(vik2));
	}
}
