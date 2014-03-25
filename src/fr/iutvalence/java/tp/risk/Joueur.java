package fr.iutvalence.java.tp.risk;

public class Joueur
{
	private final String NomJoueur;
	private final Couleur couleur;
	private Region[] RegionDuJoueur; // est-ce pertinent ?
	
	public Joueur(Couleur couleur, int numeroDuJoueur)
	{
		this.couleur = couleur;
		this.NomJoueur="Joueur"+numeroDuJoueur;
		this.RegionDuJoueur = new Region[50];
		
	}
	
	public Region[] obtenirRegionDuJoueur()
	{
		return this.RegionDuJoueur;
	}
	
	//en travaux
	public void ajouterRegionDuJoueur(Region region)
	{
		this.RegionDuJoueurRegion[region];
	}

	public Couleur obtenirCouleurJoueur()
	{
		return couleur;
	}

	public String obtenirNomJoueur()
	{
		return NomJoueur;
	}
	
}
