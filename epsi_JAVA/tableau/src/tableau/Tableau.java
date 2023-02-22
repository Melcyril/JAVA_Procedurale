/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tableau;
import java.util.Scanner;
/**
 *
 * @author cyril
 */

public class Tableau {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tableau[]= new int[4];
        Scanner key=new Scanner(System.in);
        for(int i=0;i<tableau.length;i++){
            System.out.print("Entrer un nombre entier : ");
            tableau[i]=key.nextInt();                      
        }
        for(int j=0;j<tableau.length;j++){
            System.out.println(tableau[j]);
        }
    }
    public static int Somme(int tab[]){
        int somme=0;
        for(int j=0;j<tab.length;j++){
            somme=somme + tab[j];
        }
        return somme;
    }
    public static float moy(int tabmoy[]){
        float moy=0;
        moy=(float)Somme(tabmoy) /tabmoy.length;
        
        return moy;
    }
    
}
