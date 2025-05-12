package org.example;

import java.util.Scanner;

public class Exercice_70 {
    public static void main(String[] args) {
        /*
        1.Créer 3 variables : nombre1, nombre2, nombre
        2.Affecter des valeurs aux variables
        3.Créer des structures conditionnelles permettant d'afficher le maximum parmis les 3 nombres créésprécédemment
         */
        int nombre1, nombre2, nombre3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir trois nombres");
        nombre1 = scanner.nextInt();
        nombre2 = scanner.nextInt();
        nombre3 = scanner.nextInt();

        if (nombre1 >= nombre2 && nombre1 >= nombre3) {
            System.out.println("Le plus grand nombre est : " + nombre1);
        } else if (nombre2 >= nombre1 && nombre2 >= nombre3) {
            System.out.println("Le plus grand nombre est : " + nombre2);
        }else {
            System.out.println("Le plus grand nombre est : " + nombre3);
        }
    }
}
