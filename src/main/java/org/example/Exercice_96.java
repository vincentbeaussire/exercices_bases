package org.example;

public class Exercice_96 {
    public static void main(String[] args) {
        /*
        1.Ecrire un programme qui permet de trouver la valeur maximale dans un tableau
         */

        int tableau[] = {23, 150, 12, 28, 59, 2};

        int maxNum = tableau[0];

        for (int i : tableau) {
            if (i > maxNum) {
                maxNum = i;
            }
        }
        System.out.println("La valeur maximale du tableau est : " + maxNum);
    }
}
