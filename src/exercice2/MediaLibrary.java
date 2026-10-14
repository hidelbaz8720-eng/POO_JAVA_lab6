package exercice2;


import java.io.FileWriter;
import java.io.IOException;

public class MediaLibrary {
    private Media[] items;
    private int count;

    public MediaLibrary() {
        items = new Media[4];
        count = 0;
    }

    public void add(Media m) {
        if (m == null) {
            return;
        }

        if (count == items.length) {
            Media[] tmp = new Media[items.length * 2];

            System.arraycopy(items, 0, tmp, 0, items.length);

            items = tmp;
        }

        items[count] = m;
        count++;
    }

    public void playAll() {
        System.out.println("=== Lecture de la bibliothèque ===");

        for (int i = 0; i < count; i++) {
            items[i].lire();
        }
    }

    public void stopAll() {
        System.out.println("=== Arrêt de la bibliothèque ===");

        for (int i = 0; i < count; i++) {
            items[i].stop();
        }
    }

    public int totalDuration() {
        int sum = 0;

        for (int i = 0; i < count; i++) {
            int d = items[i].getDuree();

            if (d > 0) {
                sum += d;
            }
        }

        return sum;
    }

    public void saveToFile(String nomFichier) {
        try (FileWriter writer = new FileWriter(nomFichier)) {
            for (int i = 0; i < count; i++) {
                Media m = items[i];

                writer.write("Type : "
                        + m.getClass().getSimpleName() + "\n");

                writer.write("Titre : "
                        + m.getTitre() + "\n");

                writer.write("Durée : "
                        + m.getDuree() + " secondes\n");

                writer.write("--------------------\n");
            }

            System.out.println(
                    "Bibliothèque enregistrée dans " + nomFichier);

        } catch (IOException e) {
            System.out.println(
                    "Erreur lors de l'enregistrement : "
                    + e.getMessage());
        }
    }

    public int getCount() {
        return count;
    }
}

