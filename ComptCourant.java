public class ComptCourant extends BankAccount {
    private double limiteDecouvert;

    public ComptCourant(String idCompte, double solde, double limiteDecouvert) {
        super(idCompte, solde);
        this.limiteDecouvert = limiteDecouvert;
    }

    @Override
    public void retirer(double montant) {
        if (montant > 0 && getSolde() - montant >= -limiteDecouvert) {
            super.retirer(montant);
        } else {
            System.out.println("Retrait refusé. Limite de découvert dépassée.");
        }
    }

    @Override
    public void afficherDetails() {
        super.afficherDetails();
        System.out.println("Type de compte: Compte Courant");
        System.out.println("Limite de découvert: " + limiteDecouvert);
    }
}
