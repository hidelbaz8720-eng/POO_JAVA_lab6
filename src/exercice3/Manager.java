package exercice3;

import exercice3.Personne;


public class Manager extends Personne {

    public Manager(String nom, double salaireBase, int anciennete) {
        super(nom, salaireBase, anciennete);
    }

    @Override
    public double calculerSalaire() {
        double prime = 0.30 + anciennete * 0.01;
        return salaireBase * (1 + prime);
    }
}
