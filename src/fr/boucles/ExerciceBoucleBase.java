package fr.boucles;

public class ExerciceBoucleBase {
    public static void main(String[] args) {

        //Tous les nombres de 1 à 10
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }

        //20 fois nom et prénom
        for (int i = 0; i < 20; i++) {
            System.out.println("Nicolas Bern");
        }


        //Tous les éléments pairs de 2 à 100
        for (int i = 1; i < 101; i++) {
            if(i % 2 == 0) System.out.println((i));
        }

        //Tous les éléments impairs de 1 à 99
        for (int i = 1; i < 101; i++) {
            if (i % 2 != 0) System.out.println((i));
        }
    }
}
