package fr.boucles;

public class ExerciceTableauEntier {
    public static void main(String[] args) {

        int[] monTableau = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //Afficher premier élément
        System.out.println("Le premier élément du tableau est : " + monTableau[0]);

        //Afficher la longueur du tableau
        System.out.println("La longueur du tableau est de : " + monTableau.length);

        //Afficher le dernier élément du tableau avec length
        System.out.println("Le dernier élément du tableau est : " + monTableau[monTableau.length - 1]);

        //Valeur du quatrième index = 8
        monTableau[4] = 8;
        System.out.println("Index 4 = " + monTableau[4]);
    }
}