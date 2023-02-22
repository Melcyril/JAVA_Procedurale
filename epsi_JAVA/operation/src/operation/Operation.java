/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operation;

import java.util.Scanner;

/**
 *
 * @author cyril
 */
public class Operation {

    /**
     * @param args the command line arguments
     */
    //Programme Principal
    public static void main(String[] args) {
        // Declaration intialisation
        float nombre1 = 0;
        float nombre2 = 0;
        String operateur;
        float resultat = 0;
        byte erreur = 0;
        Scanner key1 = new Scanner(System.in);

        //Saisie du Nombre 1
        do {
            try {
                erreur = 0;
                nombre1 = CreerNombreReel();
            } catch (Exception e) {
                System.out.println("erreur !!!!! saississez un nombre pour le ier nombre ");
                erreur = 1;

            }
        } while (erreur == 1);

        //Saisi de l'Opérateur
        //Répéter tant que l'utilisateur ne saisi pas de   
        do {
            System.out.println("Entrez un operateur : ");
            operateur = key1.nextLine();

            if (!operateur.contains("+") && !operateur.contains("-") && !operateur.contains("X") && !operateur.contains("*") && !operateur.contains("/")) {
                System.out.println("erreur de synthaxe");
            }
        } while (!operateur.contains("+") && !operateur.contains("-") && !operateur.contains("X") && !operateur.contains("*") && !operateur.contains("/"));

        //Nombre 2
        //Répéter tant que l'utilisateur ne saisie pas un nombre 
        // Si la saisie n'est pas un nombre alors on passe dans le catch 
        do {
            try {
                erreur = 0;
                nombre2 = CreerNombreReel();
            } catch (Exception e) {
                System.out.println("erreur !!!!! saississez un nombre pour le 2ieme nombre ");
                erreur = 1;

            }
        } while (erreur == 1);
        //Répéter tant que l'utilisateur ne saisie pas un nombre  

        //Utilisation de la fonction calcul pour faire l'opération
        resultat = Calcul(nombre1, operateur, nombre2);
        //Affichage du resultat si c'est une division par 0
        if (nombre2 != 0 && operateur != ":" & operateur != "/") {
            System.out.println(nombre1 + " " + operateur + " " + nombre2 + " = " + resultat);
        }
    }

    public static float Calcul(float nombre1, String operateur, float nombre2) {
        float resultat = 0;
        if (operateur.contains("+")) {
            resultat = nombre1 + nombre2;
            return resultat;
        } else if (operateur.contains("-")) {
            resultat = nombre1 - nombre2;
            return resultat;
        } else if (operateur.contains("X") || operateur.contains("*")) {
            resultat = nombre1 * nombre2;
            return resultat;
        } else if (operateur.contains("/") || operateur.contains(":")) {
            if (nombre2 == 0) {
                System.out.println("Diviser par 0 est impossible");
            } else {
                resultat = nombre1 / nombre2;
                return resultat;
            }
        }
        return resultat;
    }

    public static String RemplacerCaractere(String chaine, String caractere_a_remplacer, String new_caractere) {
        if (chaine.indexOf(caractere_a_remplacer) != -1) {
            chaine = chaine.replaceAll(caractere_a_remplacer, new_caractere);
            return chaine;
        } else {
            return chaine;
        }
    }

    public static float CreerNombreReel() {
        Scanner key2 = new Scanner(System.in);

        key2 = new Scanner(System.in);
        System.out.println("Entrez un nombre reel : ");
        String str_nombre2 = key2.nextLine();
        // Utilisation de la fonction pour echanger la virgule en point pour que l'utilsateur puisse utiliser le point ou la virgule 
        str_nombre2 = RemplacerCaractere(str_nombre2, ",", ".");
        //Transformation de la chaine en string en float
        return Float.valueOf(str_nombre2);

    }
    
}
