package mathematik;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VektorTest {
	public static Vektor vik = new Vektor(32.21, 321.32);
	@BeforeEach
	public void objektErstellen(){

	}
	@Test
	public void ausgabe(){
		System.out.println(vik.toString());
	}
}
