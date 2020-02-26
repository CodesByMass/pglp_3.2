
public class Manager extends allEmploye {
	final private int base=1500 ;
	private int NombreEmployes ;
	public Manager(int NombreEmployes) {
		this.NombreEmployes=NombreEmployes ;
	}
	
	public double salaire() {
		return base+(NombreEmployes*100) ;
	}
 
	
}
