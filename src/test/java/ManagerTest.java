import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ManagerTest {

	@Test
	public void testSalaire() {
		Manager m1 = new Manager(10);

		assertEquals(m1.salaire(), 2500.0, 0);
	}

}
