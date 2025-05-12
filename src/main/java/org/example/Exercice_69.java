package org.example;

import java.util.Scanner;

public class Exercice_69 {
    public static void main(String[] args) {
            /*
    1.Créer une variable nombre de type entier
    2.Affecter une valeur à la variable nombre
    3.Créer une condition qui permet d'afficher si le nombre est pair ou impair
     */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre.");
        int nombre = scanner.nextInt();

        if (nombre % 2 == 0) {
            System.out.println("Votre nombre est pair");
        } else {
            System.out.println("Votre nombre est impair");
        }
    }
}
