import java.util.ArrayList;

/**
 * The class that manages all employees of the company.
 *
 * @author Mass'
 *
 */
public class App {

  static final ArrayList<Entreprise> listeEmploye = new ArrayList<Entreprise>();

  /**
   * Sums the total salary of all employees of the company.
   *
   * @return La somme des salaires de l'entreprise.
   */
  public static double calculerTotalSalaire() {
    double salaireTotal = 0;
    for (int i = 0; i < listeEmploye.size(); i++) {
      salaireTotal += listeEmploye.get(i).salaire();
    }
    return salaireTotal;
  }

  public static void main(final String[] args) {

    Employe e = new Employe(2015);
    System.out.println("Affiche salaire employe " + e.salaire());

    Vendeur v = new Vendeur(30);
    System.out.println("Affiche salaire vendeur " + v.salaire());

    System.out.println("Salaire total : " + calculerTotalSalaire());
  }
}
