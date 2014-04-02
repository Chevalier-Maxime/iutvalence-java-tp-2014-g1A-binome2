package fr.iutvalence.java.tp.risk;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Joueur
{
	private final String nomJoueur;
	private final Couleur couleur;
	private Set<Region> RegionDuJoueur; // est-ce pertinent ?
	
	public Joueur(Couleur couleur, int numeroDuJoueur, Region[] regions)
	{
		this.couleur = couleur;
		this.nomJoueur="Joueur"+numeroDuJoueur;
		this.RegionDuJoueur = new HashSet<Region>(Arrays.asList(regions));
	}
	
	public Region[] obtenirRegionDuJoueur()
	{
		return RegionDuJoueur.toArray(null);
	}
	
	//en travaux
	public void ajouterRegionDuJoueur(Region region)
	{
		this.RegionDuJoueur.add(region);
	}

	public Couleur obtenirCouleurJoueur()
	{
		return couleur;
	}

	public String obtenirNomJoueur()
	{
		return nomJoueur;
	}
}
