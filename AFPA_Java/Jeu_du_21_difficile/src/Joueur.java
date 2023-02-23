
public abstract class Joueur { //classe abstraite
	
	private String nom_joueur_;
	private String type_joueur_;
	private int de_faces_;
	private int score_joueur_;
	
	




	abstract int myRandom(); 
	
	
	
	public String getNom_joueur_() {
		return nom_joueur_;
	}
	public void setNom_joueur_(String nom_joueur_) {
		this.nom_joueur_ = nom_joueur_;
	}
	public String getType_joueur_() {
		return type_joueur_;
	}
	public void setType_joueur_(String type_joueur_) {
		this.type_joueur_ = type_joueur_;
	}
	public int getDe_faces_() {
		return de_faces_;
	}
	public void setDe_faces_(int de_faces_) {
		this.de_faces_ = de_faces_;
	}
	
	public int getScore_joueur_() {
		return score_joueur_;
	}



	public void setScore_joueur_(int score_joueur_) {
		this.score_joueur_ = score_joueur_;
	}
	
}
