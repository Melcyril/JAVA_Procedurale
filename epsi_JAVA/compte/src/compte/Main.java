package compte;

public class Main {
        
    public static void main(String[] args) {
        /*
        Compte c1 = new Compte("Romain AZIBOU",1000);
        Compte c2 = new Compte("Caroline MARTIN",50000,5000,6000);
               
        System.out.println(c1);
        System.out.println(c2);
         
        c1.debiter(1000);
        c2.debiter(600);
        c1.crediter(500);
        c2.virement(1000,c1);
        
        System.out.println(c1);
        System.out.println(c2);
         
        Compte c3 = new Compte();
        System.out.println(c3);
        */
                  
        //Banque BNP = new Banque("BNP","Arras");
        //BNP.ajouteCompte();
       
        //for (int i=1;i<=3;i++)
        //    BNP.ajouteOrdonne(new Compte());
        /*
        Compte c1 = new Compte("Romain AZIBOU",1000);
        BNP.ajouteOrdonne(c1);
        
        BNP.ajouteOrdonne(new Compte("Michel",-1000,5000,6000));
        BNP.ajouteOrdonne(new Compte("Cyril",9000));
        BNP.ajouteOrdonne(new Compte("Antoine",13000));
        BNP.ajouteOrdonne(new Compte("Martin",12000,1000,2000));
        BNP.ajouteOrdonne(new Compte("michel",100000,5000,6000));
        System.out.println(BNP);
         
        BNP.rechercheCompte();
                */
        LivretA c=new LivretA();
        System.out.println(c);
    }
}
