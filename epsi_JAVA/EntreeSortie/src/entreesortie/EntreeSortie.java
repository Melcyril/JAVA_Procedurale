package entreesortie;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author cyril
 */
public class EntreeSortie {

    static Scanner key ;
    public static void main(String[] args) 
    { key = new Scanner(System.in);
      int x, y;
     float z;
   String texte, mot;
      System.out.print("Entrer  votre texte : ");
      texte = key.nextLine();
      System.out.println(texte);
      System.out.print("Entrer  votre mot : ");
      mot = key.next();
      System.out.println(mot);
      //On vide la ligne avant d'en lire une autre
      key.nextLine();
      texte = key.nextLine();
      System.out.println(texte);
      
   
      System.out.print("Entrer un nombre entier : ");
      x = key.nextInt();  //lire un entier depuis le clavier
      System.out.print("Entrer un nombre entier : ");
      y = key.nextInt();
      System.out.println("x = " +x);
      System.out.println("y = " +y);
      System.out.print("Entrer un nombre reel : ");
      z = key.nextFloat();
      System.out.println("z = " +z);
    }
     
}
