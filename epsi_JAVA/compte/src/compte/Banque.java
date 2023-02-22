package compte;
import java.util.Scanner;

public class Banque {
    
    protected final int MAX;
    protected String nomBanque;
    protected String villeBanque;
    protected int nbrComptes = 0;
    protected Compte listeComptes [];
    public Scanner key = new Scanner(System.in);
    
    
    
    public Banque (String nom, String ville) {
        this.nomBanque=nom;
        this.villeBanque=ville;
        this.afficheBanniere();
        System.out.print("\nEntrer la taille du tableau de comptes : ");
        this.MAX = key.nextInt();
        this.listeComptes = new Compte[MAX];
    }
    
    public void afficheChar(String chaine,int n) {
        for (int i=1;i<=n;i++)
            System.out.print(chaine);
    }
    public void afficheBanniere(){
        int l=35; // largeur banniere
        afficheChar("*",l);
        System.out.print("\n** BIENVENUE A LA "+this.nomBanque);
        afficheChar(" ",l-20-this.nomBanque.length());
        System.out.print("**\n** Agence : "+this.villeBanque);
        afficheChar(" ",l-14-this.villeBanque.length());
        System.out.print("**\n");
        afficheChar("*",l);
    }
    
    public void ajouteCompte(){
        listeComptes[this.nbrComptes]= new Compte();
        this.nbrComptes++;
    }
    
    public void ajouteOrdonne(Compte newCompte)
    {   int i = this.nbrComptes-1;
        while (i>=0 && 
        this.listeComptes[i].nomCompte.compareToIgnoreCase(newCompte.nomCompte)>0)
        {   listeComptes[i+1]=listeComptes[i];
            i--;
        }
        listeComptes[i+1]=newCompte;
        this.nbrComptes++;
    }
    
    public boolean existeCompte(String nom)
    {   int i = 0;
        boolean present=false;
        while (i<this.nbrComptes && present==false)
        {
            present=(this.listeComptes[i].nomCompte.compareToIgnoreCase(nom)==0);
            i++;
        }
        return present;
    }
    
    public int chercheIndexCompte(String nom)
    {   int i = 0;
        while (i<this.nbrComptes && this.listeComptes[i].nomCompte.compareToIgnoreCase(nom)!=0)
        {   i++;
        }
        if (i<this.nbrComptes) return i;
        else return -1;
      
    }
    
    public void rechercheCompte()
    {   int indexTrouve;
        String recherche;
        key.nextLine(); //on vide buffer
        System.out.print("\nEntrer le nom du compte que vous recherchez: ");
        recherche=key.nextLine();
        indexTrouve=this.chercheIndexCompte(recherche);
        if (indexTrouve==-1)
            System.out.print("\n**  Le Compte "+recherche+" n'existe pas **");
        else {
            System.out.print("\n**  Le Compte "+recherche+" existe **");
            System.out.println(listeComptes[indexTrouve].toString());
        }
                
    }
    
    public String toString() {
        String texte;
        texte = ("\nBanque : " + this.nomBanque+
                "\nVille : " + this.villeBanque+
                "\nListe des Comptes : ");
        for (int i=0;i<this.nbrComptes;i++) {
            texte = texte + listeComptes[i].toString();
        }
        return texte;
    }

}