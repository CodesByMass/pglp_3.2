
public class Manager extends Entreprise {

  /**
   * Salaire de base du vendeur.
   */
  private static final double BASE = 1500;
  /**
   * Commission ajoutée pour chaque vendeur.
   */
  private int nbrsubordonnes;

  public Manager(int nbrsubordonnes) {
    this.nbrsubordonnes = nbrsubordonnes;
    App.listeEmploye.add(this);
  }

  /**
   * Le calcul du salaire se fait avec la base et le nombre d'employés sous ses ordres.
   *
   * @return le salaire du vendeurs
   */
  @Override
  public double salaire() {

    return BASE + (100 * this.nbrsubordonnes);
  }
}
