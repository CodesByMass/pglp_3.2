
public class Vendeur extends Entreprise {

	/**
	 * Salaire de base du vendeur
	 */
	private final static double BASE = 1500;
	/**
	 * Commission ajoutée pour chaque vendeur
	 */
	private int commission;

	public Vendeur(final int commission) {
		this.commission = commission;
		App.listeEmploye.add(this);
	}

	/**
	 * Le calcul du salaire se fait avec la base et la commission
	 *
	 * @return le salaire du vendeur
	 */
	@Override
	public double salaire() {

		return BASE + commission;
	}

}
