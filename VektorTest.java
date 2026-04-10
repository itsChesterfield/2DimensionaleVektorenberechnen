package mathematik;
import org.junit.jupiter.api.BeforeEach;
import org.testng.annotations.Test;

public class VektorTest {
	public static Vektor vik;
	@BeforeEach
	public void objektErstellen(){
		vik.setWinkel(321.2)
	}
	@Test
	public String toString(){
		Vektor vik2 = vik;
		System.out.println(vik2.toString());
		return null;
	}
}
