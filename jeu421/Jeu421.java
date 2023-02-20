/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeu421;

import java.util.Scanner;

/**
 *
 * @author cyril
 */
public class Jeu421 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Joueurs joueur1=new Joueurs();
        System.out.println("Joueur 1 : Entrez votre nom");
        Scanner key=new Scanner(System.in);
        joueur1.NomJoeur=key.nextLine();
        
        Joueurs joueur2=new Joueurs();
        System.out.println("Joueur 2 : Entrez votre nom");
        Scanner key1=new Scanner(System.in);
        joueur2.NomJoeur=key1.nextLine();
        
        Arbitre arbitre= new Arbitre();
        
        System.out.println("joueur1=="+joueur1.Nombre_Jetons);
        System.out.println("joueur2=="+joueur2.Nombre_Jetons);
        do{
            
            joueur1.jouer();
            joueur2.jouer();
            
            joueur1.ModifierScore(arbitre.Arbitrer(joueur1, joueur2));
            joueur2.ModifierScore(-arbitre.Arbitrer(joueur1, joueur2));
            
            /*
            if(arbitre.CalculerPoints(joueur1.DernierLancer)>arbitre.CalculerPoints(joueur2.DernierLancer)){
                joueur1.Nombre_Jetons=joueur1.Nombre_Jetons+arbitre.CalculerPoints(joueur1.DernierLancer);
                joueur2.Nombre_Jetons=joueur2.Nombre_Jetons-arbitre.CalculerPoints(joueur1.DernierLancer);
            }else if(arbitre.CalculerPoints(joueur2.DernierLancer)>arbitre.CalculerPoints(joueur1.DernierLancer)){
                joueur1.Nombre_Jetons=joueur1.Nombre_Jetons-arbitre.CalculerPoints(joueur2.DernierLancer);
                joueur2.Nombre_Jetons=joueur2.Nombre_Jetons+arbitre.CalculerPoints(joueur2.DernierLancer);
            }else{
                arbitre.Arbitrer(joueur1, joueur2);
                
                
            }
            
            */
          
            joueur1.AfficherScore();
            joueur2.AfficherScore();
            System.out.println("joueur1=="+joueur1.Nombre_Jetons);
            System.out.println("joueur2=="+joueur2.Nombre_Jetons);
        }while(joueur1.Nombre_Jetons>0 && joueur2.Nombre_Jetons>0);
        
        if(joueur1.Nombre_Jetons>joueur2.Nombre_Jetons){
            System.out.println(joueur1.NomJoeur+" est le vainqueur !");
        }else{
            System.out.println(joueur2.NomJoeur+" est le vainqueur !");
        }                   
    }   
}
