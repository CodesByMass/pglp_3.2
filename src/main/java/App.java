
public class App {

	public static void main( String[] args) {
		System.out.println(" Hello World !");
		employe e = new employe(2015);
		System.out.println("Affiche salaire employe " +e.salaire());
		
		vendeur v = new vendeur (30) ;
		System.out.println("Affiche salaire vendeur " +v.salaire());
		 
	}
}
