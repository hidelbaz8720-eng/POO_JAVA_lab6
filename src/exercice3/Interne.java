package exercice3;



import exercice3.Personne;

public class Interne extends Personne {

    public Interne(String nom, double salaireBase, int anciennete) {
        super(nom, salaireBase, anciennete);
    }

    @Override
    public double calculerSalaire() {
        return salaireBase;
    }
}
