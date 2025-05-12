package org.example;

import java.util.Scanner;

public class Exercice_68 {
    public static void main(String[] args) {
        /*
        1.Créer une variable age
        2.Affecter une valeur à la variable age
        3.Créer une condition qui permet d'afficher si la personne estmajeure ou mineure
         */
        int age;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel âge avez-vous?");
        age = scanner.nextInt();

        if (age < 18) {
            System.out.println("Vous êtes mineur");
        } else {
            System.out.println("Vous êtes majeur");
        }
    }
}
