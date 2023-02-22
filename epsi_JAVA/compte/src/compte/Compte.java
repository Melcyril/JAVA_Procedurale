package compte;
import java.util.Scanner;

public class Compte {

    /* - protected
       # 
    */
    protected static int cpt = 0;
    protected final int numCompte;
    protected final String nomCompte;
    protected float soldeCompte=0;
    protected float autorisationDecouvert=800;
    protected float debitMax=1000;
    public Scanner key = new Scanner(System.in);
    public static final String ANSI_RED = "\u001B[31m";
   
    public Compte() {
        this.cpt++;
        this.numCompte=this.cpt;
        System.out.print("Entrer le nom du compte : ");
        this.nomCompte = key.nextLine();
        this.soldeCompte = this.readFloat("Entrer le solde du compte : ");
    }
    
    public Compte(String nom) {
        this.cpt++;
        this.numCompte=this.cpt;
        this.nomCompte=nom;
    }
    
    public Compte(String nom,float solde) {
        this.cpt++;
        this.numCompte=this.cpt;
        this.nomCompte=nom;
        this.soldeCompte=solde;
    }
    
    public Compte(String nom,float solde, int autorisation, int debmax) {
        this.cpt++;
        this.numCompte=this.cpt;
        this.nomCompte=nom;
        this.soldeCompte=solde;
        this.autorisationDecouvert=autorisation;
        this.debitMax=debmax;
    }
            
    public boolean adecouvert(){
        return (this.soldeCompte<0);
    }
    
    public void crediter(float somme) {
        this.soldeCompte += somme;
        System.out.println("Compte : "+this.numCompte+" ("+this.nomCompte+") - Crédit de "+somme+" réussi");
    }
    
    public boolean debiter(float somme) {
        if (this.autorisationDecouvert>somme-this.soldeCompte && somme < this.debitMax) { 
            this.soldeCompte -= somme;
            System.out.println("Compte : "+this.numCompte+" ("+this.nomCompte+") - Débit de "+somme+" réussi");
            return true;
        }
        else { 
            System.out.println("\nDébit impossible -> Solde Insuffisant ou Débit Max autorisé dépassé - Opération abandonnée");
            return false;
        }
    }
    
    public void virement(float somme,Compte compteCible) {
        if (this.debiter(somme)) {
            compteCible.crediter(somme);
            System.out.println("\nVirement effectué");
        }
        else
            System.out.println("\nVirement impossible -> Solde Insuffisant ou Débit Max autorisé dépassé - Opération abandonnée");
    }
    
    public void setSolde(float montant) {
      this.soldeCompte = montant;
    }
    @Override
    public String toString() {
        String texte;
        String cSolde = String.format("%.2f €", this.soldeCompte);
        String cAut = String.format("%.2f €", this.autorisationDecouvert);
        String cDebit = String.format("%.2f €", this.debitMax);
        
        texte = "\n-------------------------------------------\n"+
                this.numCompte+"   "+
                this.nomCompte+
                "\nSolde: " + cSolde +
                "   Autorisation Découvert: " + cAut +
                "   Débit Max: " + cDebit;
        
        if (this.adecouvert()) texte=texte+ANSI_RED+"\nATTENTION - Compte à découvert";
        return texte;
  }
    
    public float readFloat(String message) {
        float x=0;
        boolean fin;
        do
        { fin=true;
          try
          {
              System.out.print(message);
              x=key.nextFloat();
          }
          catch (Exception e)
          {   System.out.println("Problème de lecture au calver \n");
              key.nextLine();
              fin = false;
          }
        } while (fin==false);
        return x;
    }
  
}