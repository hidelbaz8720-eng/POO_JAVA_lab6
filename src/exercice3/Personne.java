package exercice3;


public abstract class Personne {

    protected final String nom;
    protected final double salaireBase;
    protected final int anciennete;

    public Personne(String nom, double salaireBase, int anciennete) {
        this.nom = nom;
        this.salaireBase = salaireBase;
        this.anciennete = anciennete;
    }

    public abstract double calculerSalaire();

    public void affiche() {
        System.out.printf(
            "Je suis %s, anciennete = %d ans, salaire = %.2f DH%n",
            nom, anciennete, calculerSalaire()
        );
    }
}