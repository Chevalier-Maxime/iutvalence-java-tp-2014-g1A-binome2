package fr.iutvalence.java.tp.risk;


import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


/**
 * Permet de représenter une région
 * 
 * @author strategeek et Chevalier-Maxime
 */

public class Region
{
	/** Nom de la région. */
	public final String nom;
	/** Taille de l'armée présente. */
	public int nbArmee;
	/* TODO Remplacez par des Collections pour simplifier. */
	/** Voisins de la région. */
	public Region[] voisins;
	/* TODO Où est la classe Joueur ? */
	/** Propriétaire. */
	public Joueur proprietaire;

	/**
	 * Permet de créer une nouvelle région avec un nombre d'armée initial à 1
	 * 
	 * @param nom
	 *            Le nom de la région à creer
	 */
	public Region(String nom)
	{
		this.nom = nom;
		this.nbArmee = 1;
		this.proprietaire = null;
	}

	/**
	 * Permet d'ajouter des voisins à la région
	 * 
	 * @param voisins
	 *            La région voisine à ajouter
	 */
	public void ajouterVoisins(Region[] voisins)
	{
		this.voisins = voisins;
	}

	/**
	 * Permet d'ajouter des armées sur la région
	 * 
	 * @param nbArmeeAAjouter
	 *            le nombre d'armée à ajouter
	 */
	public void ajouterArmee(int nbArmeeAAjouter)
	{
		this.nbArmee = nbArmee + nbArmeeAAjouter;
	}

	/**
	 * Permet d'enlever des armées sur la région
	 * 
	 * @param nombreArmeeAEnlever
	 *            le nombre d'armée à supprimer
	 */
	public void enleverArmee(int nombreArmeeAEnlever)
	{
		this.nbArmee = nbArmee - nombreArmeeAEnlever;

	}

	/**
	 * Permet de voir si une région est voisine d'une autre
	 * 
	 * @param r
	 *            Une région
	 * @return <tt>true</tt> si les deux régions sont voisines, <tt>false</tt>
	 *         sinon
	 */
	public boolean estVoisin(Region r)
	{
		int i = 0;

		while ((r.nom != voisins[i].nom) && (i != voisins.length))
		{
			i++;
		}

		if (!(r.nom == voisins[i].nom))
			return false;
		return true;

	}

	/**
	 * Permet de vérifier si l'attaque avec cette région est possible
	 * 
	 * @param regionDefensive
	 *            la région cible de l'attaque
	 * @return <tt>true</tt> si l'attaque est possible, <tt>false</tt> sinon
	 */
	public boolean attaquePossible(Region regionDefensive)
	{
		if ((this.estVoisin(regionDefensive)) && (this.nbArmee > 1))
			return true;
		return false;
	}

	/**
	 * Permet d'attaquer une région
	 * 
	 * @param regionDefensive
	 *            région cible de l'attaque
	 * @param nbforceAttaque
	 *            Nombre d'armées engagé dans l'attaque (entre 1 et 3)
	 * @param nbforceDefense
	 *            Nombre d'armées engagé dans la défense (entre 1 et 2)
	 * @return <tt>true</tt> si l'attaquant gagne cette attaque, <tt>false</tt>
	 *         sinon
	 */
	public boolean attaquer(Region regionDefensive, int nbforceAttaque,
			int nbforceDefense)
	{
		if (attaquePossible(regionDefensive))
		{

			Integer[] resultatDeAttaque = null;
			resultatDeAttaque = new Integer[3];

			Integer[] resultatDeDefense = null;
			resultatDeDefense = new Integer[2];

			resultatDeAttaque[0] = De.lancer();
			if (nbforceAttaque > 1)
			{
				resultatDeAttaque[1] = De.lancer();
			}
			if (nbforceAttaque > 2)
			{
				resultatDeAttaque[2] = De.lancer();
			}

			// Lancé de dé de defenses
			resultatDeDefense[0] = De.lancer();
			if (nbforceDefense > 1)
			{
				resultatDeDefense[1] = De.lancer();
			}

			// Trions les deux tableaux pour pouvoir les comparer
			Arrays.sort(resultatDeAttaque, 0, resultatDeAttaque.length,
					Collections.reverseOrder());
			Arrays.sort(resultatDeDefense, 0, resultatDeDefense.length,
					Collections.reverseOrder());

			// Traitement du resultat des dés et mise a jour du nbr d'armées sur
			// chaques régions.
			int indiceTableau = 0;
			while ((indiceTableau != resultatDeAttaque.length)
					&& (indiceTableau != resultatDeDefense.length))
			{
				if (resultatDeAttaque[indiceTableau] > resultatDeDefense[indiceTableau])
				{
					if (regionDefensive.nbArmee == 1)
					{
						this.enleverArmee(1);
						regionDefensive.proprietaire = this.proprietaire;

						while (!(this.deplacerArmee(regionDefensive)))
						{

						}

					} else
						regionDefensive.enleverArmee(1);
				} else
				{
					this.enleverArmee(1);
				}
				indiceTableau++;
			}

			return true;

			// TODO Il manque le déplacement en fin de tour si attaquant gagne
		} else
		{
			return false;
		}

	}

	/**
	 * Permet de déplacer des armées d'une région à une autre
	 * 
	 * @param regionSoutenu
	 *            Region qui recoit les armées
	 * @return <tt>true</tt> si le déplacement est possible et effectué,
	 *         <tt>false</tt> sinon
	 */
	private boolean deplacerArmee(Region regionSoutenu)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Combien de troupes voulez vous déplacer ?");
		String i = sc.nextLine();
		int nbTroupesADeplacer;
		nbTroupesADeplacer = Integer.parseInt(i);
		if (this.nbArmee > nbTroupesADeplacer)
		{
			this.nbArmee = this.nbArmee - nbTroupesADeplacer;
			regionSoutenu.nbArmee = regionSoutenu.nbArmee + nbTroupesADeplacer;
			return true;
		} else
			System.out
					.println("Vous ne possedez pas assez d'armée pour cette action ");
		return false;

	}

}
