package fr.iutvalence.java.tp.risk;


/** @package fr.iutvalence.java.tp.risk. 
 * 
 * */

/**
 * Modélisation d'un continent.
 * 
 * @author strategeek et Chevalier-Maxime
 */
public class Continent
{
	/** Nom du continent. */
	public final String nom;
	
	/** Région appartenant au continent. */
	private final Region[] regions;
	
	/**
	 * Retourne un nouveau continent, de composantes données
	 * @param nom le nom de la région à creer. 
	 * @param regions un tableau de région qui compose le continent
	 */	
	public Continent(String nom, Region[] regions)
	{
		this.nom = nom;
		this.regions = regions;
	}

	/**
	 * permet d'obtenir les régions qui compose le continent.
	 * @return un tableau de régions qui compose le continent.
	 */	
	public Region[] ObtenirRegionContinent()
	{
		return this.regions;
	}
}
