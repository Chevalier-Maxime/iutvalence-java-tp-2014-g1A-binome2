package fr.iutvalence.java.tp.risk;

/* TODO Package. */

/**
 * Modélisation d'un continent.
 *
 * @author TODO
 * @version TODO
 */
public class Continent {
    /** Nom du continent. */
    public final String   nom;
    /** Région appartenant au continent. */
    private final Region[] regions;

    public Continent(String nom, Region[] regions) {
        this.nom = nom;
        this.regions = regions;
    }
    
    public Region[] ObtenirRegionContinent()
    {
    	return this.regions;
    }
}
