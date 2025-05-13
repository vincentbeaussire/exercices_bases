package org.example;
import java.time.YearMonth;
import java.util.Scanner;

public class Exercice_73 {
    public static void main(String[] args) {
        /*
        1.Créer une variable mois de type entier
        2.Affecter une valeur à la variable mois
        3.Afficher le nombre de jours du mois
        4.Si le nombre est inférieur à 1 et supérieur à 12, afficher unmessage d'erreur
         */
        int mois;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le mois en saissisant un chiffre");
        mois = scanner.nextInt();

        System.out.println("Entrez l'année");
        int annee = scanner.nextInt();


        YearMonth yearMonth = YearMonth.of(annee, mois);
        int joursDansMois = yearMonth.lengthOfMonth();

        switch (mois) {
            case 1:
                System.out.println("Nous sommes en janvier " + annee + " et il contient " + joursDansMois + " jours");
                break;
            case 2:
                System.out.println("Nous sommes en février " + annee + " et il contient " + joursDansMois + " jours");
                break;
            case 3:
                System.out.println("Nous sommes en mars " + annee + " et il contient " + joursDansMois + " jours");
                break;
            case 4:
                System.out.println("Nous sommes en avril " + annee + " et il contient " + joursDansMois + " jours");
                break;
            case 5:
                System.out.println("Nous sommes en mai " + annee + " et il contient " + joursDansMois + " jours");
                break;
            case 6:
                System.out.println("Nous sommes en juin " + annee + " et il contient " + joursDansMois + " jours");
                break;
            case 7:
                System.out.println("Nous sommes en juillet " + annee + " et il contient " + joursDansMois + " jours");
                break;
            case 8:
                System.out.println("Nous sommes en août " + annee + " et il contient " + joursDansMois + " jours");
                break;
            case 9:
                System.out.println("Nous sommes en septembre " + annee + " et il contient " + joursDansMois + " jours");
                break;
            case 10:
                System.out.println("Nous sommes en octobre " + annee + " et il contient " + joursDansMois + " jours");
                break;
            case 11:
                System.out.println("Nous sommes en novembre " + annee + " et il contient " + joursDansMois + " jours");
                break;
            case 12:
                System.out.println("Nous sommes en décembre " + annee + " et il contient " + joursDansMois + " jours");
                break;
            default:
                System.out.println("Erreur, veuillez saisir un autre nombre");
        }
    }
}
