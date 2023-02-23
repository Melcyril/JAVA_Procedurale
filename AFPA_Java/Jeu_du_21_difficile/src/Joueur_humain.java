import java.util.Scanner;

public class Joueur_humain extends Joueur {

	private String nom_joueur_humain_;
	private int score_joueur_humain_;
	private int nombre_victoire_humain;

	public Joueur_humain(String nom) {
		nom_joueur_humain_ = nom;

	}

	public int myRandom() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Appuyez sur Entrée pour lancer votre dé: ");
		String rep = sc.nextLine();
		
		int mini = 1;
		int resultat = (int) (Math.random() * (6 - mini)) + mini;
		
		return resultat;

	}


	public String getNom_joueur_humain_() {
		return nom_joueur_humain_;
	}

	public void setNom_joueur_humain_(String nom_joueur_humain_) {
		this.nom_joueur_humain_ = nom_joueur_humain_;
	}

	public int getScore_joueur_humain_() {
		return score_joueur_humain_;
	}

	public void setScore_joueur_humain_(int score_joueur_humain_) {
		this.score_joueur_humain_ = score_joueur_humain_;
	}

	public int getNombre_victoire_humain() {
		return nombre_victoire_humain;
	}

	public void setNombre_victoire_humain(int nombre_victoire_humain) {
		this.nombre_victoire_humain = nombre_victoire_humain;
	}

}
