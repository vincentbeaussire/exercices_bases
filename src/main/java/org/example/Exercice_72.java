package org.example;

import java.util.Scanner;

public class Exercice_72 {
    public static void main(String[] args) {
        /*
        1.Créer une variable jour de type entier
        2.Affecter une valeur à la variable jour
        3.Afficher le jour de la semaine en lettre en fonction du nombrepassé
        4.Si le nombre est inférieur à 1 et supérieur à 7, afficher un messaged'erreur
         */
        int jour;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel jour sommes-nous en saissiant un nombre? ");
        jour = scanner.nextInt();

        switch (jour) {
            case 1:
                System.out.println("Nous sommes lundi");
                break;
            case 2:
                System.out.println("Nous sommes mardi");
                break;
            case 3:
                System.out.println("Nous sommes mercredi");
                break;
            case 4:
                System.out.println("Nous sommes jeudi");
                break;
            case 5:
                System.out.println("Nous sommes vendredi");
                break;
            case 6:
                System.out.println("Nous sommes samedi");
                break;
            case 7:
                System.out.println("Nous sommes dimanche");
                break;
            default:
                System.out.println("Erreur, veuillez saisir un autre nombre");
        }
    }
}
