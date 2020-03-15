
public class Employe extends Entreprise {

  /**
   * Salaire de base de l'employe.
   */
  private static final double BASE = 1500;

  /**
   * Année de début de l'employé.
   */
  private final int startYear;

  public Employe(int startYear) {
    this.startYear = startYear;
    App.listeEmploye.add(this);
  }

  /**
   * Le calcul du salaire se fait avec la base et l'ancienneté.
   *
   * @return le salaire de l'employé this
   */
  @Override
  public double salaire() {

    return BASE + (20 * (2020 - this.startYear));
  }

}
