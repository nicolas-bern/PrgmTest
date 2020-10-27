package fr.boucles;

public class ExerciceBoucleEtTests {
    public static void main(String[] args) {

        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        //Afficher l'ensemble des éléments du tableau grâce à une boucle
        System.out.println("Array :");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }


        //Afficher l'ensemble des éléments dans l'ordre inverse
        System.out.println("Tableau inversé :");
        for (int i = array.length-1; i > -1; i--) {
            System.out.println(array[i]);
        }


        //Afficher que les entiers supérieurs à 3
        System.out.println("Entiers supérieurs à 3 :");
        for (int i = 0; i < array.length; i++) {
            if(array[i] > 3) System.out.println(array[i]);
        }


        //Afficher que les entiers pairs
        System.out.println("Entiers pairs :");
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0) System.out.println(array[i]);
        }


        //Afficher que les index pairs
        System.out.println("Index pairs :");
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0) System.out.println(i);
        }


        //Afficher que les entiers impairs
        System.out.println("Entiers impairs :");
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 != 0) System.out.println(array[i]);
        }
    }
}
