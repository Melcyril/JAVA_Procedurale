package heritage;

public class Main {
    public static void main(String[] args) {
        
    /*    Vehicule monVehicule = new Vehicule();
        System.out.println(monVehicule);*/
        
   /*  Camion unCamion = new Camion();   
     System.out.println(unCamion);
    /*  Vehicule unVehicule = new Vehicule("AQ-59-FR", 4);
      unVehicule.setVitesse(20);
      System.out.println(unVehicule);*/
      
        //Géneralisation--> de la classe supèreieur à la classe infèrieur
      //Vehicule unCamion = new Camion() ;
      
      //heritage ---> de la classe inferieur à la classe superieur
      //Camion unCamion = new Camion() ; 
      
     
      
      Vehicule garage[]= new Vehicule[3];
      garage[0]=new Vehicule("AG-450-RW",4);
      garage[1]=new Camion("CAMION-450-FF",12,250);
      garage{2]=new Vehicule();
      
    }
      
      for(int i=0;i<garage.length;i++){
          System.out.println("---------------------------------");
          System.out.println(garage[i]);
          System.out.println("---------------------------------");
      }
      
      
      
      
      
      
      //unCamion.Accelerer();
     //System.out.println("La vitesse du véhicules est : " + unCamion.getVitesse());*/
     
    }
    
}





//Camion unCamion = new Camion(123,2500) ;
