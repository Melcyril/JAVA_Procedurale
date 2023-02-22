/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_java;

/**
 *
 * @author cyril
 */
public class Tp_Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Magasin m=new Magasin();
      
        m.ajouterProduit("ps5", 400, 600);
        m.acheterProduit(0, 5);
        m.vendreProduit(0, 2);
        m.Bilan();
        m.ajouterLivre("Manuel de  la ps5", 22, 30, "Cyril", "Sony");
        m.acheterProduit(1, 1);
        m.vendreProduit(1, 1);
        m.Bilan();
    }
    
}
