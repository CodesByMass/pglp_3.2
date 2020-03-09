import static org.junit.Assert.*;

import org.junit.Test;

public class VendeurTest {

	@Test
	public void testSalaire() {
		Vendeur v1 = new Vendeur(10);

		assertEquals(v1.salaire(), 1510.0, 0);
	}

}
