package exercice2;



public class Audio extends Media {
    private int duree;

    public Audio(String titre, int duree) {
        super(titre);
        this.duree = duree;
    }

    @Override
    public void lire() {
        System.out.println("Lecture audio : " + titre);
    }

    @Override
    public int getDuree() {
        return duree;
    }

    @Override
    public void stop() {
        System.out.println("Arrêt de l'audio : " + titre);
    }
}

