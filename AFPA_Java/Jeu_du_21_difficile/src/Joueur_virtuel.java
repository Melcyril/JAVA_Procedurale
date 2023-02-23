
public class Joueur_virtuel extends Joueur {

	private String nom_joueur_virtuel_;
	private int score_joueur_virtuel_;
	private int nombre_victoire_joueur_virtuel;
	
	
	public Joueur_virtuel(String nom){
		nom_joueur_virtuel_=nom;
		
	}
	public int myRandom() {
		int mini = 1;

		int resultat = (int) (Math.random() * (6 - mini)) + mini;
		return resultat;
	}
	
	public String getNom_joueur_virtuel_() {
		return nom_joueur_virtuel_;
	}
	
	
	public void setNom_joueur_virtuel_(String nom_joueur_virtuel_) {
		this.nom_joueur_virtuel_ = nom_joueur_virtuel_;
	}
	
	
	public int getScore_joueur_virtuel_() {
		return score_joueur_virtuel_;
	}
	
	
	public void setScore_joueur_virtuel_(int score_joueur_virtuel_) {
		this.score_joueur_virtuel_ = score_joueur_virtuel_;
	}
	
	
	public int getNombre_victoire_joueur_virtuel() {
		return nombre_victoire_joueur_virtuel;
	}
	
	
	public void setNombre_victoire_joueur_virtuel(int nombre_victoire_joueur_virtuel) {
		this.nombre_victoire_joueur_virtuel = nombre_victoire_joueur_virtuel;
	}
	
	
	
}
