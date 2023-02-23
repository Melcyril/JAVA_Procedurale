import java.util.Scanner;

public class Main_jeu_21_difficile {
private static int nb_partie_=0;
	public static void main(String[] args) {
		
		
		
		Scanner sc=new Scanner(System.in);
		String rep="";
		//int i=0;
		System.out.println("Choisissez une 'partie' ou une 'statistique' :");
		
		rep = sc.nextLine();
		if(rep.equals("partie")){
		
		
		do {
			
			Partie p = new Partie();
			
			System.out.println("Voulez-vous jouer encore une partie ('oui' ou 'non') ?");
			rep = sc.nextLine();
			
			p.setNombre_partie_(nb_partie_++);
		} while (rep.equals("oui"));
		System.out.println("========"+nb_partie_);
		
		
		}else if(rep.equals("statistique")){
			Statistique stat_= new Statistique();
		}
		
		
		//Statistique stat_=new Statistique();
	}
		

}
