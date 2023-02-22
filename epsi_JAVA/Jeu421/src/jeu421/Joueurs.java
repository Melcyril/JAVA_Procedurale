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
public class Joueurs {
    protected final int Nombre_Jetons_Depart=11;
    protected String NomJoeur;
    protected int Nombre_Jetons= Nombre_Jetons_Depart;
    protected De d1 =new De();
    protected De d2 =new De();
    protected De d3 =new De();
    protected Lancer DernierLancer=new Lancer();
    
    public Joueurs(){
        System.out.println("Constructeur de Joueurs");
    }
    public void jouer(){

        d1.Rouler();
        DernierLancer.Valeur1=d1.getValeur();
        d2.Rouler();
        DernierLancer.Valeur2=d2.getValeur();
        d3.Rouler();
        DernierLancer.Valeur3=d3.getValeur();
        DernierLancer.Trier();
        
    }
    public void AfficherScore(){

        System.out.println(" d1 : "+DernierLancer.Valeur1+"   "+" d2 : "+DernierLancer.Valeur2+"   "+" d3 : "+DernierLancer.Valeur3);
    }
    public void ModifierScore(int v){
        this.Nombre_Jetons+=v;
    }
    public int GetNombrejetons(){
        return this.GetNombrejetons();
    }
    
}
