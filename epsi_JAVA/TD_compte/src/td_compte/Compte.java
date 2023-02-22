/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td_compte;
import java.util.Scanner;
/**
 *
 * @author cyril
 */
public class Compte {

    //Correction
   
    protected final int numCompte;
    protected static int compteur=0;
    protected final String nomClient;
    protected final float debitMax=1000;
    protected float decouvertMax=800;
    protected float decouvert;
    protected float solde=0;
    public Scanner key=new Scanner(System.in);

    
        
    public Compte(){
        this.compteur++;
        this.numCompte=this.compteur;
        System.out.println("Entrez le nom");
        this.nomClient=key.nextLine();
        //this
        //this.solde=key.nextFloat();

    }
        
    
    public Compte(String nom, float solde){
        this.compteur++;
        this.numCompte=this.compteur;
        this.nomClient=nom;
        System.out.println("Constructeur avec paramêtre");
    }
    
    public boolean debiter(float montant){
        if(montant>debitMax){
            System.out.println("Erreur");
            return false;
        }else if(this.solde-montant>= -this.decouvertMax){
            this.solde-=montant;
            return true;
        }else{
            System.out.println("Dépassement de découvert");
            return false;
        }       
    }
    public void virement(float somme, Compte CompteCible){
        if(this.debiter(somme)==true){
            CompteCible.crediter(somme);
        }
    }
    public void crediter(float montant){
        this.solde=this.solde+montant;
        if(solde<0) decouvert=(-1)*solde;
        else decouvert=0;
    }
    public float getSolde(){
        return this.solde;
    }

    public String getNom(){
        return this.nomClient;
    }

    public int getNumCompte(){
        return this.numCompte;
    }

    public float getDecouvertMax(){
        return this.decouvertMax;
    }

    public float getDebitMax(){
        return this.debitMax;
    }
}
