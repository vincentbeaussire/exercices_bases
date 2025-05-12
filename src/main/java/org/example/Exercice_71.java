package org.example;

import java.util.Scanner;

public class Exercice_71 {
    public static void main(String[] args) {
        /*
        1.Créer une variable caractere
        2.Affecter une valeur à la variable caractere
        3.A l'aide des structures conditionnelles, déterminer si le caractère est une consonne ou une voyelle
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un caractère");
        String caractere = scanner.next();

         if (caractere.equals("aeiouy")){
             System.out.println("");
         }
    }
}
