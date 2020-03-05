import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class AppTest {

	@Test
	public void test() {
		vendeur v = new vendeur(10) ;
		vendeur v2 = new vendeur(20) ;
		employe e = new employe(2010) ;
		employe e2 = new employe(2005);
		ArrayList<allEmploye> listEmploye = new ArrayList <allEmploye>() ;
		listEmploye.add(e);
		listEmploye.add(e2) ;
		listEmploye.add(v);
		listEmploye.add(v2);
		double salaireTotal = 0 ;
		for (int i = 0; i < listEmploye.size(); i++) {
			salaireTotal += listEmploye.get(i).salaire();
		}
		
		System.out.println(" salaire total : "  +salaireTotal);
	}

}
