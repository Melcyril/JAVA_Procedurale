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
public class Livre extends Produit{
   protected String Auteur;
   protected String Editeur;
   public Livre(){
       
   }
   @Override
   public String toString(){
       return "\n Auteur : "+Auteur+"\n Editeur :"+Editeur+"\n";
   }
   public Livre(String auteur,String editeur){
       Auteur=auteur;
       Editeur=editeur;
   }
   public Livre(String nom,float prixachat,float prixvente,String auteur,String editeur){
       this.NomProduit=nom;
       this.PrixAchatProduit=prixachat;
       this.PrixVenteProduit=prixvente;
       Auteur=auteur;
       Editeur=editeur;
   }

}
