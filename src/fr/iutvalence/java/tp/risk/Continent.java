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
    private final Region[] appartient;

    public Continent(String nom, Region[] regions) {
        this.nom = nom;
        this.appartient = regions;
    }
}
