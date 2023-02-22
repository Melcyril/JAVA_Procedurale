/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_java;
import java.util.ArrayList;
/**
 *
 * @author cyril
 */
public class Magasin {
    protected float SoldeMagasin=5000;
    ArrayList<Produit> StockProduitMagasin = new ArrayList<Produit>();
    
    public Magasin(){
        
    }
    public void ajouterProduit(String nom,float prixachat,float prixvente){
        Produit p =new Produit(nom, prixachat, prixvente);
        StockProduitMagasin.add(p);
        
    }
    public void ajouterLivre(String nom,float prixachat,float prixvente,String auteur,String editeur){
        Livre l =new Livre(nom, prixachat, prixvente, auteur, editeur);
        StockProduitMagasin.add(l);
        
    }
    public void acheterProduit(int referenceProduit,int nombreExemplaires){
        Produit p = StockProduitMagasin.get(referenceProduit);
        if(SoldeMagasin>nombreExemplaires* p.GetPrixAchatProduit()){
            SoldeMagasin=SoldeMagasin-nombreExemplaires* p.GetPrixAchatProduit();
            p.NbreStockProduit=p.NbreStockProduit+nombreExemplaires;
            p.SetNbreStockProduit(p.NbreStockProduit);
        }else{
            System.out.println("Le solde est insuffisant");
        }                
    }
    
    public void vendreProduit(int referenceProduit,int nombreExemplaires){
        Produit p = StockProduitMagasin.get(referenceProduit);
        if(p.NbreStockProduit>=nombreExemplaires){
             SoldeMagasin=SoldeMagasin+nombreExemplaires* p.GetPrixVenteProduit();
            p.NbreStockProduit=p.NbreStockProduit-nombreExemplaires;
            p.SetNbreStockProduit(p.NbreStockProduit);
        }else{
            System.out.println("On ne peut pas vendre plus de produit qu'on en a");
        }

    }
   
   
    public void Bilan(){
        System.out.println("Bilan du magasin");
        for(int i=0;i<StockProduitMagasin.size();i++){
            System.out.println(StockProduitMagasin.get(i).toString() +
                    "Stock : "+StockProduitMagasin.get(i).GetNbreStockProduit()+
                    " Budget : "+SoldeMagasin);
        }
    }
    
}
