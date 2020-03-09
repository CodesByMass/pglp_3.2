import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AppTest {

	@Before
	public void setUp() {
		App.listeEmploye.clear();
	}

	@Test
	public void testOCP() {
		Employe e = new Employe(2010);
		assertTrue(App.listeEmploye.contains(e));
	}

	@Test
	public void testTotalSalaire() {
		new Vendeur(10);
		new Vendeur(20);
		new Employe(2010);
		new Employe(2005);
		System.out.println(App.calculerTotalSalaire());
		assertEquals(App.calculerTotalSalaire(), 6530.0, 0);
	}

}
