package heritage;
import java.util.Scanner;

public class Vehicule {
  protected Scanner Key = new Scanner(System.in); 
  protected String immatriculation;
  protected int nbRoues;
  protected int vitesse = 0;
  //***************************************************************
  public Vehicule(String immatriculation, int nbRoues) {
    this.immatriculation = immatriculation ; 
    this.nbRoues = nbRoues;
    System.out.println("Constructeur Vehicule avec paramétre....");
  }
  //*****************************************
  public Vehicule() {
    System.out.print("Entrer l'immatriculation : ");
    this.immatriculation = Key.nextLine();
    System.out.print("Entrer le nombre de roues : ");
    this.nbRoues = Key.nextInt();
     System.out.print("Entrer la vitesse : ");
    this.vitesse = Key.nextInt();
    System.out.println("Constructeur Vehicule par défaut ....");
  }
 //******************************************************************
  public void Accelerer () 
  { 
      vitesse += 10; 
  }
 //******************************************************************
  public void Affiche()
  {
     System.out.println("L'Immatriculation : " + this.immatriculation + "\n"+
                        "Le nombre de roues : " + this.nbRoues  +"\n"+ 
                        "La vitesse est : " + this.vitesse);
  }
 //******************************************************************
  @Override
  public String toString()
  {
     return ("L'Immatriculation : " + this.immatriculation + "\n"+
                        "Le nombre de roues : " + this.nbRoues  +"\n"+ 
                        "La vitesse est : " + this.vitesse);
  }
 //******************************************************************
  public int getVitesse() {
     return this.vitesse;
  }
//******************************************************************
  public void setVitesse(int vitesse) {
      this.vitesse = vitesse ;
  }
}
