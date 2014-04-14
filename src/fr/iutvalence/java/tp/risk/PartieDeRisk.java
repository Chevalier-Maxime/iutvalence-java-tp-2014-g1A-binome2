package fr.iutvalence.java.tp.risk;


/**
 * @package fr.iutvalence.java.tp.risk
 */

/**
 * Permet d'initialiser la partie de risk et contient la méthode jouer.
 * 
 * @author strategeek et Chevalier-Maxime
 */

public class PartieDeRisk
{
	/**
	 * le plateau de jeu de la partie
	 */
	private final Plateau plateau;
	/**
	 * Le nombre de joueur de la partie
	 */
	private int nombreDeJoueurs;
	/**
	 * Le contenant la liste des joueurs de la partie
	 */
	private final Joueur[] joueursDeLaPartie;
	/**
	 * Le nombre de renforts à poser lors du premier tour de jeu
	 */
	private final int nbRenfortPremierTour;

	/**
	 * Initialise la partie avec le nombre de joueurs (données) en attribuant à
	 * chaque joueur un nom, une couleur et une liste de régions
	 * 
	 * @param nombreDeJoueurs
	 *            Nombre de joueurs de la partie
	 */
	public PartieDeRisk(int nombreDeJoueurs)
	{
		this.plateau = new Plateau();
		this.nombreDeJoueurs = nombreDeJoueurs;
		this.joueursDeLaPartie = new Joueur[nombreDeJoueurs];

		int[] total = new int[6];

		switch (nombreDeJoueurs)
		{
			case 2:
				total[0] = 21;
				total[1] = 21;
				this.nbRenfortPremierTour = 40;
				break;

			case 3:
				total[0] = 14;
				total[1] = 14;
				total[2] = 14;
				this.nbRenfortPremierTour = 35;
				break;

			case 4:
				total[0] = 10;
				total[1] = 10;
				total[2] = 11;
				total[3] = 11;
				this.nbRenfortPremierTour = 30;
				break;

			case 5:
				total[0] = 8;
				total[1] = 8;
				total[2] = 8;
				total[3] = 9;
				total[4] = 9;
				this.nbRenfortPremierTour = 25;
				break;

			case 6:
				total[0] = 7;
				total[1] = 7;
				total[2] = 7;
				total[3] = 7;
				total[4] = 7;
				total[5] = 7;
				this.nbRenfortPremierTour = 20;
				break;

			default:
				System.out
						.println("Le nombre de joueur doit être compris entre 2 et 6.");
				this.nbRenfortPremierTour = 0;
		}

		for(int numeroDuJoueur = 0; numeroDuJoueur<this.nombreDeJoueurs; numeroDuJoueur++)
		{
			joueursDeLaPartie[numeroDuJoueur] = new Joueur(Couleur.values()[numeroDuJoueur], numeroDuJoueur,plateau.obtenirRegion(total[numeroDuJoueur]));
			Region[] RegionDuJoueur= joueursDeLaPartie[numeroDuJoueur].obtenirRegionDuJoueur();
			
			if(RegionDuJoueur.length==42){
				System.out.println("Felicitation ! le joueur"+joueursDeLaPartie[numeroDuJoueur].obtenirNomJoueur()+"a gagné !") ;
			}
			
		}		
		
	}
	

	/**
	 * Methode principale contenant les differentes étapes du tour de jeu
	 */
	public void jouer()
	{

		System.out.println("...");

		// 1er Tour
		for (int numeroDuJoueur = 0; numeroDuJoueur < this.nombreDeJoueurs; numeroDuJoueur++)
		{
			System.out.println();
			System.out.println("C'est le tour de "
					+ joueursDeLaPartie[numeroDuJoueur].obtenirNomJoueur());
			joueursDeLaPartie[numeroDuJoueur].placerArmee(nbRenfortPremierTour);
			
		}
		
		

	}

}
