/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeu421;

/**
 *
 * @author cyril
 */
public class Arbitre {

    public Arbitre() {
        System.out.println("Constructeur de l'arbitre");
    }

    public int CalculerPoints(Lancer lancer) {
        if (lancer.EtQuatre21() == true) {
            return 8;

        } else if (lancer.EtBrelandDas() == true) {
            return 7;
        } else if (lancer.EtBreland() == true) {
            return 3;
        } else if (lancer.DeuxAsEt(lancer.Valeur1) == true) {
            return lancer.Valeur1;
        } else if (lancer.EtSuite() == true) {
            return 2;
        } else {
            return 1;
        }
    }

    public int departagerEgaliteA3(Lancer lancer1,Lancer lancer2 ) {
        
        if (lancer1.DeuxAsEt(3) == true && lancer2.EtBreland() == true) {
            return 3;
        } else if (lancer1.DeuxAsEt(3) == false && lancer2.EtBreland() == true){
            return -3;
        }else if (lancer1.Valeur1 > lancer2.Valeur1){
            return lancer1.Valeur1;
        }else if(lancer2.Valeur1 > lancer1.Valeur1){
            return lancer2.Valeur1;
        }else{
            return 0;
        }
        
    }
     public int departagerEgaliteA2(Lancer lancer1,Lancer lancer2){
        if (lancer1.DeuxAsEt(2) == true && lancer2.EtSuite()== true) {
            return 3;
        } else if (lancer1.DeuxAsEt(2) == false && lancer2.EtSuite() == true){
            return -3;
        }else if (lancer1.Valeur1 > lancer2.Valeur1){
            return lancer1.Valeur1;
        }else if(lancer2.Valeur1 > lancer1.Valeur1){
            return lancer2.Valeur1;
        }else{
            return 0;
        }
     }
         public int departagerEgaliteA1(Lancer lancer1,Lancer lancer2){
             if(lancer1.ValeurDecimal()>lancer2.ValeurDecimal()){
                 return 1;
             }else{
                 return -1;
             }
         }
         public int Arbitrer(Joueurs joueur1,Joueurs joueur2){
             int score1,score2;
             score1=CalculerPoints(joueur1.DernierLancer);
             score2=CalculerPoints(joueur2.DernierLancer);
             
             if(score1>score2){
                 return score1;
             }else if(score1<score2){
                 return -score2;
             }else if(score1==3){
                 return departagerEgaliteA3(joueur1.DernierLancer, joueur2.DernierLancer);
             }else if(score1==2){
                 return departagerEgaliteA2(joueur1.DernierLancer, joueur2.DernierLancer);
             }else if(score1==1){
                 return departagerEgaliteA1(joueur1.DernierLancer, joueur2.DernierLancer);
             }else{
                 return 0;
             }
         }
}
