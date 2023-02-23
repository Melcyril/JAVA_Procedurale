package Exercices;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ExerciceJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		afficherUn();
		afficherDeux();
		afficherTrois();
		afficherNombre();
		System.out.println();
		alphabet();
		System.out.println();
		valeurAbsolue(-5);
		
		//Afficher un tableau
		int tableau[] = { 3, 6, 5, 1, 2 };
		 afficherTableau(tableau);
		 System.out.println();
		 maxTab(tableau);
		 moyenne(6, 10, 3);
		 notes(12);
		 factorielles(4);
		 puissance(5,3);
		 voyelles("Le nombre de voyelle");
		 consonnes("Le nombre de consonne");
		 ligne(15);
		 rectangle(5,2);
		 triangle(5);
		 table_multiplication(10);
		 majuscules("Il y aura cette chaine en majuscule");
		 max(5,7,2);
		 //getNumber();
		 swapValues(tableau, 0, 4);
		 System.out.println();
		 //containsMaj();
	     int tab[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, {13, 14, 15, 16 } };
		 diagMatrice(tab);
		 System.out.println();
		 //addition();
		equationSecondDegre(1,4,0);
		//palindromeWord();
		extract_one("320");
		covert_binaire(32);
		//pendu(7);
		sapin_un(10);
		sortTab(tableau);
	}
	private static void afficherUn() {
		System.out.println("Je\nvais\napprendre à coder en java");

	}

	private static void afficherDeux() {
		System.out.println("Je\n\tvais apprendre à\n\t\ttransformer des donnnées");

	}

	public static void afficherTrois() { 
		// pour afficher un antislash on ajoute un anti slash davant
		
		System.out.println("Affichons cela ({()~/\\~()||__&& \\n\\t\\r§µ\\o\\u---¤}.");
	}
	
	public static void afficherNombre() {
		int i = 0;

		while (i < 50) {
			System.out.print(i + " ");
			i++;
		}
		
	}
	public static void alphabet() {

		for (int ascii = 65; ascii <= 90; ascii++) { // on peut remplacer 65 par
														// 'A' et 90 par 'Z'
			System.out.print((char) ascii);
		}
	}
	
	public static int valeurAbsolue(int entier) {
		if (entier < 0) {
			System.out.println(-entier);
		} else {
			System.out.println(entier);
		}
		return entier;
	}
	
	public static void afficherTableau(int entier[]) {
		int cpt = 0;
		
		while (cpt < entier.length) {
			System.out.print(entier[cpt]);
			cpt++;
		}

	}
	public static void maxTab(int tablo[]) {
		int max = tablo[0];
		int i = 0;
		while (i < tablo.length) {
			if (tablo[i] > max) {
				max = tablo[i];
			}
			i++;
		}
		System.out.println(max);
	}
	public static double moyenne(double entier1, double entier2, double entier3) {
		double resultat;
		resultat = (entier1 + entier2 + entier3) / 3;
		System.out.println(resultat);
		return resultat;
	}
	public static void notes(int manote) {

		switch (manote) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("mauvaise note");
			break;

		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
			System.out.println("note médiocre");
			break;

		case 11:
		case 12:
		case 13:
		case 14:
		case 15:
			System.out.println("note correcte");
			break;

		case 16:
		case 17:
		case 18:
		case 19:
		case 20:
			System.out.println("bonne note");
			break;

		}
	}
	public static int factorielles(int entier) {

		int i = entier;
		int resultat = entier;
		while (i != 1) {
			i--;
			resultat = resultat * i;

		}
		System.out.println(resultat);
		return resultat;
	}
	public static int puissance(int entier, int puissance) {
		int resultat = entier, i = 1;

		while (i != puissance) {
			resultat = resultat * entier;
			i++;
		}
		System.out.println(resultat);
		return resultat;
	}
	public static int voyelles(String chaine) {
	
		int i = 0, j = 0;
		String voyelle = "AEIOUY";
		int nbvoyelle = 0;

		if (chaine.length() != 0) {

			for (i = 0; i < chaine.length(); i++) {
				for (j = 0; j <voyelle.length(); j++) {
					if (voyelle.charAt(j) == chaine.charAt(i) ||voyelle.toLowerCase().charAt(j) == chaine.charAt(i)) {
						nbvoyelle++;

					}
				}
			}
		}
		System.out.println(nbvoyelle);
		return nbvoyelle;
	}
	public static int consonnes(String chaine) {
		
		int i = 0, j = 0;
		String consonne = "BCDFGHJKLMNPQRSTWXZ";
		int nbcons = 0;

		if (chaine.length() != 0) {

			while (i < chaine.length()) {
				for (j = 0; j <= consonne.length() - 1; j++) {
					if (consonne.charAt(j) == chaine.charAt(i)||consonne.toLowerCase().charAt(j) == chaine.charAt(i)) {
						nbcons++;

					}
				}
				i++;
			}
		}
		System.out.println(nbcons);
		return nbcons;
	}
	public static void ligne(int nbcar) {
		String result = "";
		int i = 0;

		for (i = 0; i <= nbcar - 1; i++) {
			result = result + "*";

		}
		System.out.println(result);

	}

	public static void rectangle(int longueur, int largeur) {
		String resultlarg = "";
		String resultlong = "";

		int i = 0;
		int j = 0;
		for (i = 0; i < longueur; i++) {
			resultlong = resultlong + "*";

		}
		for (j = 0; j < largeur-1; j++) {
			resultlarg = resultlarg + "\n" + resultlong;

		}

		System.out.println(resultlong + resultlarg);
	}
	public static void triangle(int hauteur) {
		String result = "";

		for (int i = 0; i < hauteur; i++) {

			result = result + "*";
			System.out.println(result);

		}
	}
	public static void table_multiplication(int table) {
		int i = 1;
		int j;
		int resultat = 0;
		while (i <= table) {
			for (j = 1; j <= 10; j++) {
				resultat = i * j;
				System.out.printf("%3d", resultat); // le 3 ou plus permet
													// d'avoir un espace entre
													// les r�sultats
			}
			i++;
			System.out.println();

		}
	}
	public static void majuscules(String chaine) {
	// equivalent à ToUppercase
		int i = 0;
		char caractere;
		String resultat = "";

		for (i = 0; i < chaine.length(); i++) {
			caractere = chaine.charAt(i); //
			if (caractere >= 'a' && caractere<='z') {
				caractere = (char) (caractere - 32); // le (char)permet de transformer	on retire l'ascii de 32											// du num�rique en caract�re
			}		
			resultat = resultat + caractere;
		}
		System.out.println(resultat);
	}
	public static int max(int nb1, int nb2, int nb3) {
		int maximum;
		if (nb1 > nb2 && nb1 > nb3) {
			maximum = nb1;

		} else {
			if (nb2 > nb1 && nb2 > nb3) {
				maximum = nb2;
			} else {
				maximum = nb3;
			}

		}
		System.out.println(maximum);
		return maximum;
	}
	public static int getNumber() {
		int nb;

		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Saisir un entier");
			nb = sc.nextInt();
			System.out.println("Le nombre saisi est : "+nb);
		} while (nb % 5 != 0);
		return nb;
	}
	public static void swapValues(int tablo[],int indicenb1, int indicenb2) {
		if(indicenb1<tablo.length && indicenb2<tablo.length) {
			int nb1 = tablo[indicenb1], nb2 = tablo[indicenb2];

			tablo[indicenb1] = nb2;
			tablo[indicenb2] = nb1;
			System.out.println("Echange du nombre à l'indice "+indicenb1+" avec le nombre à l'indice "+indicenb2);
			afficherTableau(tablo);
		}else {
			System.out.println("Erreur");
		}

	}
	public static void containsMaj() {
		char caractere;
		boolean resultat = false;
		int i = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir un mot :");
		String chaine = sc.nextLine();

		for (i = 0; i < chaine.length(); i++) {

			caractere = chaine.charAt(i);

			if ((char) caractere >= 65 && (char) caractere <= 90) { // cara>='A' && cara
		
				resultat = true;
				break; // tr�s utile pour arreter la boucle ou utiliser i=
						// chaine.lenght
			} else {
				resultat = false;
			}

		}
		System.out.println(resultat);
	}
	public static void diagMatrice(int tablo[][]) {
		int i = 0;
		int resultat = 0;
		while (i != tablo[0].length) { // 0 entre crochet permet de trouver la
										// longueur du tableau

			resultat = tablo[i][i];

			System.out.printf("%10d", resultat);
			i++;
		}
	}

	public static void addition() {

		int nb1 = Integer.parseInt(JOptionPane.showInputDialog("Veuillez saisir un premier nombre")); // parseInt																									// integer
		int nb2 = Integer.parseInt(JOptionPane.showInputDialog("Veuillez saisir un deuxieme nombre"));
		JOptionPane.showMessageDialog(null, nb1 + nb2);

	}
	public static void equationSecondDegre(double A, double B, double C) {
		double delta = (B * B) - (4 * A * C);
		double X, X1, X2;
		if (delta > 0) {
			X1 = (-B - Math.sqrt(delta)) / (2 * A);
			X2 = (-B + Math.sqrt(delta)) / (2 * A);
			System.out.println("2 solutions X1 = " + X1 + " et X2 = " + X2);
		} else {
			if (delta == 0) {
				X = -B / (2 * A);
				System.out.println("Une solution X = " + X);

			} else {
				System.out.println("Pas de solution");
			}
		}
	}

	public static void palindromeWord() {
		String chaine = JOptionPane.showInputDialog("veuillez saisir un mot");
		String compar = "", result = "";
		char caractere;
		int l = chaine.length(), i;

		for (i = l - 1; i >= 0; i--) {
			caractere = chaine.charAt(i);
			compar = compar + caractere;
		}

		if (compar.contentEquals(chaine)) { // contentEquals() permet de
											// comparer les 2 chaines
			result = chaine + " est un palindrome";
		
		} else {
			result = chaine + " n'est pas un palindrome";
		}
		System.out.println(result);
	}
	public static void extract_one(String chaine) {
		int longueur = chaine.length();

		if (longueur == 3) {
			System.out.println("centaine : " + chaine.charAt(longueur - 3));
			System.out.println("dizaine : " + chaine.charAt(longueur - 2));
			System.out.println("Unité : " + chaine.charAt(longueur - 1));
		} else {
			if (longueur == 2) {
				System.out.println("dizaine : " + chaine.charAt(longueur - 2));
				System.out.println("Unit� : " + chaine.charAt(longueur - 1));
			}
		}
		if (longueur == 1) {
			System.out.println("dizaine : " + chaine.charAt(longueur - 2));
			System.out.println("Unité : " + chaine.charAt(longueur - 1));
		}	
	}
	public static void covert_binaire(int base_T) {
		int i = 0;
		String base2 = "";
		int rdiv = base_T;
		int rest = 0;

		while (rdiv != 0) {
			rest = rdiv % 2;
			base2 = rest + base2;
			rdiv = rdiv / 2;

		}

		System.out.println(base2);
	}
	public static void pendu(int nbsc) {

		int i = 0;
		char carac = ' ';
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir un mot :");
		String chaine = sc.nextLine();
		char repcarac = ' ';
		char[] caracach = new char[chaine.length()];
		boolean trouve = false;
		int j = 0;
		String rep = "";
		for (i = 0; i < chaine.length(); i++) { // remplit le tableau de * pour
												// cacher les lettres
			caracach[i] = '*';
		}

		while (caracach.toString().equals(chaine) || nbsc != 0) { // boucle tant
																	// que le
																	// tableau
																	// caracach
																	// n'esp pas
																	// = a la
																	// chaine ou
																	// nbsc
																	// different
																	// de 0

			Scanner sc1 = new Scanner(System.in);
			if (nbsc > 0) {
				if (j == chaine.length()) {
					break;
				}
				System.out.println(" Veuillez saisir un caract�re :");
				repcarac = sc1.nextLine().charAt(0);
			}
			trouve = false;

			for (i = 0; i < chaine.length(); i++) {
				carac = chaine.charAt(i);

				if (carac == repcarac) {
					trouve = true;
					j++;
					caracach[i] = carac;
					if (j == chaine.length()) {
						rep = "gagné";
						System.out.println(rep);
						break;

					}
				}
			}

			if (trouve == false) {
				System.out.println("erreur");
				nbsc--;
			}

			for (int k = 0; k < chaine.length(); k++) {
				System.out.print(caracach[k]);

			}

			if (nbsc == 0) {
				System.out.println("          " + nbsc + " essai donc c'est perdu");
			} else {
				System.out.println("          " + nbsc + " essais");
			}

		}

	}
	public static void sapin_un(int nb) {
		String espace = " ";
		String etoile = "*";
		String ligne = "";
		String pied = "";
		int i = 4, j = 1;
		int cpt = 0;
		int cpt1 = 0;
		int cpt2 = 0;

		for (cpt1 = 0; cpt1 <= nb - 1; cpt1++) { // nbre de tableau choisit en
													// nb
			i = 4;
			j = 1;
			for (cpt = 0; cpt <= 4; cpt++) { // triangle

				ligne = lignebis(i, " ") + lignebis(j, "*") + lignebis(i, " ");
				i--;
				j = j + 2;
				System.out.println(ligne);
			}
		}
		for (cpt2 = 0; cpt2 <= nb - 1; cpt2++) { // pied
			pied = lignebis(2, " ") + lignebis(5, "|") + lignebis(2, " ");
			System.out.println(pied);
		}
	}
	public static String lignebis(int nbcar, String carac) {
		String result = "";
		int i = 0;

		for (i = 0; i <= nbcar - 1; i++) {
			result = result + carac;

		}
		return result;

	}
	public static void sortTab(int tablo[]) {
		int i = 1;
		int j = i - 1;
		int stock;

		for (i = 0; i < tablo.length - 1; i++) {
			for (j = 0; j < tablo.length - 1; j++) {
				if (tablo[j] > tablo[j + 1]) {
					stock = tablo[j];
					tablo[j] = tablo[j + 1];
					tablo[j + 1] = stock;

				}

			}
			
		}
		for (i = 0; i < tablo.length; i++) {
			System.out.print(tablo[i]+" ");
		}
	}
}

