package org.example;

import java.util.Scanner;

public class Exercice_54 {
    public static void main(String[] args) {
        /*
        1.Créer une variable age et lui affecter une valeur
        2.Vérifier si la personne est mineure ou majeure à l'aide desopérateurs logiques
        3.Afficher le résultat
        4./!\ Ne pas utiliser de structure conditionnelle
         */
        int age;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel âge avez-vous?");
        age = scanner.nextInt();

        while (age < 18) {
            while (age >= 18) {
                System.out.println("Vous êtes majeur");
                break;
            }
            System.out.println("Vous êtes mineur");
            break;
        }
    }
}
