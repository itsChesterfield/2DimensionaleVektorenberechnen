package mathematik;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VektorTest {
	public static Vektor vik;
	@BeforeEach
	public void objektErstellen(){
		vik.setY(21.23);
		vik.setX(43.83);
		vik.setWinkel(321.2);
		vik.setBetrag(45.1);
	}
	@Test
	public void ausgabe(){
		System.out.println(vik.toString());
	}
}
