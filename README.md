# TP 6 : Polymorphisme en Java


## Objectif du TP

L'objectif de ce travail pratique est de comprendre et de mettre en œuvre le **polymorphisme en Java** à travers un système de dessin de formes géométriques.

Ce projet permet de découvrir l'héritage, la redéfinition des méthodes (`@Override`), les tableaux d'objets et la liaison dynamique (*dynamic binding*).

## Technologies utilisées

- Java (JDK 8 ou version ultérieure)
- Programmation orientée objet (POO)
- IDE ou éditeur de code Java
- Plateforme pédagogique MLIAEdu


## Description des classes

### 1. `Forme.java`

La classe `Forme` représente la super-classe. Elle contient l'attribut `couleur` et une méthode générique `dessiner()`.

### 2. `Cercle.java`

La classe `Cercle` hérite de `Forme` et ajoute l'attribut `rayon`. Elle redéfinit la méthode `dessiner()` pour afficher les informations du cercle.

### 3. `Rectangle.java`

La classe `Rectangle` hérite de `Forme` et contient les attributs `largeur` et `hauteur`. Sa méthode `dessiner()` affiche les caractéristiques du rectangle.

### 4. `Triangle.java`

La classe `Triangle` hérite de `Forme` et ajoute les attributs `base` et `hauteur`. Elle redéfinit également la méthode `dessiner()`.

### 5. `Main.java`

La classe principale crée un tableau de type `Forme[]` contenant différents objets : un cercle, un rectangle, un triangle et une forme générique.

Une boucle `for-each` parcourt le tableau et appelle `dessiner()` pour chaque objet.

##  Notions étudiées

- **Héritage :** utilisation du mot-clé `extends`.
- **Redéfinition :** adaptation de la méthode `dessiner()` dans chaque sous-classe avec `@Override`.
- **Polymorphisme :** manipulation de plusieurs types d'objets à travers une référence commune de type `Forme`.
- **Liaison dynamique :** Java exécute la méthode correspondant au type réel de chaque objet.
- **Encapsulation :** utilisation d'attributs `private` et `protected`.
- **Tableaux d'objets :** stockage de différentes formes dans un seul tableau.

## ▶️ Compilation et exécution

Depuis le répertoire `src`, exécuter les commandes suivantes :

```bash
javac com/example/tp/*.java
java com.example.tp.Main
```

### Résultat attendu

```text
Dessiner un cercle de couleur Rouge et de rayon 5.0
Dessiner un rectangle de couleur Bleu, largeur=4.0, hauteur=3.0
Dessiner un triangle de couleur Vert, base=6.0, hauteur=2.5
Dessiner une forme de couleur Noir
```

##  Captures d'écran
exercice 1 :
<img width="1366" height="768" alt="ex1" src="https://github.com/user-attachments/assets/cb749635-9964-4a41-9b17-9fc62cf9c6a6" />
exercice 2:
<img width="1366" height="768" alt="ex3" src="https://github.com/user-attachments/assets/26137edd-732f-4e81-bab2-ec69e2d9a13e" />

exercice 3 :
<img width="1366" height="768" alt="exe3" src="https://github.com/user-attachments/assets/6a9ee03e-dd1c-4a81-944b-b8574c5d7407" />

##  Extensions possibles

- Ajouter une méthode `aire()` pour calculer la surface de chaque forme.
- Créer une nouvelle classe `Carre` sans modifier la logique de la classe `Main`.
- Trier les formes selon leur aire.
- Utiliser une classe abstraite `Forme` pour imposer l'implémentation de `dessiner()`.

##  Conclusion

Ce travail pratique m'a permis de comprendre le fonctionnement du polymorphisme en Java et son importance dans la programmation orientée objet.

J'ai appris à créer une hiérarchie de classes, à redéfinir des méthodes et à manipuler plusieurs objets de types différents à travers une même référence parent.

Le polymorphisme permet ainsi de développer des programmes plus flexibles, extensibles et faciles à maintenir.

---

**Auteur : Hamza ID EL BAZ**  
**Formation : Informatique — ENS Marrakech**  
**Université Cadi Ayyad**
