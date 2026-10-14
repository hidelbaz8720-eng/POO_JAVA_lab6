package exercice3;

import exercice3.Personne;


public class Developpeur extends Personne {

    public Developpeur(String nom, double salaireBase, int anciennete) {
        super(nom, salaireBase, anciennete);
    }

    @Override
    public double calculerSalaire() {
        double prime = 0.10 + anciennete * 0.01;
        return salaireBase * (1 + prime);
    }
}
