import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ComptCourant compteCourant = new ComptCourant("CC123", 1000.0, 500.0);
        ComptEpargne compteEpargne = new ComptEpargne("CE456", 2000.0, 3);

        while (true) {
            System.out.println("\n1. Détails du Compte Courant");
            System.out.println("2. Détails du Compte Épargne");
            System.out.println("3. Déposer sur le Compte Courant");
            System.out.println("4. Retirer du Compte Courant");
            System.out.println("5. Déposer sur le Compte Épargne");
            System.out.println("6. Retirer du Compte Épargne");
            System.out.println("7. Quitter");
            System.out.print("Choisissez une option: ");
            int choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    compteCourant.afficherDetails();
                    break;
                case 2:
                    compteEpargne.afficherDetails();
                    break;
                case 3:
                    System.out.print("Entrez le montant à déposer: ");
                    double depotCourant = scanner.nextDouble();
                    compteCourant.deposer(depotCourant);
                    break;
                case 4:
                    System.out.print("Entrez le montant à retirer: ");
                    double retraitCourant = scanner.nextDouble();
                    compteCourant.retirer(retraitCourant);
                    break;
                case 5:
                    System.out.print("Entrez le montant à déposer: ");
                    double depotEpargne = scanner.nextDouble();
                    compteEpargne.deposer(depotEpargne);
                    break;
                case 6:
                    System.out.print("Entrez le montant à retirer: ");
                    double retraitEpargne = scanner.nextDouble();
                    compteEpargne.retirer(retraitEpargne);
                    break;
                case 7:
                    System.out.println("Au revoir!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
            }
        }
    }
}
