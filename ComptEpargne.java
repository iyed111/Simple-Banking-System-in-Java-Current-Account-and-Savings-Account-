public class ComptEpargne extends BankAccount {
    private int retraitsMax;
    private int retraitsEffectues;

    public ComptEpargne(String idCompte, double solde, int retraitsMax) {
        super(idCompte, solde);
        this.retraitsMax = retraitsMax;
        this.retraitsEffectues = 0;
    }

    @Override
    public void retirer(double montant) {
        if (retraitsEffectues < retraitsMax) {
            super.retirer(montant);
            retraitsEffectues++;
            System.out.println("Retraits restants: " + (retraitsMax - retraitsEffectues));
        } else {
            System.out.println("Limite de retraits atteinte pour ce compte.");
        }
    }

    @Override
    public void afficherDetails() {
        super.afficherDetails();
        System.out.println("Type de compte: Compte Épargne");
        System.out.println("Retraits effectués: " + retraitsEffectues + "/" + retraitsMax);
    }
}
