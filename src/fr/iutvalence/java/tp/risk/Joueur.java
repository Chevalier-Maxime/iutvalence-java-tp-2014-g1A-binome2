package fr.iutvalence.java.tp.risk;


/**
 * @package fr.iutvalence.java.tp.risk
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


/**
 * Classe permettant de représenter un joueur, et ses principales intéractions
 * avec le systèmes.
 * 
 * @author strategeek et Chevalier-Maxime
 */

public class Joueur
{
	/**
	 * le nom du joueur
	 */
	private final String nomJoueur;
	/**
	 * la couleur du joueur
	 */
	private final Couleur couleur;
	/**
	 * La liste des régions du joueur
	 */
	private Set<Region> RegionDuJoueur;

	/**
	 * Permet de creer un nouveau joueur
	 * 
	 * @param couleur
	 *            La couleur du joueur
	 * @param numeroDuJoueur
	 *            Le numéro du joueur
	 * @param regions
	 *            Le tableau de région appartenant au joueur
	 */
	public Joueur(Couleur couleur, int numeroDuJoueur, Region[] regions)
	{
		this.couleur = couleur;
		this.nomJoueur = "Joueur" + numeroDuJoueur;
		this.RegionDuJoueur = new HashSet<Region>(Arrays.asList(regions));
	}

	/**
	 * Permet d'obtenir le tableau de régions appartenant au joueur
	 * 
	 * @return le tableau de régions appartenant au joueur
	 */
	public Region[] obtenirRegionDuJoueur()
	{
		return RegionDuJoueur.toArray(new Region[RegionDuJoueur.size()]);
	}

	/**
	 * Permet d'ajouter une région au joueur
	 * 
	 * @param region
	 *            Région à ajouter au joueur
	 */
	public void ajouterRegionDuJoueur(Region region)
	{
		this.RegionDuJoueur.add(region);
	}

	/**
	 * Permet d'obtenir la couleur du joueur
	 * 
	 * @return la couleur du joueur
	 */
	public Couleur obtenirCouleurJoueur()
	{
		return couleur;
	}

	/**
	 * Permet d'obtenir le nom du joueur
	 * 
	 * @return le nom du joueur
	 */
	public String obtenirNomJoueur()
	{
		return nomJoueur;
	}

	/**
	 * Permet de placer un nombre d'armée sur les régions appartenant aux
	 * joueurs
	 * 
	 * @param nbArmeeAPlacer
	 *            nombre d'armée total à placer sur les régions du joueur
	 */
	public void placerArmee(int nbArmeeAPlacer)
	{
		Region[] regionduJoueur = obtenirRegionDuJoueur();

		System.out.println("Vos régions sont :");
		for (int i = 0; i < regionduJoueur.length; i++)
		{
			System.out.println(i + " " + regionduJoueur[i].nom
					+ " Nombre d'armee sur la région : "
					+ regionduJoueur[i].nbArmee);
		}

		while (nbArmeeAPlacer != 0)
		{
			System.out.println("Vous devez placer " + nbArmeeAPlacer
					+ " armée(s)");

			Scanner sc = new Scanner(System.in);
			System.out
					.println("Sur quelle région voulez vous poser des troupes (numéro region) ?");
			int numeroRegion = sc.nextInt();

			System.out.println("Combiens d'armée voulez vous placer sur "
					+ regionduJoueur[numeroRegion].nom + " ?");
			int nbArmeeJoueurAPlacer = sc.nextInt();
			regionduJoueur[numeroRegion].ajouterArmee(nbArmeeJoueurAPlacer);

			nbArmeeAPlacer = nbArmeeAPlacer - nbArmeeJoueurAPlacer;
		}
	}

	/**
	 * Calcul le nombre de renforts disponible pour le joueur
	 * 
	 * @param plateau
	 *            le plateau de jeu
	 * @return le nombre de renforts
	 */
	public int nbRenforts(Plateau plateau)
	{
		Continent[] tableauContinent = plateau.obtenirContinents();
		int nbDeRenforts = 0;

		for (int indiceContinentPlateau = 0; indiceContinentPlateau < tableauContinent.length; indiceContinentPlateau++)
		{
			Region[] regionContinent = tableauContinent[indiceContinentPlateau]
					.ObtenirRegionContinent();
			int nbRegionContinent = regionContinent.length;
			int nbRegionDuContinentJoueur = 0;

			for (int indiceRegionContinent = 0; indiceRegionContinent < regionContinent.length; indiceRegionContinent++)
			{
				Region[] RegionDuJoueur = this.obtenirRegionDuJoueur();
				for (int indiceRegionJoueur = 0; indiceRegionJoueur < RegionDuJoueur.length; indiceRegionJoueur++)
				{
					if (RegionDuJoueur[indiceRegionJoueur] == regionContinent[indiceRegionContinent])
						nbRegionDuContinentJoueur++;
				}
			}

			if (nbRegionContinent == nbRegionDuContinentJoueur)
			{
				if (tableauContinent[indiceContinentPlateau].nom == "Afrique")
					nbDeRenforts = nbDeRenforts + 3;
				else if (tableauContinent[indiceContinentPlateau].nom == "Europe")
					nbDeRenforts = nbDeRenforts + 5;
				else if (tableauContinent[indiceContinentPlateau].nom == "Asie")
					nbDeRenforts = nbDeRenforts + 7;
				else if (tableauContinent[indiceContinentPlateau].nom == "Amérique du Nord")
					nbDeRenforts = nbDeRenforts + 5;
				else if (tableauContinent[indiceContinentPlateau].nom == "Amérique du Sud")
					nbDeRenforts = nbDeRenforts + 2;
				else if (tableauContinent[indiceContinentPlateau].nom == "Oceanie")
					nbDeRenforts = nbDeRenforts + 2;

			}
		}

		nbDeRenforts = nbDeRenforts + this.obtenirRegionDuJoueur().length / 3;

		return nbDeRenforts;
	}

}
