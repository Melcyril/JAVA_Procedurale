package heritage;

public class Camion extends Vehicule{
   private int puissance;
   
//************************ Constructeu par spécialisé **************************
  //On appelle la classe mère super
  // en java ne fonctionne pas--> utiliser le nom de la classe mère
  // Si on utilise pas super le constructeur par defaut de la classe sera appelé
  public Camion(String immatriculation, int nbRoues, int puissance) {
 	//super(immatriculation,nbRoues) ;
    	this.puissance = puissance;
        System.out.println("Constructeur Camion avec paramétre....");
  }
//*************** Constructeu par défaut ***************************************
  public Camion() {
    System.out.print("Entrer la puissance : ");
    this.puissance = Key.nextInt();
    System.out.println("Constructeur Camion par défaut....");
  }
  //************************************************************************
  public void Affiche()
  {
     super.Affiche();
     System.out.println("La puissance du camion est : " + this.puissance);
  }
//************************************************************************
  @Override
  public String  toString()
  {
    return (super.toString() + "\nLa puissance du camion est : " + this.puissance ); 
  }
}
