package fr.iutvalence.java.tp.risk;


/**
 * @package fr.iutvalence.java.tp.risk
 */
import java.util.Scanner;


/**
 * Permet d'initialiser une partie de risk et de commencer à jouer
 * 
 * @author strategeek et Chevalier-Maxime
 */

public class LanceurDePartieDeRisk
{

	public static void main(String[] args)
	{
		System.out.println("Creation de la partie");
		System.out.println("Combien de joueur voulez vous ?");
		Scanner sc = new Scanner(System.in);
		int nbJoueur = sc.nextInt();
		PartieDeRisk partieDeRisk = new PartieDeRisk(nbJoueur);
		// verifier nb joueur entre 2 et 6
		System.out.println("Démarrage de la partie");
		partieDeRisk.jouer();
		System.out.println("Fin de la partie");

	}

}
