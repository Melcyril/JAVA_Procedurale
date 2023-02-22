/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livre;

/**
 *
 * @author cyril
 */
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        Livre livre1;
        Livre livre2;
        livre1=new Livre("Blanc Michel","Les masos");
        livre2=new Livre("Bleu Denis","Les eaux");
        livre1.setNbPages(200);
        livre2.setNbPages(50);
                
        //System.out.println(livre1.getAuteur()+ "\n"+livre2.getAuteur());
        //Affichage des 2 livres(va rechercher la méthode tostring avec override de la classe Livre
        System.out.println(livre1+"\n");
        System.out.println(livre2);
    }
}
