package exercice3;

import exercice3.Developpeur;
import exercice3.Manager;
import java.util.*;



public class TestPersonnes {

    public static void main(String[] args) {

        List<Personne> equipe = new ArrayList<>();

        equipe.add(new Developpeur("Ali", 2000, 5));
        equipe.add(new Manager("Hamid", 3000, 10));
        equipe.add(new Interne("Sara", 2500, 2));

        // Ajouter un développeur avec la méthode générique
        Utils.ajouterDeveloppeur(
            equipe,
            new Developpeur("Yassine", 4000, 3)
        );

        // Afficher toute l'équipe
        Utils.listerPersonnes(equipe);
    }
}
