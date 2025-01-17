public class BankAccount {
    private String idCompte;
    private double solde;

    public BankAccount(String idCompte, double solde) {
        this.idCompte = idCompte;
        this.solde = solde;
    }

    public String getIdCompte() {
        return idCompte;
    }

    public double getSolde() {
        return solde;
    }

    public void deposer(double montant) {
        if (montant > 0) {
            solde += montant;
            System.out.println("Montant déposé: " + montant + ". Nouveau solde: " + solde);
        } else {
            System.out.println("Montant invalide.");
        }
    }

    public void retirer(double montant) {
        if (montant > 0 && montant <= solde) {
            solde -= montant;
            System.out.println("Montant retiré: " + montant + ". Solde restant: " + solde);
        } else {
            System.out.println("Montant invalide ou solde insuffisant.");
        }
    }

    public void afficherDetails() {
        System.out.println("ID du compte: " + idCompte);
        System.out.println("Solde: " + solde);
    }
}
