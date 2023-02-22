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
public class Produit {
    protected String NomProduit;
    protected float PrixAchatProduit;
    protected float PrixVenteProduit;
    protected int NbreStockProduit=0;
    protected String descriptionProduit="Pas de description";
    public Produit(){
        
    }
    public Produit(String nomproduit,float prixachat,float prixvente){
        NomProduit=nomproduit;
        PrixAchatProduit=prixachat;
        PrixVenteProduit=prixvente;
        NbreStockProduit=0;
    }
    
    @Override
    public String toString(){
        return("Produit : "+this.NomProduit+"\n"+"Description du produit :"+this.descriptionProduit+"\n");
    }
    
    public int GetNbreStockProduit(){
        return NbreStockProduit;
    }
    public void SetNbreStockProduit(int nbreStockProduit ){
        NbreStockProduit=nbreStockProduit;
    }
    public float GetPrixAchatProduit(){
        return PrixAchatProduit;
    }
    public void SetPrixAchatProduit(float prixAchatProduit){
        PrixAchatProduit=prixAchatProduit;
    }
    public float GetPrixVenteProduit(){
        return PrixVenteProduit;
    }
    public void SetPrixVenteProduit(float prixAchatProduit){
        PrixVenteProduit=prixAchatProduit;
    }
}
