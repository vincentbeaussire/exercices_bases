package org.example;

public class Exercice_56 {
    public static void main(String[] args) {
        /*
        1.Saisir une chaine et la stocker dans une variable
        2.Effectuer les traitements suivants :
        1.Afficher la chaîne en minuscule
        2.Afficher la chaîne en majuscule
         */

        String chaine_caractere = "Comment ça va?";
        System.out.println(chaine_caractere.toLowerCase());
        System.out.println(chaine_caractere.toUpperCase());

        /*
        3.Bonus
        1.Convertir la chaîne en tableau puis afficher les caractères séparer d'une virgule
        2.Afficher la première lettre de chaque mot en majuscule
         */

        String[] resultat = chaine_caractere.split(";");
        for (String i : resultat) {
            System.out.println(resultat);
        }

    }
}
