import java.util.Scanner;

public class Statistique {

	private int nombre_partie_stat_;
	private int nombre_partie_joueur_stat_;
	private int nombre_partie_ = 0;
	private int total_partie_;
	private Joueur player_1_;
	private Joueur player_2_;
	private Joueur_humain joueur_humain_;
	private Joueur_virtuel joueur_virtuel_;

	public Statistique() {
		String rep1="";
		int totalj1_=0;
		int totalj2_=0;
		
		do{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Choisissez le nombre de partie : ");
		int nb_partie=sc.nextInt();
		nombre_partie_stat_ = nb_partie;
		
		
		player_1_ = new Joueur_virtuel("Bill");
		
		player_2_ = new Joueur_virtuel("Linus");
		
		player_1_.setNom_joueur_("Bill");
		
		player_2_.setNom_joueur_("Linus");
		
		
		for (int i = 1; i <= nombre_partie_stat_; i++) {


			// player_2_.setNom_joueur_(rep_nom_joueur2);

			Affichage affichage_ = new Affichage("muet", player_1_, player_2_);

			
			affichage_.Affichage_Muet_();
			
			
			totalj1_=totalj1_+affichage_.getNbre_partie_gagne_joueur1();
			totalj2_=totalj2_+affichage_.getNbre_partie_gagne_joueur2();
			
		
			
		}
		System.out.println("#"+player_1_.getNom_joueur_() + "#"+totalj1_ );
		System.out.println("#"+player_2_.getNom_joueur_() + "#"+ totalj2_);
		
		 totalj1_=0;
		 totalj2_=0;
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("Désirez vous une autre statistique ?");
		rep1=sc1.nextLine();

		} while (rep1.equals("oui"));
	}

}
