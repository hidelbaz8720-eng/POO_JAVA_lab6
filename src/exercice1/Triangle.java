package exercice1;

/**
 * Triangle de base et de hauteur données.
 */
public class Triangle extends Forme {
    private double base, hauteur;

    public Triangle(String couleur, double base, double hauteur) {
        super(couleur);
        this.base = base;
        this.hauteur = hauteur;
    }

    @Override
    public void dessiner() {
        System.out.println("Dessiner un triangle de couleur " 
            + couleur + ", base=" + base 
            + ", hauteur=" + hauteur);
    }

    @Override
    public double aire() {
        return (base * hauteur) / 2.0;
    }

}

