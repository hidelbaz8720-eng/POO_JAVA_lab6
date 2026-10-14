package exercice2;


public class main {
    public static void main(String[] args) {
        MediaLibrary lib = new MediaLibrary();

        // Ajout des médias
        lib.add(new Audio("Podcast Java", 1800));
        lib.add(new Video("Tutoriel UML", 900, "1080p"));

        lib.add(new LiveStream(
                "Concert en direct",
                "http://live.example.com"
        ));

        lib.add(new Audio("Musique Classique", 2400));

        // Extension : Podcast
        lib.add(new Podcast(
                "Introduction à Java",
                1200,
                "Hamza"
        ));

        // Lecture polymorphe
        lib.playAll();

        // Durée totale
        System.out.println();
        System.out.println("Durée totale (sec) : "
                + lib.totalDuration());

        // Arrêt polymorphe
        System.out.println();
        lib.stopAll();

        // Sauvegarde dans un fichier texte
        System.out.println();
        lib.saveToFile("bibliotheque.txt");
    }
}


