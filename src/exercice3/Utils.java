package exercice3;



import java.util.List;
import exercice3.Developpeur;

public class Utils {

    public static void listerPersonnes(
            List<? extends Personne> personnes) {

        for (Personne p : personnes) {
            p.affiche();
        }
    }

    public static void ajouterDeveloppeur(
            List<? super Developpeur> personnes,
            Developpeur developpeur) {

        personnes.add(developpeur);
    }
}
