package ex2;

/**
 * Représente un livret A avec un solde et un taux de rémunération.
 * Un livret A ne doit jamais être à découvert.
 */
public class LivretA extends CompteBancaire {

	/** Taux de rémunération annuel du livret A */
	private double tauxRemuneration;

	/**
	 * Constructeur pour un livret A.
	 * @param solde le solde du compte
	 * @param tauxRemuneration le taux de rémunération annuel
	 */
	public LivretA(double solde, double tauxRemuneration) {
		super(solde, 0); // Pas de découvert autorisé
		this.tauxRemuneration = tauxRemuneration;
	}

	@Override
	public void debiterMontant(double montant) {
		if (solde - montant >= 0) {
			solde -= montant;
		} else {
			// Gestion de l'erreur pour solde insuffisant
			throw new IllegalArgumentException("Solde insuffisant pour un livret A");
		}
	}

	/**
	 * Applique la rémunération annuelle au solde du livret A.
	 */
	public void appliquerRemunerationAnnuelle() {
		solde += solde * tauxRemuneration / 100;
	}

	/** Getter pour le taux de rémunération. */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/** Setter pour le taux de rémunération. */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}
}
