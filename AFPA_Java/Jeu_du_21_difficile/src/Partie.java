import java.util.Scanner;

public class Partie {

	private int nombre_partie_=0;
	private int total_partie_;
	private Joueur player_1_;
	private Joueur player_2_;
	private Joueur_humain joueur_humain_;
	private Joueur_virtuel joueur_virtuel_;

	public Partie() {

		
		
		
		System.out.println("Bienvenue au jeu du 21!C'est parti...");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choisissez type affichage [console - fichier - muet]:");
		String rep_type_affichage = sc.nextLine();

		System.out.println("Entrez le type de joueur[humain - virtuel]");
		String rep_type_joueur1 = sc.nextLine();

		System.out.println("Entrez le nom de joueur");
		String rep_nom_joueur1 = sc.nextLine();

		
		
		
		
		
		
		if (rep_type_joueur1.equals("humain")) {
			
			
			player_1_ = new Joueur_humain(rep_nom_joueur1);
			player_1_.setNom_joueur_(rep_nom_joueur1);

		}
		if (rep_type_joueur1.equals("virtuel")) {
			
			player_1_ = new Joueur_virtuel(rep_nom_joueur1);
			player_1_.setNom_joueur_(rep_nom_joueur1);
		}

		
		
		
		
		System.out.println("Entrez le type de joueur[humain - virtuel]");
		String rep_type_joueur2 = sc.nextLine();

		System.out.println("Entrez le nom de joueur");
		String rep_nom_joueur2 = sc.nextLine();

		
		
		
		
		if (rep_type_joueur2.equals("humain")) {
			player_2_=new Joueur_humain(rep_nom_joueur2);
			player_2_.setNom_joueur_(rep_nom_joueur2);
		} 
		if (rep_type_joueur2.equals("virtuel")) {
			player_2_=new Joueur_virtuel(rep_nom_joueur2);
			player_2_.setNom_joueur_(rep_nom_joueur2);
		}

		
		
		
		Affichage affichage_ = new Affichage(rep_type_affichage, player_1_, player_2_);

		affichage_.setType_affichage_(rep_type_affichage);
		
		


		
		
		
		if (affichage_.getType_affichage_().equals("console")) {
			
			
			affichage_.Affichage_console_();
			
			
		} else if (affichage_.getType_affichage_().equals("fichier")) {
			
			affichage_.Affichage_fichier_();
			
		} else if (affichage_.getType_affichage_().equals("muet")) {
			
			affichage_.Affichage_Muet_();
			
			
		} else {
			System.out.println("Erreur de saisie");
		}

		nombre_partie_++;
				


	}

	public Joueur getPlayer_1_() {
		return player_1_;
	}

	public void setPlayer_1_(Joueur player_1_) {
		this.player_1_ = player_1_;
	}

	public Joueur getPlayer_2_() {
		return player_2_;
	}

	public void setPlayer_2_(Joueur player_2_) {
		this.player_2_ = player_2_;
	}

	public Joueur_humain getJoueur_humain_() {
		return joueur_humain_;
	}

	public void setJoueur_humain_(Joueur_humain joueur_humain_) {
		this.joueur_humain_ = joueur_humain_;
	}

	public Joueur_virtuel getJoueur_virtuel_() {
		return joueur_virtuel_;
	}

	public void setJoueur_virtuel_(Joueur_virtuel joueur_virtuel_) {
		this.joueur_virtuel_ = joueur_virtuel_;
	}

	public void setTotal_partie_(int total_partie_) {
		this.total_partie_ = total_partie_;
	}

	protected int getNombre_partie_() {
		return nombre_partie_;
	}

	protected void setNombre_partie_(int nombre_partie) {
		this.nombre_partie_ = nombre_partie;
	}

	protected int getTotal_partie_() {
		return total_partie_;
	}

	protected void setTotal_partie(int total_partie) {
		this.total_partie_ = total_partie;
	}

}
