package org.example;

import java.util.Scanner;

public class Exercice_55 {
    public static void main(String[] args) {
        /*
        1.Créer un programme qui permet de calculer le volume d'un cône
        2.La formule est la suivante : 1/3 × π × r² × h
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un rayon.");
        double rayon = scanner.nextDouble();
        System.out.println("Saisir un hauteur.");
        double hauteur = scanner.nextDouble();

        double area = (1.0 / 3) * Math.PI * Math.pow(rayon, 2) * hauteur;


        System.out.println("Le volume est de : " + area);
    }
}
