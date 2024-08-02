package ex2;

/**
 * Représente un compte courant avec un solde et un découvert autorisé.
 */
public class CompteCourant extends CompteBancaire {

    /**
     * Constructeur pour un compte courant.
     * @param solde le solde du compte
     * @param decouvert le découvert autorisé
     */
    public CompteCourant(double solde, double decouvert) {
        super(solde, decouvert);
    }

    @Override
    public void debiterMontant(double montant) {
        if (solde - montant >= -decouvert) {
            solde -= montant;
        } else {
            // Gestion de l'erreur pour découvert dépassé
            throw new IllegalArgumentException("Découvert autorisé dépassé");
        }
    }
}