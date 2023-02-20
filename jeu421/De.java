/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeu421;
import java.util.Random;
/**
 *
 * @author cyril
 */
public class De {
    protected final int Nombre_face_de=6;
    protected int valeur_de;
    
    
    public De(){
        System.out.println("Constructeur de dés");
    }
   public void Rouler(){
       int min=1;
    
       this.valeur_de=(int) (Math.random()*Nombre_face_de+1);
   }
   public int getValeur(){
       
       return this.valeur_de;
   }
}
