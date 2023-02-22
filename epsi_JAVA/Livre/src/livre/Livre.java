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
public class Livre {

    // Variables

    private String titre, auteur;
    private int nbPages;
    
    //Override = Surcharge
    @Override
    public String toString(){
        return("Lauteur : "+this.auteur+"\n"+
                "Le titre : "+ this.titre+"\n"+
                "Nombre de page : "+this.nbPages);
    }
    // Constructeur

    public Livre(String unAuteur, String unTitre) {
        auteur = unAuteur;
        titre = unTitre;
    }
    void setLivre(String unAuteur, String unTitre){
        this.auteur=unAuteur;
        this.titre=unTitre;
    }

    // Accesseur

    public String getAuteur() {
        return auteur;
    }
    public String getTitre(){
        return titre;
    }
    public int getNbPages(){
      
            return nbPages;
        
    }
    // Modificateur

    void setNbPages(int nb) {
        nbPages = nb;
    }

}
