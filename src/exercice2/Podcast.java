package exercice2;



public class Podcast extends Audio {
    private String hote;

    public Podcast(String titre, int duree, String hote) {
        super(titre, duree);
        this.hote = hote;
    }

    @Override
    public void lire() {
        System.out.println("Lecture du podcast : "
                + getTitre() + " | Hôte : " + hote);
    }

    @Override
    public void stop() {
        System.out.println("Arrêt du podcast : " + getTitre());
    }

    public String getHote() {
        return hote;
    }
}


