/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tableau_correc;

import java.util.Random;
import java.util.Scanner;
import java.time.LocalTime; // import the LocalTime class

/**
 *
 * @author cyril
 */
public class Tableau_correc {

    static Scanner key = new Scanner(System.in);
    private int vecteur[];
    private int capacite;

    //******************************************************************

    Tableau_correc() {
        System.out.print("Entrer la taille du tableau : ");
        capacite = key.nextInt();
        vecteur = new int[capacite];

    }

  //******************************************************************
    //******************************************************************
    public void saisirTableau() {
        int i;
        for (i = 0; i < capacite; i = i + 1) {
            //System.out.print("Entrer un nombre : ");
            //tab[i] = key.nextInt();    //lire(tab[i]/
            vecteur[i] = (int) (Math.random() * capacite) + 1;
        }
    }

    //****************************************************************** 

    public void afficherTableau() {
        int i;
        for (i = 0; i < capacite; i = i + 1) {
            System.out.print(vecteur[i] + "\t");
        }
        System.out.println("\n"); //retour à la ligne
    }

    //***************** Calcul de la Somme des valeurs d'un tableau *************************************************

    public int SommeTableau() {
        int i, s = 0;
        for (i = 0; i < vecteur.length; i = i + 1) {
            s = s + vecteur[i];
        }
        return s;
    }

    //******************************************************************

    public void permuter(int x, int y) // passage par valeur
    {
        int temp = x;
        x = y;
        y = temp;
    }

    //***************** Calcul de la Somme des valeurs d'un tableau *************************************************

    public float moyenneTableau() {
        if (vecteur.length != 0) {
            return (float) SommeTableau() / vecteur.length;
        } else {
            return 0;
        }
    }

    //******************************************************************

    public void tri_Selection() {
        int i, j, min, temp;
        for (i = 0; i < capacite - 1; i++) {
            min = i;
            for (j = i + 1; j < capacite; j++) {
                if (vecteur[j] < vecteur[min]) {
                    min = j;
                }
            }
            //permutation 
            if (min != i) {
                temp = vecteur[i];
                vecteur[i] = vecteur[min];
                vecteur[min] = temp;
            }
        }
    }

    public void tri_Bulle() {
        boolean permut = false;
        int j = capacite -1;
        
        do {
            permut = false;
            for (int i = 0; i < j; i++) {
                if (vecteur[i] > vecteur[i + 1]) {
                    int temp =vecteur[i];
                    vecteur[i] =vecteur[i+1];
                    vecteur[i+1] = temp;
                    //permuter(vecteur[i], vecteur[i+1])
                    //Paramètre non modifiable car c'est protégé
                    permut = true;
                }
            }
            j = j - 1;
        } while (permut == true);

    }
    public void tri_Insertion(){
        int x,i;
        for(int j=1;j<capacite;j++){
            x=vecteur[j];
            i=j-1;
            while(i>=0 && vecteur[i]>x){ // recherche la position de x
                vecteur[i+1]=vecteur[i];
                i=i-1;
            }
        vecteur[i+1]=x;       
        }
    }
 //******************************************************************   
    //********************** Programme Principal *********************************

    public static void main(String[] args) {

        Tableau_correc obj = new Tableau_correc();
        obj.saisirTableau();
        obj.afficherTableau();

        System.out.print("La somme est : " + obj.SommeTableau() + "\n");
        System.out.print("La moyenne est : " + obj.moyenneTableau() + "\n");

        long debut = System.currentTimeMillis();
        //obj.tri_Selection();
        //obj.tri_Bulle();
        obj.tri_Insertion();
        long fin = System.currentTimeMillis();
        obj.afficherTableau();
        System.out.println("Durée : " + (fin - debut) + " Millisecondes");

  //   System.out.println("La taille du tableau est : " + obj.vecteur.length);
    }
}
