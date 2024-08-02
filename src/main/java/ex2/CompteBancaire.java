package ex2;

/**
 * Représente un compte bancaire avec un solde et un découvert autorisé.
 */
public abstract class CompteBancaire {

	/** Solde du compte */
	protected double solde;

	/** Découvert autorisé, seulement pour les comptes courants */
	protected double decouvert;

	/**
	 * Constructeur pour initialiser un compte bancaire.
	 * @param solde le solde du compte
	 * @param decouvert découvert autorisé pour les comptes courants
	 */
	public CompteBancaire(double solde, double decouvert) {
		this.solde = solde;
		this.decouvert = decouvert;
	}

	/** Ajoute un montant au solde du compte. */
	public void ajouterMontant(double montant) {
		this.solde += montant;
	}

	/** Débite un montant du compte. */
	public abstract void debiterMontant(double montant);

	/** Getter pour le solde. */
	public double getSolde() {
		return solde;
	}

	/** Setter pour le solde. */
	public void setSolde(double solde) {
		this.solde = solde;
	}

	/** Getter pour le découvert. */
	public double getDecouvert() {
		return decouvert;
	}

	/** Setter pour le découvert. */
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}
}