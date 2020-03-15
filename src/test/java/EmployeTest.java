import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeTest {

  @Test
  public void testSalaire() {
    Employe e1 = new Employe(2018);

    assertEquals(e1.salaire(), 1540.0, 0);
  }
}
