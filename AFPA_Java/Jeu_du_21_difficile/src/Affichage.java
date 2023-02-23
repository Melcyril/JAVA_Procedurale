import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Affichage {

	private String type_affichage_;
	private String console_affichage_;
	private String fichier_affichage_;
	private String muet_affichage_;
	private Joueur player_1_;
	private Joueur player_2_;
	private Joueur_humain joueur_humain_;
	private Joueur_virtuel joueur_virtuel_;
	private int total_partie_;
	private Partie partie_;
	private int nbre_partie_gagne_joueur1;
	private int nbre_partie_gagne_joueur2;

	public Affichage(String type, Joueur player1, Joueur player2) {

		type_affichage_ = type;
		player_1_ = player1;
		player_2_ = player2;

	}

	public void Affichage_console_() {

		while (total_partie_ < 21) {

			player_1_.setScore_joueur_(player_1_.myRandom());
			total_partie_ = total_partie_ + player_1_.getScore_joueur_();

			if (total_partie_ >= 21) {

				System.out.println(player_1_.getNom_joueur_() + " a lancé " + player_1_.getScore_joueur_() + "\n"
						+ "le total est de " + total_partie_);

				System.out.println();

				System.out.println(player_1_.getNom_joueur_() + " est le gagnant");

				nbre_partie_gagne_joueur1++;

				//System.out.println(nbre_partie_gagne_joueur1);
				//System.out.println(nbre_partie_gagne_joueur2);
				break;

			} else {

				System.out.println(player_1_.getNom_joueur_() + " a lancé " + player_1_.getScore_joueur_() + "\n"
						+ "le total est de " + total_partie_);
				System.out.println();

			}

			System.out.println();

			player_2_.setScore_joueur_(player_2_.myRandom());
			total_partie_ = total_partie_ + player_2_.getScore_joueur_();

			if (total_partie_ >= 21) {

				System.out.println(player_2_.getNom_joueur_() + " a lancé " + player_2_.getScore_joueur_() + "\n"
						+ "le total est de " + total_partie_);

				System.out.println();

				System.out.println(player_2_.getNom_joueur_() + " est le gagnant");

				nbre_partie_gagne_joueur2++;

				System.out.println(nbre_partie_gagne_joueur1);
				System.out.println(nbre_partie_gagne_joueur2);

			} else {

				System.out.println(player_2_.getNom_joueur_() + " a lancé " + player_2_.getScore_joueur_() + "\n"
						+ "le total est de " + total_partie_);
				System.out.println();

			}

		}
	}

	public void Affichage_fichier_() {

		String phrase = "";

		while (total_partie_ < 21) {

			player_1_.setScore_joueur_(player_1_.myRandom());
			total_partie_ = total_partie_ + player_1_.getScore_joueur_();

			if (total_partie_ >= 21) {

				phrase = phrase + player_1_.getNom_joueur_() + " a lancé " + player_1_.getScore_joueur_() + "\r\n"
						+ "le total est de " + total_partie_ + "\r\n";

				phrase = phrase + player_1_.getNom_joueur_() + " est le gagnant";

				nbre_partie_gagne_joueur1++;

				this.writeMyStr("partie_fichier.txt", phrase);

				break;

			} else {

				phrase = phrase + player_1_.getNom_joueur_() + " a lancé " + player_1_.getScore_joueur_() + "\r\n"
						+ "le total est de " + total_partie_ + "\r\n";

			}

			player_2_.setScore_joueur_(player_2_.myRandom());
			total_partie_ = total_partie_ + player_2_.getScore_joueur_();

			if (total_partie_ >= 21) {

				phrase = phrase + player_2_.getNom_joueur_() + " a lancé " + player_2_.getScore_joueur_() + "\r\n"
						+ "le total est de " + total_partie_ + "\r\n";

				phrase = phrase + player_2_.getNom_joueur_() + " est le gagnant";

				nbre_partie_gagne_joueur2++;

				this.writeMyStr("partie_fichier.txt", phrase);

			} else {

				phrase = phrase + player_2_.getNom_joueur_() + " a lancé " + player_2_.getScore_joueur_() + "\r\n"
						+ "le total est de " + total_partie_ + "\r\n";

			}

		}
	}

	public void Affichage_Muet_() {

		while (total_partie_ < 21) {

			player_1_.setScore_joueur_(player_1_.myRandom());
			total_partie_ = total_partie_ + player_1_.getScore_joueur_();

			if (total_partie_ >= 21) {

				//System.out.println(player_1_.getNom_joueur_() + " est le gagnant");

				nbre_partie_gagne_joueur1++;

				break;

			} else {

				player_2_.setScore_joueur_(player_2_.myRandom());
				total_partie_ = total_partie_ + player_2_.getScore_joueur_();

				if (total_partie_ >= 21) {
					//System.out.println(player_2_.getNom_joueur_() + " est le gagnant");

					nbre_partie_gagne_joueur2++;

					break;
				}
			}
		}
	}

	public static String writeMyStr(String namefile, String phrase) {

		File output = new File(namefile); // crée le fichier
		FileWriter writer;

		try {
			writer = new FileWriter(output);
			BufferedWriter buffer = new BufferedWriter(writer);
			buffer.write(phrase);
			buffer.flush();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return phrase;
	}

	public String getType_affichage_() {
		return type_affichage_;
	}

	public void setType_affichage_(String type_affichage_) {
		this.type_affichage_ = type_affichage_;
	}

	public String getConsole_affichage_() {
		return console_affichage_;
	}

	public void setConsole_affichage_(String console_affichage_) {
		this.console_affichage_ = console_affichage_;
	}

	public String getFichier_affichage_() {
		return fichier_affichage_;
	}

	public void setFichier_affichage_(String fichier_affichage_) {
		this.fichier_affichage_ = fichier_affichage_;
	}

	public String getMuet_affichage_() {
		return muet_affichage_;
	}

	public void setMuet_affichage_(String muet_affichage_) {
		this.muet_affichage_ = muet_affichage_;
	}

	public int getTotal_partie_() {
		return total_partie_;
	}

	public void setTotal_partie_(int total_partie_) {
		this.total_partie_ = total_partie_;
	}

	public int getNbre_partie_gagne_joueur1() {
		return nbre_partie_gagne_joueur1;
	}

	public void setNbre_partie_gagne_joueur1(int nbre_partie_gagne_joueur1) {
		this.nbre_partie_gagne_joueur1 = nbre_partie_gagne_joueur1;
	}

	public int getNbre_partie_gagne_joueur2() {
		return nbre_partie_gagne_joueur2;
	}

	public void setNbre_partie_gagne_joueur2(int nbre_partie_gagne_joueur2) {
		this.nbre_partie_gagne_joueur2 = nbre_partie_gagne_joueur2;
	}
}
