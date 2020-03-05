
public class employe extends allEmploye {
	final private int salaire = 1500 ;
	private int startYear;
	public employe (int startYear) {
	}
	
	@Override
	public double salaire() {
		// TODO Auto-generated method stub
		return  salaire+(2020-this.startYear);
	}
	
	
	

}
