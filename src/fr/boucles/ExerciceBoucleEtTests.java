package fr.boucles;

public class ExerciceBoucleEtTests {
    public static void main(String[] args) {

        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        //Afficher l'ensemble des éléments du tableau grâce à une boucle
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }


        //Afficher l'ensemble des éléments dans l'ordre inverse
        for (int i = array.length-1; i > -1; i--) {
            System.out.println(array[i]);
        }


        //Afficher que les entiers supérieurs à 3
        for (int i = 0; i < array.length; i++) {
            if(array[i] > 3) System.out.println(array[i]);
        }


        //Afficher que les entiers pairs
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0) System.out.println(array[i]);
        }


        //Afficher que les index pairs
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0) System.out.println(i);
        }


        //Afficher que les entiers pairs
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 != 0) System.out.println(array[i]);
        }
    }
}
