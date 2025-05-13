package org.example;

import java.util.Scanner;

public class Exercice_85 {
    public static void main(String[] args) {
        /*
        1.Générer un nombre aléatoire entre 1 et 100
        2.Faire saisir un nombre à l'utilisateur
        3.Si le chiffre saisi est plus grand, écrire : Le nombre est plus petit
        4.Si le chiffre saisi est plus petit, écrire : Le nombre est plus grand
        5.Si le chiffre saisi est égal au chiffre aléatoire, écrire : Vous avez gagné en Xtentatives
         */
        double num = Math.random() * 1 - 100;
        System.out.println(num);

        Scanner scanner  = new Scanner(System.in);
        int user_num = scanner.nextInt();
        System.out.println("Saisir un nombre");

        if (user_num > num) {
            System.out.println("Le nombre est plus petit");
        } else if (user_num < num) {
            System.out.println("Le nombre est plus grand");
        } else if (user_num == num) {
            System.out.println("Vous avez gagné en " + num + " tentatives");
        }

    }
}
